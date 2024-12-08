import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Using Recursive Method:");
        System.out.println(DescendingSequenceRecursive(num));

        System.out.println("Using Iterative Method:");
        DescendingSequenceIterative(num);
    }
    public static int DescendingSequenceRecursive(int n){
        if (n == 0){
            return 0;
        }else{
            System.out.println(n + " ");
            return DescendingSequenceRecursive(n - 1);
        }
    }
    public static void DescendingSequenceIterative(int n){
        for(int i = n; i >= 0; i--){
            System.out.println(i + " ");
        }
    }
}
