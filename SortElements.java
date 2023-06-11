import java.util.Scanner;
import java.util.Arrays;
class SortElements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i=0;
        System.out.println("Enter no.of Elements you want in array");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        Arrays.sort(a);
        for (int j:a){
            System.out.println(j+" ");
        }
    }
}