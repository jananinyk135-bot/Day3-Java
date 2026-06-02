import java.util.Scanner;
public class traffic {
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter letter for light:");
/*
String light = sc.next();
switch(light){
case "R":
System.out.println("STOP");
break;
case "Y":
System.out.println("WAIT");
break;
case "G":
System.out.println("GO");
break;
default:
System.out.println("No signal");
}}}
*/
char light = sc.next().charAt(0);
switch(light){
case 'R':
System.out.println("STOP");
break;
case 'Y':
System.out.println("WAIT");
break;
case 'G':
System.out.println("GO");
break;
default:
System.out.println("No signal");
}}}

