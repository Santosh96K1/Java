public class StudentInfoTester
{


public static void main(String[] args) {
        StudentInfo.college();
        StudentInfo.classTeacher();
        StudentInfo.hod();
		StudentInfo.address();
		StudentInfo.university();
		
		int a= StudentInfo.getNumber() ;
		System.out.println(a);
		String str =  StudentInfo.getMsg();
        System.out.println(str);
        double sal= StudentInfo.getSal();
	    System.out.println(sal);
		char c = StudentInfo.city(); 
	    System.out.println(c);

		
		
		
		}
		

        
}
