package com.js.IDao;

import java.util.List;
import java.util.Map;

import com.js.Entity.Pserson;

public interface PersonDaoI {
	//插入
	public void insertPerson(Pserson person);
	public void insertPersonCatchId(Pserson person);
	//删改
	public void deletePersonById(int id);
	public void updatePerson(Pserson person);
	//查询所有
	public List<Pserson> selectAllPersons();
	public Map<String, Pserson> selectAllPersonMap();
	//查询指定的人
	public Pserson selectPersonById(int id);
	public Pserson selectPersonByMap(Map<String, Object> map);
	//模糊查询
	public List<Pserson> selectPersonByName(String name);
}
