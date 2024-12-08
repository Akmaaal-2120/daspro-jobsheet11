import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.print(i);
            if(i != num){
                System.out.print("+");
            }
        }
        System.out.println(" = " + SummationRecursive(num) );
    }
    public static int SummationRecursive(int n){
        if(n == 0){
            return 0;
        }else{
            return n+SummationRecursive(n - 1);
        }
    }

}
