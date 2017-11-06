package com.ht.chd.dao;

import com.ht.chd.domain.Department;

import java.util.List;

/**
 * 院系模块数据库操作接口
 */
public interface DepartmentDao {
    /**
     * 获取所有院系
     *
     * @return 院系列表
     */
    List<Department> getAllDepartment();

    /**
     * 获取单个院系
     *
     * @param id 院系id
     * @return 所查院系
     */
    Department getDepartmentById(int id);

    /**
     * 添加
     *
     * @param department 添加新的院系
     */
    void InsertDepartment(Department department);

    /**
     * 更新院系
     *
     * @param department 更新院系信息
     */
    void updateDepartment(Department department);

    /**
     * 删除院系
     *
     * @param id 想要删除院系id
     */
    void deleteDepartment(int id);
}
