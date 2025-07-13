package com.wdd.studentmanager.service;

import com.wdd.studentmanager.domain.Admin;

/**
 * @Classname AdminService
 * @Description None
 * @Date 2024/6/25 11:07
 * 
 */
public interface AdminService {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
