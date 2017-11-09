package cn.edu.chd.dao;

import cn.edu.chd.domain.Department;
import cn.edu.chd.domain.Teacher;
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
public class TeacherDaoTest {
    @Autowired
    private TeacherDao teacherDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getAllTeacher() throws Exception {
        List<Teacher> teachers = teacherDao.getAllTeacher();
        for (Teacher teacher :teachers){
            logger.info("教师：{}",teacher);
        }
    }

    @Test
    public void getTeacherById() throws Exception {
        int id = 5;
        Teacher teacher = teacherDao.getTeacherById(id);
        logger.info("教师：{}",teacher);
    }

    @Test
    public void insertTeacher() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setName("测试教师");
        teacher.setGender("男");
        teacher.setBirthday("1998-01-23");
        teacher.setEmail("0132@qq.com");
        teacher.setPassword("12123123");
        teacher.setTitle("教师");
        Department department = new Department();
        department.setId(1);
        teacher.setDepartment(department);
        int result = teacherDao.insertTeacher(teacher);
        logger.info("插入影响的行数:{}", result);
    }

    @Test
    public void updateTeacher() throws Exception {
        Teacher teacher = new Teacher();
        teacher.setId(4);
        teacher.setName("测试教师");
        teacher.setGender("女");
        teacher.setBirthday("2002-01-23");
        teacher.setEmail("1232@qq.com");
        teacher.setPassword("09092");
        teacher.setTitle("助教");
        Department department = new Department();
        department.setId(1);
        teacher.setDepartment(department);
        int result = teacherDao.updateTeacher(teacher);
        logger.info("更新影响的行数:{}", result);
    }

    @Test
    public void deleteTeacher() throws Exception {
        int id = 4;
        int result = teacherDao.deleteTeacher(id);
        logger.info("删除影响的行数:{}", result);

    }

}