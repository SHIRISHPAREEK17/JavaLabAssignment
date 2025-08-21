import java.util.Scanner;
class Pattern1{
    public static void main(String args[]){
        int n;
        System.out.print("Enter Number: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(n);
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i*2-1;j++){
                if(j==1 || j==i*2-1)
                  System.out.print("1");
                else 
                  System.out.print("0");
            }
            System.out.println();
        }
     
    }
}