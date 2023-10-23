package com.liu;

import com.liu.mybatis.mapper.EmpMapper;
import com.liu.mybatis.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.management.MXBean;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;
import java.util.Map;

public class EmpTest {
    SqlSession sqlSession = null;

    @Before
    public void into() throws IOException {
        //读取MyBatis的核心配置文件
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        //创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //通过核心配置文件所对应的字节输入流创建工厂类SqlSessionFactory，生产SqlSession对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都必须手动提交或回滚事
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建SqlSession对象，此时通过SqlSession对象所操作的sql都会自动提交
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @Test
    public void FindAll() {
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配  映射文件中的SQL标签，并执行标签中的SQL语句
        List<Emp> empList = empMapper.findAll();
        for (Emp emp : empList) {
            System.out.println(emp);
        }
    }

    @Test
    public void DeleteEmp() {
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        //调用UserMapper接口中的方法，就可以根据UserMapper的全类名匹配元素文件，通过调用的方法名匹配  映射文件中的SQL标签，并执行标签中的SQL语句
        empMapper.deleteEmp(8015);
        System.out.println("删除成功");
    }


    @Test
    public void findById(){
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Map<String, Object> empMap = empMapper.findById(8000);
        System.out.println(empMap);
    }
    @Test
    public void findAllMap(){
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        List<Map<String, Object>> allMap = empMapper.findAllMap();
        for (Map<String, Object> empMap : allMap) {
            System.out.println(empMap);
        }
    }

    @Test
    public void searchDate(){
        //通过代理模式创建UserMapper接口的代理实现类对象
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        Date minDate = Date.valueOf("1980-01-01");
        Date maxDate = Date.valueOf("1982-01-01");
        Map<String, Object> empMap = empMapper.searchDate("张三", maxDate, minDate, 3000);
        System.out.println(empMap);
    }
}
