import java.util.Scanner;

public class CheckInput {
    Scanner scanner = new Scanner(System.in);
    String carName;
    int carSpeed;
    String cancelInput = "Неправильный ввод. Попробуйте еще раз";

    String checkInputName() {
        while (true) {
            if (!(scanner.hasNextInt())) {
                carName = scanner.next();
                    if (carName.trim().isEmpty()) {
                    System.out.println("Вы ничего не ввели.");
                } else return carName;
            } else {
                System.out.println(cancelInput);
            }
            scanner.next();
        }
    }

    int checkInputSpeed() {
        while (true) {
            if (scanner.hasNextInt()) {
                carSpeed = scanner.nextInt();
                if (carSpeed < 0 || carSpeed > 250) {
                    System.out.println("Введите число, которое больше 0, но меньше или равно 250.");
                } else return carSpeed;
            } else {
                System.out.println(cancelInput);
            }
            scanner.next();
        }
    }
}
