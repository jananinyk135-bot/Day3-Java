import java.util.Scanner;
public class operators {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("first number:");
int a = sc.nextInt();
System.out.println("second number:");
int b = sc.nextInt();
System.out.println("Enter operation:");
int operation=sc.nextInt();
switch(operation){
case 1:
System.out.println("addition:" +(a+b));
break;
case 2:
System.out.println("subtraction:" +(a-b));
break;
case 3:
System.out.println("multiplication:" +(a*b));
break;
case 4:
System.out.println("division:" +(a/b));
break;
case 5:
System.out.println("modulus:" +(a%b));
break;
default:
System.out.println("No operation");
}}}
