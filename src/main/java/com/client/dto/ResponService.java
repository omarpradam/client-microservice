package com.client.dto;

import org.springframework.stereotype.Component;



@Component
public class ResponService {

	

	private String codeRespon = "";

	private String message = "";

	private Object answer = null;

	public ResponService() {
	}

	public ResponService(String message, String codeRespon, Object answer) {
		super();
		this.codeRespon = codeRespon;
		this.answer = answer;
		this.message = message;
	}

	public String getCodeRespon() {
		return codeRespon;
	}

	public void setCodeRespon(String codeRespon) {
		this.codeRespon = codeRespon;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getAnswer() {
		return answer;
	}

	public void setAnswer(Object answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "RespuestaServicio [codeRespon=" + codeRespon + ", message=" + message + ", answer=" + answer + "]";
	}

}
