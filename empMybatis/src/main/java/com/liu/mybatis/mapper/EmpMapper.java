package com.liu.mybatis.mapper;

import com.liu.mybatis.pojo.Dept;
import com.liu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface EmpMapper {
    int deleteEmp(@Param("id") Integer id);

    public  List<Emp> findAll();


    public Map<String, Object> findById(@Param("empno") Integer empno);

    public List<Map<String, Object>> findAllMap();

    public Map<String,Object> searchDate(@Param("ename") String ename,
                                  @Param("maxHiredate") Date maxHiredate,
                                  @Param("minHiredate") Date minHiredate,
                                  @Param("sal") Integer sal);

}
