package GroupHW;

public class MarksTest {

	public static void main(String[] args) {
		Marks pA= new A(70, 80, 90);
		double percA= pA.getPercentage();
		System.out.println("The percentage of Marks of Student A : "+percA+" %");
		
		Marks pB= new B(60, 85, 90, 100);
		double percB= pB.getPercentage();
		System.out.println("The percentage of Marks of Student B : "+percB+" %");
		
		
	}  

}
