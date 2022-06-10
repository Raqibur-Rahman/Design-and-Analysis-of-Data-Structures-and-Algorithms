import java.util.Scanner;


public class GCD {

    static  int calculateGCD(int i, int j){
        while (i!=j){
            if(i>j)
                i=i-j;
            else j = j-i;
        }
        return i ;


    }
    public static void main(String[] args) {

        int firstInput, secondInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers to calculate their GCD.");
        System.out.print("1st Number:");
        firstInput = input.nextInt();

        System.out.print("2nd Number:");
        secondInput = input.nextInt();

        System.out.println("GCD of "+firstInput+" and "+secondInput+" is "
                +calculateGCD(firstInput,secondInput)+".\nThank you!");


    }

}