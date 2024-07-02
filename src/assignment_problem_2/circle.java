package assignment_problem_2;

public class circle extends shape{
	double radius;
	
	circle(double radius){
		this.radius=radius;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle drawn.");
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println(Math.PI*radius*radius);
		System.out.println();
	}
}
