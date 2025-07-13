package com.wdd.studentmanager.mapper;

import com.wdd.studentmanager.domain.Attendance;

import java.util.List;
import java.util.Map;

/**
 * @Classname AttendanceMapper
 * @Description None
 * @Date 2024/7/1 15:49
 * 
 */
public interface AttendanceMapper {
    List<Attendance> queryList(Map<String, Object> paramMap);

    Integer queryCount(Map<String, Object> paramMap);

    int addAtendance(Attendance attendance);

    Attendance isAttendance(Attendance attendance);

    int deleteAttendance(Integer id);
}
