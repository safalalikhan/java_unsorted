package com.masai;

public abstract class Evaluation {
	private final int numberOfQuestions;
	public Evaluation(int n) {
		numberOfQuestions = n;
	}
	public Evaluation() {
		numberOfQuestions = 0;
	}
	public abstract void evaluationTiming();
	void printNoOfQuestions() {
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}


}
