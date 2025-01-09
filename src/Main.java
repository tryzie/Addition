import  java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter the numbers you want to add");

        double x =myNum.nextDouble();
        double y =myNum.nextDouble();
        double z = x+y;

        System.out.println(x + " + " +  y +" = " + z);

    }
}