public class MyClass{
    
    public static String var1;
    public static int var2;
    public static double var3;
    public static boolean var4;
    public static char var5;
    public static float var6;
    public static long var7;
    public static byte var8;
    public static short var9;

    static {
        var1 = "Initialized String";
        var2 = 100;
        var3 = 99.99;
        var4 = true;
        var5 = 'A';
        var6 = 10.5f;
        var7 = 100000L;
        var8 = 10;
        var9 = 5000;
    }

    public static void main(String[] args) {
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
        System.out.println("var9: " + var9);
    }
}
