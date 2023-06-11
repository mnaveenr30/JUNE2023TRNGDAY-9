import java.util.Scanner;
class Factorial_number{
public static int Factorial(int i){
if(i==0) return 1;
else return i*Factorial(i-1);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a =sc.nextInt();
if(a<0) System.out.println("INVALID");
else System.out.println(Factorial(a));
}
} 