import java.util.*;

class a1p7{
public static void main(String args[]){

Scanner table = new Scanner(System.in);
System.out.print("Enter multiplication table of: ");
int num = table.nextInt();

System.out.println();
for(int i=1;i<=10;i++){
System.out.println(num+"X"+i+"="+(num*i));

}
}
}