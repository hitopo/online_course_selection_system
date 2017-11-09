package cn.edu.chd.dao;

import cn.edu.chd.domain.Course;
import cn.edu.chd.domain.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 课程模块数据库操作接口
 */
public interface CourseDao {
    /**
     * 获取所有课程
     * @param page 分页对象
     * @return 课程列表
     */
    List<Course> getAllCourse(Page page);

    /**
     * 根据id获取课程
     *@param  id  参数
     * @return 课程
     */
    Course getCourseById(@Param("id") int id);

    /**
     * 插入课程
     *
     * @param course 参数
     * @return 插入成功与否
     */
    int insertCourse(Course course);

    /**
     * 更新课程
     *
     * @param course 参数
     * @return 更新成功与否
     */
    int updateCourse(Course course);

    /**
     * 删除课程
     *@param id 想要删除课程的id
     * @return 删除成功与否
     */
    int deleteCourse(@Param("id") int id);

    /**
     * 获取记录数
     * @return 总记录数
     */
    int getCount();

}
