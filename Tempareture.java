import java.util.Scanner;
class Tempareture{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        double f=(c*9/5.0)+32;
        System.out.println(f);
    }
}