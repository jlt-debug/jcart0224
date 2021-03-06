package io.jlt.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.jlt.jcartadministrationback.dao.AdministratorMapper;
import io.jlt.jcartadministrationback.po.Administrator;
import io.jlt.jcartadministrationback.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorMapper administratorMapper;

    @Override
    public Administrator getByUsername(String username) {
        Administrator administrator = administratorMapper.selectByUsername(username);

        return administrator;
    }

    @Override
    public Administrator getById(Integer administratorId) {
        Administrator administrator = administratorMapper.selectByPrimaryKey(administratorId);

        return administrator;
    }

    @Override
    public void update(Administrator administrator) {
        administratorMapper.updateByPrimaryKeySelective(administrator);
    }

    @Override
    public Integer create(Administrator administrator) {

        administratorMapper.insertSelective(administrator);
        Integer administratorId = administrator.getAdministratorId();

        return administratorId;
    }

    @Override
    public void delete(Integer administratorId) {
        administratorMapper.deleteByPrimaryKey(administratorId);
    }

    @Override
    public void batchDelete(List<Integer> administratorIds) {
        administratorMapper.batchDelete(administratorIds);
    }

    @Override
    public Page<Administrator> getList(Integer pageNum) {

        PageHelper.startPage(pageNum, 10);
        Page<Administrator> page = administratorMapper.selectList();

        return page;
    }
}
