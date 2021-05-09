import java.util.*;

class a1p6{
public static void main(String args[]){

Scanner num = new Scanner(System.in);
System.out.print("Input first number: ");
byte a = num.nextByte();
System.out.print("Input second number: ");
byte b = num.nextByte();

System.out.println(a+"+"+b+"="+(a+b));
System.out.println(a+"X"+b+"="+(a*b));
System.out.println(a+"-"+b+"="+(a-b));
System.out.println(a+"/"+b+"="+(a/b));
System.out.println(a+"%"+b+"="+(a%b));

}
}
