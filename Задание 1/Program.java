//Составить алгоритм: если введенное число больше 7, то вывести “Привет”
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        if(num > 7) {
            System.out.print("Привет");
        }
    }
}
