public class Race {
    int bestDistance;
    String nameOfWinner;
    int distance;

    void calculate(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            distance = cars[i].speed * 24;
            if (i == 0) {
                bestDistance = distance;
                nameOfWinner = cars[i].name;
            } else if (distance > bestDistance) {
                bestDistance = cars[i].speed * 24;
                nameOfWinner = cars[i].name;
            } else return;
        }
    }
}