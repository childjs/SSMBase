package com.js.Entity;

public class Pserson {
private Integer id;
private String name;
private Integer age;
private String sex;
private Double score;

public Pserson() {
	super();
}
public Pserson(String name, Integer age, String sex, Double score) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.score = score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public Double getScore() {
	return score;
}
public void setScore(Double score) {
	this.score = score;
}
public Integer getId() {
	return id;
}
public void setId(Integer id){
	this.id = id;
}
@Override
public String toString() {
	return "Pserson [ID=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", score=" + score + "]";
}

}
