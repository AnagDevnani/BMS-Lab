import java.util.Scanner;

class Student{
	//basic student details
	String name="Anag", usn="031";
	void display(){
		System.out.println("Name: "+name);
		System.out.println("USN: "+usn);
	}
	
	double GPA(){
		//SGPA variable init
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of subjects: ");
		int no_of_subjects = s.nextInt();
		System.out.print("\n");
		int marks_array[] = new int[no_of_subjects];
		int credits_array[] = new int[no_of_subjects];
		int total_gradepoint = 0;
		int total_credits = 0;
		
		for(int i = 0; i < no_of_subjects; i++){
			//defining the arrays
			System.out.print("Enter the marks of subject "+(i+1)+": ");
			marks_array[i] = s.nextInt();
			System.out.print("Enter the credits of subject "+(i+1)+": ");
			credits_array[i] = s.nextInt();
			
			//performing the calculations
			int marks_weightage;
			if((marks_array[i]<100) && (marks_array[i]>=40)){
				marks_weightage = (marks_array[i]/10) + 1;
			}
			else if (marks_array[i]==100){
			marks_weightage = 10;
			}
			else{
				marks_weightage = 0;
			}
			total_gradepoint += marks_weightage * credits_array[i];
			total_credits += credits_array[i];
		}
		
		return total_gradepoint/total_credits;
	}
		
}

class SGPA{
    public static void main(String[] args){
		System.out.print("Anag Devnani\n1BM23CS031\n");
		Student anag = new Student();
		System.out.println("\n"+anag.GPA());
    }
}
