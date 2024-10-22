public class Main {
    public static void main(String[] args) {
        Car[] cars;
        int number;
        String carName;
        int carSpeed;
        Race race;

        System.out.println("Давайте отправимся на автогонку \"24 часа Ле-Мана\" - и понаблюдаем за исходом событий!");
        cars = new Car[3];
        for (int i = 0; i < 3; i++) {
            number = i + 1;
            System.out.println("Введите название " + number + "-й машины.");
            CheckInput input = new CheckInput();
            carName = input.checkInputName();
            System.out.println("Введите скорость " + number + "-й машины.");
            carSpeed = input.checkInputSpeed();
            cars[i] = new Car(carName, carSpeed);
            System.out.println("Вы создали автомобиль " + carName + ", который едет со скоростью " + carSpeed + " км/ч");
        }
        race = new Race();
        race.calculate(cars);
        System.out.println("Самая быстрая машина: " + race.nameOfWinner);
        System.out.println("За 24 часа она проехала " + race.bestDistance);
    }
}