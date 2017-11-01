package com.kosta.service.impl;

import com.kosta.service.MemberService;

public class MemberServiceImpl implements MemberService {
	private int no;
	private String name;
	private Integer date;
	
	public MemberServiceImpl(int no) {
		super();
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	@Override
	public String msg() {
		// TODO Auto-generated method stub
		return null;
	}

}
