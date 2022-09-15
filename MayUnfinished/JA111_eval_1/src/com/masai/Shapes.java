package com.masai;

public class Shapes {

	public void area(Circle circle) {
		System.out.println((circle.radius*circle.radius*22/7));
	}
	public void area(Rectangle rectangle) {
		System.out.println((rectangle.length*rectangle.breadth));
	}
	public void area(Square square) {
		System.out.println((square.side*square.side));
	}
}
