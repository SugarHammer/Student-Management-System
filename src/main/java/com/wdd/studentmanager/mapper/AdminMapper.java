package com.wdd.studentmanager.mapper;

import com.wdd.studentmanager.domain.Admin;
import org.springframework.stereotype.Repository;

/**
 * @Classname UserMapper
 * @Description None
 * @Date 2024/6/24 20:09
 * 
 */
@Repository
public interface AdminMapper {

    Admin findByAdmin(Admin admin);


    int editPswdByAdmin(Admin admin);
}
