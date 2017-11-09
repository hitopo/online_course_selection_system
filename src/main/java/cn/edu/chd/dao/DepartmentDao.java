package cn.edu.chd.dao;

import cn.edu.chd.domain.Page;
import cn.edu.chd.domain.Department;
import org.apache.ibatis.annotations.Param;

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
    List<Department> getAllDepartment(Page page);

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
     * @return 插入影响的行数
     * 1、表示插入成功
     * 0、表示插入失败
     */
    int insertDepartment(Department department);

    /**
     * 更新院系
     *
     * @param department 更新院系信息
     * @return 表示更新影响的行数
     * 1、更新成功
     * 2、更新失败
     */
    int updateDepartment(Department department);

    /**
     * 删除院系
     *
     * @param id 想要删除院系id
     * @return 表示删除影响的行数
     * 1、删除成功
     * 2、删除失败
     */
    int deleteDepartment(@Param("id") int id);

    /**
     * 获取总的记录数
     * @return 总记录数
     */
    int getCount();
}
