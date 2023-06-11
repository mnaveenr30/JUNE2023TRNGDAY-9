import java.util.*;
import java.lang.*;
class Amstrong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0,res=0,test=a;
while(a>0){
a=a/10;
count++;
}System.out.println(count);
for (int i=0;i>=0;i++){
res+=(Math.pow((a%10),count));
if(a==0) break;
a=a/10;
}
System.out.println(res);
if(res==test) System.out.println("Amstronge");
else System.out.println("Not a Amstronge");
}
}