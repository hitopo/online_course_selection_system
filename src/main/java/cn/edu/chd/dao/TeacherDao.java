package cn.edu.chd.dao;

import cn.edu.chd.domain.Page;
import cn.edu.chd.domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 教师模块数据库操作接口
 */
public interface TeacherDao {
    /**
     * 获取所有教师
     *
     * @return 教师列表
     */
    List<Teacher> getAllTeacher(Page page);

    /**
     * 获取单个教师
     *
     * @param id 教师id
     * @return 所查教师
     */
    Teacher getTeacherById(@Param("id") int id);

    /**
     * 添加
     *
     * @param teacher 添加新的教师
     * @return 插入影响的行数
     * 1、表示插入成功
     * 0、表示插入失败
     */
    int insertTeacher(Teacher teacher);

    /**
     * 更新院系
     *
     * @param teacher 更新教师信息
     * @return 表示更新影响的行数
     * 1、更新成功
     * 2、更新失败
     */
    int updateTeacher(Teacher teacher);

    /**
     * 删除院系
     *
     * @param id 想要删除教师id
     * @return 表示删除影响的行数
     * 1、删除成功
     * 2、删除失败
     */
    int deleteTeacher(@Param("id") int id);

    /**
     * 获取总记录数
     *
     * @return 总记录数
     */
    int getCount();
}
