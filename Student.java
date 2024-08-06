public class Student 

{
public static int roll_no=10;
public static short scholaship=20000;
public static int  fee=150000;
public static long mob_no=9876543210l;
public static char sec='A';
public static float per=9.5f;
public static double  overAllPer=8.5;
public static String  name="Santosh";
public static String collegeName ="Presidency college";
public static String address ="Bidar";

public static void main(String args[])

{
int  f_Y_TotalFee=150000;
int  s_Y_TotalFee=150000;
int total_fee=f_Y_TotalFee+s_Y_TotalFee;



System.out.println("student roll no"+Student.roll_no);
System.out.println("Student scholaship"+Student.scholaship);
System.out.println("student fee"+Student.fee);
System.out.println("mobno"+Student.mob_no);
System.out.println("section "+Student.sec);
System.out.println("per"+Student.per);
System.out.println("over All Per"+Student.overAllPer);
System.out.println("name"+Student.name);
System.out.println("college Name"+Student.collegeName);
System.out.println("address"+Student.address);
System.out.println("free"+f_Y_TotalFee);
System.out.println("second year fee"+s_Y_TotalFee);
System.out.println("total free"+total_fee);
}
}



