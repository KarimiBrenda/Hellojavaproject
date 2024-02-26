public class JavaPrimitives {
    /**
     * Java Primitives
     *
     * Java programming languages provides eight primitive data type namely:
     *
     * 1. boolean (for logical)
     * ii. Char for (textual)
     * III. byte
     * v. int
     * vi. long(integral)
     * vii. double
     * viii. (float floating-point numbers)
     *
     */

    public static void main(String[] args) {

        // 1. Boolean(logical)
        // represents two states that use ->true or false
        // we use the boolean keyword to create a boolean data type in java
        // example:

        boolean isRainning = false;
        boolean isRunning = true;

        System.out.println(isRainning);
        System.out.println(isRunning);

        // 2. Char (Textual) data type
        // represents a single unicode character
        // a character is enclosed in single quotes
        // to create a character data type, we use the char keyword
        char d = 'd';
        char D = 'D';

        // insert a tab -> \t
        System.out.println("\t\tsoftware development");


        // insert a line break -> \n
        System.out.println(" This is a very very long sentence, \nwe have inserted");

        // insert a single quote
        char apostrophe = '\'';
        System.out.println("apostrophe");

        // insert a double quote
        char doubleQuote = '"';
        System.out.println("apostrophe");

        // create a euro pound
        char euroPound = '\u00A3';
        System.out.println(euroPound);

        char thaiBhat = '\u0E3F';
        System.out.println(thaiBhat);

        char infinity = '\u221E';
        System.out.println(infinity);

        // strings ->represents a data type that has multiple unicode
        // it is not a primitive data type
        // it has its literals enclosed in double quotes
        // created using String keyword
        String greetingsMessage = "Hello Everyone!";
        System.out.println(greetingsMessage);

        // 3. Integral data types (byte, short, int and long)
        // examples:
        // 2 (decimal), 077 (octal) and 0x12 (hexadecimal)
        // the default type of integral data types id int
        // For instance, you define a long value of the integer by using capital letter L or l
        // e.g. 10l
        // Byte -> range -128 to 127 -> length 1byte
        // to create a byte data type we use the byte keyword
        byte myByte;
        myByte = 127;

        // short -> range -32768 to 32767 -> length 2bytes
        //to create a short data type, we use short keyword
        short myShort = 32767;

        // integer -> range -2147483648 to 2147483647 -> size 4bytes
        // to create an int data type, use the keyword int
        int myInt;
        myInt = 2147483647;
        System.out.println(myInt);

        // long -> range -9223372036854776 to 9223372036854775 -> size 8bytes
        // to create a long data type, use the keyword long
        long myLong;
        myLong = 9223372036854775L;
        System.out.println(myLong);

        // 7. Floating-point primitive data type(float and double)
        // Floating-point type has double as the default data type
        //Floating-point literals includes either a decimal point or one of the following
        // E or e (exponential values)
        //F or f (float)
        //Examples;
        //3-14 - simple floating-point value
        // 6.02E23 - large floating-point value
        //2.718F - simple float value
        // 123.4E+306D - a large floating value

        //float ->range -> size 4bytes
        //to create a float type, use float keyword
        float myFloat;
        myFloat = 1245667;
        System.out.println(myFloat);

        // 8 double -> range -9223372036854776 to 9223372036854775 -> size 8bytes
        // to create a double data type, use the double keyword
        double myDouble;
        myDouble = 54637387839437746D;
        System.out.println(myDouble);




    }
}
