package com.masai;

public class CodingEvaluation extends Evaluation{

	@Override
	public void evaluationTiming(){
		System.out.println("Evaluation timing is 9:30 to 11:00");
	}
	
	CodingEvaluation(int n){
		super(n);
	}
	CodingEvaluation(){
		super();
	}
}
