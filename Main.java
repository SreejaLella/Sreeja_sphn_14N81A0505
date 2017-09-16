
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit

		StudentGroup stGrp=new StudentGroup(5);
		stGrp.add(new Student(1,"Sai", new Date(),50),0);
		stGrp.add(new Student(2,"Sreeja", new Date(),50),1);
		stGrp.add(new Student(3,"Madhukar", new Date(),50),2);
		stGrp.add(new Student(4,"Mounika", new Date(),50),3);
		
		System.out.println(stGrp.getStudents().length);
    
    
	}

}
