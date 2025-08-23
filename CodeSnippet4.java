//Demonstrating block scope and variable lifetime in Java
public class CodeSnippet4{
    
    public static void main(String args[]){
       int m=10;{
        int a=20;
        System.out.println(a);
       }
       System.out.println(m);
       
    }
}
