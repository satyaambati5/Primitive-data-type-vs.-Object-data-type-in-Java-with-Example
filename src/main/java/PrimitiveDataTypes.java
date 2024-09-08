/*
Primitive Data Type: In Java, the primitive data types are the predefined data types of Java. They specify the size and type of any standard values. Java has 8 primitive data types namely byte, short, int, long, float, double, char and boolean. When a primitive data type is stored, it is the stack that the values will be assigned. When a variable is copied then another copy of the variable is created and changes made to the copied variable will not reflect changes in the original variable. Here is a Java program to demonstrate all the primitive data types in Java.

Integer: This group includes byte, short, int, long

byte : It is 1 byte(8-bits) integer data type. Value range from -128 to 127. Default value zero. example: byte b=10;
short : It is 2 bytes(16-bits) integer data type. Value range from -32768 to 32767. Default value zero. example: short s=11;
int : It is 4 bytes(32-bits) integer data type. Value range from -2147483648 to 2147483647. Default value zero. example: int i=10;
long : It is 8 bytes(64-bits) integer data type. Value range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Default value zero. example: long l=100012;
*/


public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // byte type
        byte b = 20;
        System.out.println("b= " + b);

        // short type
        short s = 20;
        System.out.println("s= " + s);

        // int type
        int i = 20;
        System.out.println("i= " + i);

        // long type
        long l = 20;
        System.out.println("l= " + l);

/*
Floating-Point Number:

This group includes float, double
float : It is 4 bytes(32-bits) float data type. Default value 0.0f. example: float ff=10.3f;
double: It is 8 bytes(64-bits) float data type. Default value 0.0d. example: double db=11.123;

 */


        // float type
        float f = 20.25f;
        System.out.println("f= " + f);

        // double type
        double d = 20.25;
        System.out.println("d= " + d);

        /*Characters: This group represent char, which represent symbols in a character set, like letters and numbers.

char: It is 2 bytes(16-bits) unsigned unicode character. Range 0 to 65,535.

example: char c=’a’;

         */
        char ch = 'S';
        System.out.println(ch);

        char ch2 = '&';
        System.out.println(ch2);

        char ch3 = '$';
        System.out.println(ch3);

    }
}


/*
Output
b= 20
s= 20
i= 20
l= 20
 */


