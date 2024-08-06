public class Comparison4 {
    public static void main(String[] args) {

    int int_a = 100;
    double double_a = 100.0;
    char char_a = 'A';
    boolean boolean_a =true;
    String string_a = "Presidency";
    float float_a = 55.5f;
    long long_a= 500L;
    short short_a = 25;
    byte byte_a = 5;

        System.out.println("intValue: " + int_a);
        System.out.println("doubleValue: " + double_a);
        System.out.println("charValue: " + char_a);
        System.out.println("booleanValue: " + boolean_a);
        System.out.println("stringValue: " + string_a);
        System.out.println("floatValue: " + float_a);
        System.out.println("longValue: " + long_a);
        System.out.println("shortValue: " + short_a);
        System.out.println("byteValue: " + byte_a);
    
        System.out.println("intValue == 50: " + (int_a == 100));
        System.out.println("doubleValue == 60.5: " + (double_a == 100.0));
        System.out.println("charValue : " + (char_a == 'A'));
        System.out.println("booleanValue == true: " + (boolean_a == true));
        System.out.println("stringValue.equals " +string_a=="Presidency");
        System.out.println("floatValue == 55.5f: " + (float_a == 55.5f));
        System.out.println("longValue == 500L: " +( long_a == 500L));
        System.out.println("shortValue == 25: " +( short_a == 25));
        System.out.println("byteValue == 5: " + (byte_a == 5));
    }

    }

