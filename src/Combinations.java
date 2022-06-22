import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n : ");
        int n = scanner.nextInt();
        System.out.println("r: ");
        int r = scanner.nextInt();


        System.out.println("Result of Combination of n("+n+") choose r("+r+") is "+combinations(n,r));


    }
    static int combinations(int n, int r){
        if(r==0||r==n)
            return 1;
        else return (combinations(n-1,r-1)+combinations(n-1,r));
    }
}
