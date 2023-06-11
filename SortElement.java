import java.util.Scanner;
class SortElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i=0;
        System.out.println("Enter no.of Elements you want in array");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        for (int z=0;z<a.length;z++){
            for (int b=z+1;b<a.length;b++){
                int temp=0;
                if(a[z]<=a[b]){
                    temp=a[z];
                    a[z]=a[b];
                    a[b]=temp;
                }
            }
        }
        for (int j:a){
            System.out.println(j+" ");
        }
    }
}