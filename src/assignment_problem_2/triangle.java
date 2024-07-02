package assignment_problem_2;

public class triangle extends shape{
	double base;
	double height;
	
	triangle(double base, double height){
		this.base=base;
		this.height=height;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("triangle drawn.");
	}

	@Override
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println(0.5*base*height);
		System.out.println();
	}
}
