package com.aaa.service.Impl;

import com.aaa.entity.Departments;
import com.aaa.mapper.DepartmentMapper;
import com.aaa.service.DepartmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public List<Departments> departmentList(Departments departments) {
        return departmentMapper.departmentList(departments);
    }

    @Override
    public int deleteDepartment(Integer departmentId) {
        return departmentMapper.deleteDepartment(departmentId);
    }

    @Override
    public int addDepartment(Departments departments) {
        return departmentMapper.addDepartment(departments);
    }


    @Override
    public int count(Departments departments) {
        return departmentMapper.count(departments);
    }

    @Override
    public int checkCount(Integer departmentId) {
        return departmentMapper.checkCount(departmentId);
    }
}
