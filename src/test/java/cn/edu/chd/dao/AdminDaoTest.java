package cn.edu.chd.dao;

import cn.edu.chd.domain.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AdminDaoTest {
    @Autowired
    private AdminDao adminDao;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void updateAdmin() throws Exception {
        Admin admin = new Admin();
        admin.setName("manager");
        admin.setPassword("000000");
        int result = adminDao.updateAdmin(admin);
        logger.info("更新影响的行数是:{}", result);
    }

}