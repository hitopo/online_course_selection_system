package cn.edu.chd.dao;

import cn.edu.chd.domain.Page;
import cn.edu.chd.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据库学生表dao层接口
 */
public interface StudentDao {
    /**
     * 获取所有学生
     *
     * @return 学生列表
     */
    List<Student> getAllStudent(Page page);

    /**
     * 获取单个学生
     *
     * @param id 学生id
     * @return 所查学生
     */
    Student getStudentById(@Param("id") int id);

    /**
     * 添加
     *
     * @param Student 添加新的学生
     * @return 插入影响的行数
     * 1、表示插入成功
     * 0、表示插入失败
     */
    int insertStudent(Student Student);

    /**
     * 更新院系
     *
     * @param Student 更新学生信息
     * @return 表示更新影响的行数
     * 1、更新成功
     * 2、更新失败
     */
    int updateStudent(Student Student);

    /**
     * 删除院系
     *
     * @param id 想要删除学生id
     * @return 表示删除影响的行数
     * 1、删除成功
     * 2、删除失败
     */
    int deleteStudent(@Param("id") int id);

    /**
     * 获取记录数
     * @return 总记录数
     */
    int getCount();

}
