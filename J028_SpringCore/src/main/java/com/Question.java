package com;

import java.util.List;

public class Question {

	private String question;
	private List<Answer> ans;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	public void displayQAnswer() {
		System.out.println(question);

		for (Answer a : ans) {
			a.displayAnswer();
		}
	}

}
