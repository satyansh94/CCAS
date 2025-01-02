package com.fab.ccas;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Index implements Serializable {

	private String Test;

	public String getTest() {
		return Test;
	}

	public void setTest(String test) {
		this.Test = test;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("In test");
		this.Test="test";
	}
}
