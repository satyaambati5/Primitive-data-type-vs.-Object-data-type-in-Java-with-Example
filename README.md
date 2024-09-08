Primitive data type vs. Object data type in Java with Examples
Last Updated : 23 Jul, 2024

Data Types in Java 
Every variable in java has a data type. Data types specify the size and type of values that can be stored in an identifier. Java language is rich in its data types. The variety of data types available allow the programmer to select the type appropriate to the need of the application.

In java, data types are classified into two categories:

Primitive Data type or Intrinsic or built-in data type
Non-Primitive Data type or derived  or reference data type
Primitive Data Type: In Java, the primitive data types are the predefined data types of Java. They specify the size and type of any standard values. Java has 8 primitive data types namely byte, short, int, long, float, double, char and boolean. When a primitive data type is stored, it is the stack that the values will be assigned. When a variable is copied then another copy of the variable is created and changes made to the copied variable will not reflect changes in the original variable. Here is a Java program to demonstrate all the primitive data types in Java.

Integer: This group includes byte, short, int, long

byte : It is 1 byte(8-bits) integer data type. Value range from -128 to 127. Default value zero. example: byte b=10;
short : It is 2 bytes(16-bits) integer data type. Value range from -32768 to 32767. Default value zero. example: short s=11;
int : It is 4 bytes(32-bits) integer data type. Value range from -2147483648 to 2147483647. Default value zero. example: int i=10;
long : It is 8 bytes(64-bits) integer data type. Value range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Default value zero. example: long l=100012;
Example:


public class Demo {
    public static void main(String[] args)
    {
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
    }
}

Output
b= 20
s= 20
i= 20
l= 20
Floating-Point Number:

This group includes float, double
float : It is 4 bytes(32-bits) float data type. Default value 0.0f. example: float ff=10.3f;
double: It is 8 bytes(64-bits) float data type. Default value 0.0d. example: double db=11.123;

public class Demo {

    public static void main(String[] args)
    {
        // float type
        float f = 20.25f;
        System.out.println("f= " + f);

        // double type
        double d = 20.25;
        System.out.println("d= " + d);
    }
}

Output
f= 20.25
d= 20.25
Characters: This group represent char, which represent symbols in a character set, like letters and numbers.

char: It is 2 bytes(16-bits) unsigned unicode character. Range 0 to 65,535. 

example: char c=’a’;


public class Demo {
 public static void main(String[] args) {
 
       char ch = 'S';
       System.out.println(ch);
       
       char ch2 = '&';
       System.out.println(ch2);
       
       char ch3 = '$';
       System.out.println(ch3);

   }

}
Output:

S
&
$
Boolean: Boolean type is used when we want to test a particular condition during the execution of the program. There are only two values that a Boolean type can take: true or false. 

Remember, both these words have been declared as keyword. Boolean type is denoted by the keyword Boolean and uses only 1 bit of storage.


public class Demo {

   public static void main(String[] args) {

       boolean t = true;
       System.out.println(t);

       boolean f = false;
       System.out.println(f);

   }}
Output:

true
false
Object Data Type: These are also referred to as Non-primitive or Reference Data Type. They are so-called because they refer to any particular object. Unlike the primitive data types, the non-primitive ones are created by the users in Java. Examples include arrays, strings, classes, interfaces etc. When the reference variables will be stored, the variable will be stored in the stack and the original object will be stored in the heap. In Object data type although two copies will be created they both will point to the same variable in the heap, hence changes made to any variable will reflect the change in both the variables. Here is a Java program to demonstrate arrays(an object data type) in Java.

Difference between the primitive and object data types in Java: 

Now let’s look at a program that demonstrates the difference between the primitive and object data types in Java. 


import java.lang.*;
import java.util.*;

class GeeksForGeeks {
    public static void main(String ar[])
    {
        System.out.println("PRIMITIVE DATA TYPES\n");
        int x = 10;
        int y = x;
        System.out.print("Initially: ");
        System.out.println("x = " + x + ", y = " + y);

        // Here the change in the value of y
        // will not affect the value of x
        y = 30;

        System.out.print("After changing y to 30: ");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(
            "**Only value of y is affected here "
            + "because of Primitive Data Type\n");

        System.out.println("REFERENCE DATA TYPES\n");
        int[] c = { 10, 20, 30, 40 };

        // Here complete reference of c is copied to d
        // and both point to same memory in Heap
        int[] d = c;

        System.out.println("Initially");
        System.out.println("Array c: "
                           + Arrays.toString(c));
        System.out.println("Array d: "
                           + Arrays.toString(d));

        // Modifying the value at
        // index 1 to 50 in array d
        System.out.println("\nModifying the value at "
                           + "index 1 to 50 in array d\n");
        d[1] = 50;

        System.out.println("After modification");
        System.out.println("Array c: "
                           + Arrays.toString(c));
        System.out.println("Array d: "
                           + Arrays.toString(d));
        System.out.println(
            "**Here value of c[1] is also affected "
            + "because of Reference Data Type\n");
    }
}

Output
PRIMITIVE DATA TYPES

Initially: x = 10, y = 10
After changing y to 30: x = 10, y = 30
**Only value of y is affected here because of Primitive Data Type

REFERENCE DATA TYPES

Initially
Array c: [10, 20, 30, 40]
Array d: [10, 20, 30, 40]

Modifying the value at index 1 to 50 in array d

After modification
Array c: [10, 50, 30, 40]
Array d: [10, 50, 30, 40]
**Here value of c[1] is also affected because of Reference Data Type
Let’s look at the difference between the primitive and object data types in a tabular manner as shown below as follows: 

Properties	Primitive data types	Objects
Origin	Pre-defined data types	User-defined data types
Stored structure	Stored in a stack	Reference variable is stored in stack and the original object is stored in heap
When copied	Two different variables is created along with different assignment(only values are same)	Two reference variable is created but both are pointing to the same object on the heap
When changes are made in the copied variable	Change does not reflect in the original ones.	Changes reflected in the original ones if the object is mutable.
Default value	Primitive datatypes do not have null as default value	The default value for the reference variable is null
Example	byte, short, int, long, float, double, char, boolean	array, string class, interface etc.
