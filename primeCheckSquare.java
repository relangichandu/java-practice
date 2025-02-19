import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Enter the number :");
        boolean isPrime= true;
        if(num <=1){
            isPrime= false;
            for(int i= 2; i<=num / 2 ; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                    if(isPrime){
                        System.out.println("is a prime a number");
                    }esle{
                        System.out.println("is not a prime number");
                    }
                    scanner.close();
                    }

                }
            }
        }
