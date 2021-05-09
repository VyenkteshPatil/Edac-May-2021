import java.util.Scanner;

class a1p2{

public static void main(String args[]){

Scanner num = new Scanner(System.in);
System.out.print("Enter no. 1: ");
int num1 = num.nextInt();

System.out.print("Enter no. 2: ");
int num2 = num.nextInt();

int sum = num1+num2;

System.out.print("Sum is: " +sum);
}
}