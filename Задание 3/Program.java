//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
