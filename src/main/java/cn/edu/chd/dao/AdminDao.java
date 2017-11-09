package cn.edu.chd.dao;

import cn.edu.chd.domain.Admin;

/**
 * 管理员模块数据库操作接口
 */
public interface AdminDao {
    /**
     * 更新管理员信息
     * @param admin 参数
     * @return 影响的行数
     * 1、表示更新成功
     * 2、表示更新失败
     */
    int updateAdmin(Admin admin);


}
