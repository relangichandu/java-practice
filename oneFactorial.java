import java.util.Scanner;

public class oneFactorial {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      System.out.println("Enter the number :");
      
      
      int fact = 1;
      
      for(int i=1; i<=num; i++){
       
        fact = fact *i;
      }
       System.out.println("Factorial : " + fact);
      sc.close();   
      
      
    }
}
