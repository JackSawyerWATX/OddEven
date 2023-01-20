import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        int x;
        System.out.print("Enter any number: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if (x % 2 == 0)
            System.out.println("This number is even.");
        else
            System.out.println("This number is odd.");
    }
}