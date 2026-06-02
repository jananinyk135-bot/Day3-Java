import java.util.*;
class sod{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter number:");
int k = sc.nextInt();
int sum=0;
for (int i =1;i<=k;i++){
sum=sum+i;
}
System.out.println("Sum od Digits:"+sum);
int avg = sum/k;
System.out.println("Average:"+avg);
}}

