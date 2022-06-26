import java.util.Scanner;

public class SquareOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter non-negative number : ");
        int n = scanner.nextInt();
        System.out.println("Square of "+n+" (using recursion) is : "+squareOf(n));
        System.out.println("Square of "+n+" (using normal method) is : "+simpleSquare(n));

    }
    static int simpleSquare(int input)
    {
        return input*input;
    }
    static int squareOf(int input){

        if(input==0)
            return 0;
        else return squareOf(input-1)+(2*input)-1;

    }
}
