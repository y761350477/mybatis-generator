package com.demo.testmybatis;


import com.demo.testmybatis.dao.TUserMapper;
import com.demo.testmybatis.entity.TUser;
import com.demo.testmybatis.sqlsession.SqlSessionFactoryUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        SqlSession session = SqlSessionFactoryUtil.getSqlSession();//实例化session
        PageHelper.startPage(1, 10);
        TUserMapper t_user = session.getMapper(com.demo.testmybatis.dao.TUserMapper.class); // 获取封装的映射信息
        List<TUser> tUsers = t_user.selectByExample(null);
        PageInfo<TUser> userListPageInfo = new PageInfo<>(tUsers);
        System.out.println("获取总页数:\t" + userListPageInfo.getTotal());
        int i = 0;
        for (TUser tUser : tUsers) {
            System.out.println(tUser.gettName() + ", " + (++i));
        }

    }
}
