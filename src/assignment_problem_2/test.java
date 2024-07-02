package assignment_problem_2;

public class test {
	public static void main(String [] args) {
		shape c=new circle(10.0); // circle's radius
		shape s=new square(7.0); // square's side
		shape t=new triangle(5.0, 6.0); // triangle's base, height
		
		c.draw();
		c.calculateArea();
		
		s.draw();
		s.calculateArea();
		
		t.draw();
		t.calculateArea();
	}
}
