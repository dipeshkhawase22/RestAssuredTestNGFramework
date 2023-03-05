package com.spotify.oauth2.api;

public enum StatusCode {
	CODE_200(200, ""),
	CODE_201(201, "");
	
	public final int code;
	public final String msg;

	StatusCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	/*public int getCode() {
		return code;
	}
	
	public String getmsg() {
		return msg;
	}*/
}
