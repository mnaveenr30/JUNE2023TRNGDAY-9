import java.util.Scanner;
class pattern00{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),i;
        for (i =0;i<=a;i+=1){
            for(int j=i;j<=a;j++){
                System.out.print("#");
            }
            for(int b=0;b<=i;b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}