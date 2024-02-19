package com.spring.service;

import com.spring.entity.Department;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public interface DepartmentService {
   public Department saveDepartment(Department department);
    public List<Department> fetchDepartmentList();
    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);
    Department fetchDepartmentByName(String departmentName);


}
