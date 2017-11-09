package cn.edu.chd.dao;

import cn.edu.chd.domain.Department;
import cn.edu.chd.domain.Student;
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
public class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void getAllStudent() throws Exception {
        List<Student> students = studentDao.getAllStudent();
        logger.info("学生：{}",students);
    }

    @Test
    public void getStudentById() throws Exception {
        int id = 1;
        Student student = studentDao.getStudentById(id);
        logger.info("学生：{}",student);
    }

    @Test
    public void insertStudent() throws Exception {
        Student student = new Student();
        student.setName("张三");
        student.setGender("男");
        student.setBirthday("1999-12-04");
        student.setEmail("2938912@qq.com");
        student.setPassword("000000");
        Department department = new Department();
        department.setId(1);
        student.setDepartment(department);
        int result = studentDao.insertStudent(student);
        logger.info("插入影响的行数:{}", result);
    }

    @Test
    public void updateStudent() throws Exception {
        Student student = new Student();
        student.setId(2);
        student.setName("奥斯丁");
        student.setGender("男");
        student.setBirthday("2012-12-04");
        student.setEmail("2asd2@126.com");
        student.setPassword("qweqwe");
        Department department = new Department();
        department.setId(1);
        student.setDepartment(department);
        int result = studentDao.updateStudent(student);
        logger.info("更新影响的行数:{}", result);

    }
    @Test
    public void deleteStudent() throws Exception {
        int id= 1;
        int result = studentDao.deleteStudent(id);
        logger.info("删除影响的行数：{}",result);
    }

}