//TYPECASTING--
import java.util.Scanner;
public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num =input.nextFloat();
//        System.out.println(num);
        // you can take integer value as input in above
//        int num = input.nextInt();
//        System.out.println(num);
        // you can't take float value as input in above

        //integer value can be converted to float, but float value won't convert into integer as float is bigger than integer.

        // TYPE CASTING explictly telling to print floatt value in integer type.

//       float num = input.nextFloat();
//       int i = (int)num;
//        System.out.println("before conversion-" +num);
//        System.out.println("after conversion-" +i);
//OR
//        int num = (int)(69.69f);
//        System.out.println(num);


        // Automatic type conversion in expressions
        int a = 257;
        byte b = (byte)(a);
        // max value store in byte is 256, therefore it prints the difference of 257 and 256 i.e is 1.
        System.out.println(b);

        int 




    }
}
