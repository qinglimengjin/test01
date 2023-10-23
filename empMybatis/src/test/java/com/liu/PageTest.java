package com.liu;

import com.liu.mybatis.mapper.TopicMapper;
import com.liu.mybatis.mapper.UserMapper;

import com.liu.mybatis.pojo.User;
import com.liu.mybatis.pojo.UserExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageTest {
    SqlSession sqlSession = null;
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void into() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @Test
    public void SqlSessionTest01() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Object u1 = sqlSession.selectOne("com.liu.mybatis.mapper.TopicMapper.selectByPrimaryKey", 1);
        System.out.println("u1 = " + u1);
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        Object u2 = sqlSession2.selectOne("com.liu.mybatis.mapper.TopicMapper.selectByPrimaryKey", 1);
        System.out.println("u2 = " + u2);
    }

    @Test
    public void SqlSessionTest02() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNicknameEqualTo("火云邪神");
        List<User> userList = userMapper.selectByExample(userExample);
        System.out.println(userList.get(0));

        UserExample userExample1 = new UserExample();
        UserExample.Criteria criteria1 = userExample1.createCriteria();
        criteria1.andTruenameEqualTo("你好");
        List<User> userList1 = userMapper.selectByExample(userExample1);
        System.out.println(userList1.get(0));
    }

    @Test
    public void SqlSessionTest03() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println("user = " + user);
        user.setTruename("hello world");
        userMapper.updateByPrimaryKey(user);
        User user1 = userMapper.selectByPrimaryKey(1);
        System.out.println("user1 = " + user1);
    }

    @Test
    public void SqlSessionTest04() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNicknameLike("%小%");
        List<User> userList = userMapper.selectByExample(userExample);
        for (User user : userList) {
            System.out.println("user = " + user);
        }
    }

    @Test
    public void SqlSessionTest05() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        Object u1 = sqlSession1.selectOne("com.liu.mybatis.mapper.UserMapper.selectByPrimaryKey", 1);
        System.out.println("u1 = " + u1);
        sqlSession1.close();
        Object u2 = sqlSession2.selectOne("com.liu.mybatis.mapper.UserMapper.selectByPrimaryKey", 1);
        System.out.println("u2 = " + u2);
    }

    @Test
    public void SqlSessionTest06() throws InterruptedException {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andNicknameLike("%小%");
        Object u1 = sqlSession1.selectList("com.liu.mybatis.mapper.UserMapper.selectByExample", userExample);
        System.out.println("u1 = " + u1);
        sqlSession1.close();
        System.out.println(sqlSession2.selectList("com.liu.mybatis.mapper.UserMapper.selectByExample", userExample));
        Thread.sleep(4000);
    }
}
