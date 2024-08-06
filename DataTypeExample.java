public class DataTy_Ex {
    public static void main(String[] args) {
        int intVar = 10;
        double doubleVar = 20.5;
        float floatVar = 15.3f;
        char charVar = 'A';
        boolean boolVar = true;
        long longVar = 123456789L;
        short shortVar = 32000;
        byte byteVar = 100;
        int age = 25;
        if (age >= 18) {
            System.out.println("Integer Variable: " + intVar);
            System.out.println("Double Variable: " + doubleVar);
            System.out.println("Float Variable: " + floatVar);
            System.out.println("Char Variable: " + charVar);
            System.out.println("Boolean Variable: " + boolVar);
            System.out.println("Long Variable: " + longVar);
            System.out.println("Short Variable: " + shortVar);
            System.out.println("Byte Variable: " + byteVar);
            System.out.println("Age Variable: " + age);
        } else {
            System.out.println("Age is less than 18, no variables displayed.");
        }
    }
}
