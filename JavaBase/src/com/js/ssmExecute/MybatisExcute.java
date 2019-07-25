package com.js.ssmExecute;

import org.junit.Test;

import com.js.DaoImpl.PersonDaoImpl;
import com.js.Entity.Pserson;
import com.js.IDao.PersonDaoI;

public class MybatisExcute {
	@Test
	public void selectPer(){
		PersonDaoI dao = new PersonDaoImpl();
		Pserson person = new Pserson("tony", 20, "男", 98.5);
		dao.selectPerson(person);
	}
}
