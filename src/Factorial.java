import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int factorialOf;
        System.out.print("Enter number : ");
        factorialOf = input.nextInt();
        System.out.println("Factorial of "+ factorialOf+" is "+factorial(factorialOf));

        /*
        result of iterative way
        System.out.println("Factorial of "+ factorialOf + " is "+
                factorialD(factorialOf));
        System.out.println("Factorial of "+ factorialOf + " is "+
                factorialA(factorialOf));
         */
    }
    static int factorial (int input){
        if(input==0)
            return 1;
        else return  (input*factorial(input-1));
    }
       /*
    iterative way
    static int factorialD (int input){

        int result = 1;
        for (int i = input; i>=1; i--){
            result = result*i;
        }
        return result;
    }
    static int factorialA (int input){
        int result = 1;
        for (int i = 1; i<=input; i++){
            result = result*i;
        }
        return result;
    }
     */
}