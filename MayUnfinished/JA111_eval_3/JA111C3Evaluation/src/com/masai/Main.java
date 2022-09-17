package com.masai;

public class Main {
	public static void main(String[] args) {
		messageToStudents(new DsaEvaluation(5));
		messageToStudents(new CodingEvaluation(4));
		}
	public static void messageToStudents(Evaluation evaluation) {
		if(evaluation instanceof DsaEvaluation)System.out.println("Its a DSA Evaluation");
		else if (evaluation instanceof CodingEvaluation)System.out.println("Its a Coding Evaluation");
		else {
			System.out.println("Try Again");
			return;
		}
		evaluation.printNoOfQuestions();
		evaluation.evaluationTiming();
		System.out.println("================================================================");
		
	}


}
