package com.masaij10;

public class Shape {
	public int rectangleArea(int length, int breadth) {
		return length*breadth;
	};
	public int squareArea(int side) {
		return side*side;
	};
	public int circleArea(int radius) {
		return (22/7*radius*radius);
	};
}
