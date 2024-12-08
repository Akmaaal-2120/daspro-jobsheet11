import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (PrimeCheckingRecursive(num, num - 1)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static boolean PrimeCheckingRecursive(int n, int div) {
        if (n <= 1) {
            return false;
        }
        if (div == 1) {
            return true;
        }
        if (n % div == 0) {
            return false;
        }else{
            return PrimeCheckingRecursive(n, div - 1);
        }
        
    }
}
