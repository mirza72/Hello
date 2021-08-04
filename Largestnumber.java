import java.util.Scanner;

public class Largestnumber {

    public static void main(String []args) {
    int n,i,j,temp;
    int a[];
    System.out.print("Enter the Nth number :- ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    a = new int[n];
    System.out.print("Enter "+n+" integer :- ");
     
   
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(i=0;i<1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]<a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    System.out.print("The largest number is :- "+a[0]);
}
}
