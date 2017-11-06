package com.ht.chd.dao;

import com.ht.chd.domain.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 院系模块数据库操作接口
 */
//todo 增删改操作应该返回int，表示影响的行数，进而通知service层操作是否成功，
//todo    service决定返回什么数据给浏览器
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
    Department getDepartmentById(@Param("id") int id);

    /**
     * 添加
     *
     * @param department 添加新的院系
     */
    void insertDepartment(Department department);

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
    void deleteDepartment(@Param("id") int id);
}
