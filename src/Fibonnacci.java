import java.util.Scanner;

public class Fibonnacci {
    static int Fibonacci(int input){
        if(input==0)
            return 0;
        else if (input==1)
            return 1;
        else return Fibonacci(input-1)+Fibonacci(input-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        int fibonacciOf = input.nextInt();
        System.out.println("Fibonacci of "+fibonacciOf+ " is "+Fibonacci(fibonacciOf));
    }
}
