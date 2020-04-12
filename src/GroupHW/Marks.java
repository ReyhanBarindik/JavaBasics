package GroupHW;

public abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects by student A and by student B. 
	//Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks. 
	//Provide implementation of abstract method in classes ‘A’ and ‘B’. 
	//The constructor of student A takes the marks in three subjects as its parameters and 
	//the marks in four subjects as its parameters for student B.Test your code
	
	public abstract double getPercentage();
}
class A extends Marks {
	double mathMark;
	double scienceMark;
	double historyMark;
	A (double mathMark, double scienceMark, double historyMark) {
		this.mathMark=mathMark;
		this.scienceMark=scienceMark;
		this.historyMark=historyMark;
		
	}
	public double getPercentage() {
		double P=(100*(mathMark+scienceMark+historyMark)/300);
		return P;
	}
}
class B extends Marks {
	double mathMark;
	double scienceMark;
	double historyMark;
	double artMark;
	B (double mathMark, double scienceMark, double historyMark, double artMark) {
		this.mathMark=mathMark;
		this.scienceMark=scienceMark;
		this.historyMark=historyMark;
	    this.artMark=artMark;
}
	public double getPercentage() {
		double P= (100*(mathMark+scienceMark+historyMark+artMark))/400;
		return P;
}
}
