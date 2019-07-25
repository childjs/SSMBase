package com.js.DaoImpl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.js.Entity.Pserson;
import com.js.IDao.PersonDaoI;

public class PersonDaoImpl implements PersonDaoI {
	private SqlSession session;

	@Override
	public void selectPerson(Pserson person) {
		try {
			/*1.读取主配置文件*/
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			/*2.创建SqlSessionFactory对象*/
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//创建sqlSession对象
			session = sqlSessionFactory.openSession();
			//操作
			session.insert("insertPer", person);
			//通过事务提交
			session.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
