package com.ht.chd.dao;

import com.ht.chd.domain.Department;
import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//配置spring和junit整合
//junit启动时加载springIoc容器
@RunWith(SpringJUnit4ClassRunner.class)
//配置spring配置文件目录
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class DepartmentDaoTest {
    //日志输出
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DepartmentDao departmentDao;
    @Test
    public void getAllDepartment() throws Exception {
        List<Department> departments = departmentDao.getAllDepartment();
        for (Department department :departments) {
            logger.info("院系:{}",department);
        }
    }

    @Test
    public void getDepartmentById() throws Exception {
        int id = 1;
        Department department = departmentDao.getDepartmentById(id);
        logger.info("院系:{}",department);
    }

    @Test
    public void insertDepartment() throws Exception {
        Department department = new Department();
        department.setName("汽车学院");
        department.setPhone("19029863468");
        department.setDescription("汽车学院是最好的学院");
        departmentDao.insertDepartment(department);
    }

    @Test
    public void updateDepartment() throws Exception {
        Department department = new Department();
        department.setName("汽车学院");
        department.setPhone("19029863468");
        department.setDescription("汽车学院牛批");
        departmentDao.updateDepartment(department);
    }

    @Test
    public void deleteDepartment() throws Exception {
        int id = 1;
        departmentDao.deleteDepartment(id);
    }

}