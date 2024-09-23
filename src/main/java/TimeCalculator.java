public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        TimeCalculator timeCalculator = new TimeCalculator();
        double distance = 100;
        double speed = 10;
        double time = timeCalculator.calculateTime(distance, speed);
        System.out.println("Time taken to travel " + distance + " km at " + speed + " km/h is " + time + " hours.");
    }
}

