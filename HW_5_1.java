import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Реализуйте структуру телефонной книги с помощью HashMap,
 учитывая, что 1 человек может иметь несколько телефоновю
 */
public class HW_5_1 {
    public static void main(String[] args) {

        Map<Integer, String> per = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Введите номер телефона и Фамилию: ");
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            per.put(Integer.parseInt(arr[0]), arr[1]);
            }

        System.out.println("Вся карта:");
        for (var el : per.entrySet()) {
            System.out.println(el.getKey() + " " + el.getValue());
        }
        sc.close();
    }
}