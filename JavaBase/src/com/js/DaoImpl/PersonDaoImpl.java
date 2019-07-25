package com.js.DaoImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.js.Entity.Pserson;
import com.js.IDao.PersonDaoI;
import com.js.Utils.MyBatisUtils;

public class PersonDaoImpl implements PersonDaoI {
	private SqlSession session;

	@Override
	public void insertPerson(Pserson person) {
		try {
			
			//创建sqlSession对象
			session = MyBatisUtils.getSession();
			//操作
			session.insert("insertPer", person);
			//通过事务提交
			session.commit();
		}finally {
			if (session != null){
				session.close();
			}
		}
	}

	@Override
	public void insertPersonCatchId(Pserson person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePersonById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePerson(Pserson person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pserson> selectAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Pserson> selectAllPersonMap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pserson selectPersonById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pserson selectPersonByMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pserson> selectPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
