package com.demo.testmybatis;

import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        SqlSession session = SqlSessionFactoryUtil.getSqlSession();//实例化session
        // 获取班级信息 Created by admin.
        TUserMapper t_user = session.getMapper(com.demo.testmybatis.TUserMapper.class); // 获取封装的映射信息
        List<TUser> tUsers = t_user.selectByExample(null);
        for (TUser tUser : tUsers) {
            System.out.println(tUser.gettName());
        }

    }
}
