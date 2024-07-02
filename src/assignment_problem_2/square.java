package assignment_problem_2;

public class square extends shape{
	double side;
	
	square(double side){
		this.side=side;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square drawn.");
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println(side*side);
		System.out.println();
	}
}
