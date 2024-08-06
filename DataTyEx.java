public class DataTyEx {
    public static void main(String[] args) {
        int intVar = 10;
        double d_Var = 20.5;
        float f_Var = 15.3f;
        char c_Var = 'A';
        boolean b1_Var = true;
        long l_Var = 123456789l;
        short s_Var = 32000;
        byte b_Var = 100;
        int age = 25;
        if (age >= 18) {
            System.out.println("Integer Variable: " + intVar);
            System.out.println("Double Variable: " + d_Var);
            System.out.println("Float Variable: " + f_Var);
            System.out.println("Char Variable: " + c_Var);
            System.out.println("Boolean Variable: " + b1_Var);
            System.out.println("Long Variable: " + l_Var);
            System.out.println("Short Variable: " + s_Var);
            System.out.println("Byte Variable: " + b_Var);
            System.out.println("Age Variable: " + age);
        } else {
            System.out.println("Age is less than 18, no variables displayed.");
        }
    }
}
