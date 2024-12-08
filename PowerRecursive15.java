import java.util.Scanner;

public class PowerRecursive15 {
    static int calculatePower(int base, int pow){
        if (pow==0){
            return 1;
        }else{
            return base*calculatePower(base, pow-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int power = input.nextInt();
        System.out.println("Result of " + base + " power " +power+" = " +
        calculatePower(base, power));
        for(int i = 0; i < power; i++){
            System.out.print(base + "x" );
        }
        System.out.println("1 = " + calculatePower(base, power) );
    }
}
