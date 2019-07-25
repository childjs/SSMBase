package com.js.Utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory factory;
	public static SqlSession getSession(){
		if (factory == null){
			try {
				/*1.读取主配置文件*/
				InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
				/*2.创建SqlSessionFactory对象*/
				factory = new SqlSessionFactoryBuilder().build(inputStream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return factory.openSession();
	}
}
