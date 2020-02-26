package com.jlt.jcart.adminstration.back.controller;

import com.jlt.jcart.adminstration.back.constant.ClientExceptionConstant;
import com.jlt.jcart.adminstration.back.exception.ClientException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/image")
public class ImageController {

    private List<String> imageExts= Arrays.asList("jpg","jpeg","png");

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file) throws ClientException, IOException {
        String originalFilename = file.getOriginalFilename();
        String[] split = originalFilename.split("\\.");
        String ext = split[split.length - 1];
        ext = ext.toLowerCase();

        boolean contains = imageExts.contains(ext);
        if(!contains){
            throw new ClientException(ClientExceptionConstant.IMAGE_INVALID_ERRCODE,ClientExceptionConstant.IMAGE_INVALID_ERRMSG);
        }
        String uuid = UUID.randomUUID().toString();
        String filename = String.format("%s.%s", uuid, ext);
        String filepath = String.format("www/image/%s", filename);
        FileOutputStream fileOutputStream = new FileOutputStream(filepath);
        byte[] bytes = file.getBytes();
        fileOutputStream.write(bytes);


        return filename;
    }


}
