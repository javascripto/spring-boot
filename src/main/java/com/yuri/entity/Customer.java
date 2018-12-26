package com.yuri.entity;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Customer {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Integer age;
	
	public Customer() {}
	
	public Customer(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public Customer setId(long id) {
		this.id = id;
		return this;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Customer setName(String name) {
		this.name = name;
		return this;
	}
	
	public Integer getAge() {
		return this.age;
	}
	
	public Customer setAge(Integer age) {
		this.age = age;
		return this;
	}
}
