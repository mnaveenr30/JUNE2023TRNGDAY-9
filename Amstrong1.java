import java.util.*;
class Amstrong1{
public static int lenDigit(int n){
int len=0;
while(n>0) len++;n/=10;
return len;
}
public static boolean checkAmstrong(final int n){
int sum=0;
int exp=lenDigit(n);
int num=n;
while(num>0){
sum+=Math.pow((num%10),exp);
num/=10;
} 
return n==sum;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int inputNum=sc.nextInt();
if(checkAmstrong(inputNum)) {System.out.println("Amstrong");}
else System.out.println("Not a Amstrong");
}
}