//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
import java.util.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательность скобок: ");
        String bracketString = in.nextLine();
        System.out.printf("Последовательность: %s", Boolean.toString(isValidBrackets(bracketString)));
    }
    private static boolean isValidBrackets(String bracketString) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');

        Deque<Character> stack = new LinkedList<>();
        for (Character c : bracketString.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if(stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
