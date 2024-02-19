package com.spring.service;

import com.spring.entity.Department;
import com.spring.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService
{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList()
    {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    public void deleteDepartmentById(Long departmentId)
    {
        departmentRepository.deleteById(departmentId);
    }

   public Department updateDepartment(Long departmentId, Department department)
{
    Department depDB = departmentRepository.findById(departmentId).get();

    if(Objects.nonNull(department.getDepartmentName()) &&
    !"".equalsIgnoreCase(department.getDepartmentName()))
    {
        depDB.setDepartmentName(department.getDepartmentName());
    }
    if(Objects.nonNull(department.getDepartmentCode()) &&
            !"".equalsIgnoreCase(department.getDepartmentCode()))
    {
        depDB.setDepartmentCode(department.getDepartmentCode());
    }
    if(Objects.nonNull(department.getDepartmentAddress()) &&
            !"".equalsIgnoreCase(department.getDepartmentAddress()))
    {
        depDB.setDepartmentAddress(department.getDepartmentAddress());
    }

    return departmentRepository.save(depDB);
}

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }

}
