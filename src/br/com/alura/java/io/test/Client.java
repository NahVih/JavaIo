package br.com.alura.java.io.test;

import java.io.Serializable;

public class Client implements Serializable{

	private static final long serialVersionUID = 6258464036237868467L;
	
	private String name;
	private String tfn;
	private String job;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTfn() {
		return tfn;
	}

	public void setTfn(String tfn) {
		this.tfn = tfn;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
