package com.crud.sqlserver.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.sqlserver.model.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	private EntityManager em;
	
//	@Override
//	public String toString() {
//		return "EmployeeDao [em=" + em + "]";
//	}
//
//	public EmployeeDao() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public EmployeeDao(EntityManager em) {
//		super();
//		this.em = em;
//	}
//
//	public EntityManager getEm() {
//		return em;
//	}
//
//	public void setEm(EntityManager em) {
//		this.em = em;
//	}

	@SuppressWarnings("unchecked")
	public List<Employee> getFullName(){
		return em.createNamedStoredProcedureQuery("fullName").getResultList();
	}
}
