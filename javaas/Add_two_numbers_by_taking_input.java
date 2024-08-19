import java.util.Scanner;
public class Add_two_numbers_by_taking_input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers");
        a = obj.nextInt();
        b = obj.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}