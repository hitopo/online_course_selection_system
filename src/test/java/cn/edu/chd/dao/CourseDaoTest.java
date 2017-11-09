package cn.edu.chd.dao;

import cn.edu.chd.domain.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CourseDaoTest {
    @Autowired
    private CourseDao courseDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void getAllCourse() throws Exception {
        List<Course> courses  = courseDao.getAllCourse();
        logger.info("课程列表为：{}",courses);
    }

    @Test
    public void getCourseById() throws Exception {
        int id = 1;
        Course course = courseDao.getCourseById(id);
        logger.info("课程：{}",course);
    }

    @Test
    public void insertCourse() throws Exception {
        Course course = new Course();
        course.setName("Java");
        course.setHour(45);
        course.setCredit(4.5f);
        course.setDescription("Java是一门编程语言");
        int result = courseDao.insertCourse(course);
        logger.info("插入影响的行数:{}",result);
    }

    @Test
    public void updateCourse() throws Exception {
        Course course = new Course();
        course.setId(2);
        course.setName("微机接口");
        course.setHour(60);
        course.setCredit(5);
        course.setDescription("微机接口很重要");
        int result = courseDao.updateCourse(course);
        logger.info("更新影响的行数:{}",result);
    }

    @Test
    public void deleteCourse() throws Exception {
        int id = 3;
        int result = courseDao.deleteCourse(id);
        logger.info("删除影响的行数：{}",result);
    }

}