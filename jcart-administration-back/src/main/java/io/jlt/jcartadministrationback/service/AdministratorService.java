package io.jlt.jcartadministrationback.service;

import io.jlt.jcartadministrationback.po.Administrator;

public interface AdministratorService {

    Administrator getByUsername(String username);

    Administrator getById(Integer administratorId);

    void update(Administrator administrator);
}
