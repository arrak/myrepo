package com.arrak.exam.business_model;

public class QuestionModel {
	String _question;
	
	public String getQuestion(){
		return _question;
	}
	public void setQuestion(String value){
		_question = value;
	}
	
	public QuestionModel(String question){
		_question = question;
	}
}
