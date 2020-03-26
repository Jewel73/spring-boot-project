package com.example.demo;

public class Response {
	
	private String msg;
	private int statuscod;
	


	public Response(String msg2, int statuscod2) {
		super();
		this.msg = msg2;
		this.statuscod = statuscod2;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStatuscod() {
		return statuscod;
	}

	public void setStatuscod(int statuscod) {
		this.statuscod = statuscod;
	}
	
	
	

}
