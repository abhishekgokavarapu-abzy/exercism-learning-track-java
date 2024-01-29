public class CarsAssemble {
    private final double carsProducedPerHourAtLowSpeed = 221;
    private final double successRateAt5To8Speed = 0.9;
    private final double successRateAt9Speed = 0.8;
    private final double successRateAt10Speed = 0.77;

    public double productionRatePerHour(int speed) {
        double finalValue = 0;
        if (validateSpeed(speed)) {
             if (speed > 4 && speed <= 8) {
                finalValue = speed * carsProducedPerHourAtLowSpeed * successRateAt5To8Speed;
            } else if (speed == 9) {
                finalValue = speed * carsProducedPerHourAtLowSpeed * successRateAt9Speed;
            } else if (speed == 10) {
                finalValue = speed * carsProducedPerHourAtLowSpeed * successRateAt10Speed;
            } else {
                finalValue = speed * carsProducedPerHourAtLowSpeed;
            }
        }
        return finalValue;
    }

    public int workingItemsPerMinute(int speed) {
        int finalValue = 0;
        if (validateSpeed(speed)) {
            int minutesPerHour = 60;
            if (speed > 4 && speed <= 8) {
                finalValue = (int)
                        (((speed * carsProducedPerHourAtLowSpeed) / minutesPerHour)
                                * successRateAt5To8Speed);
            } else if (speed == 9) {
                finalValue = (int) (((speed * carsProducedPerHourAtLowSpeed) / minutesPerHour)
                        * successRateAt9Speed);
            } else if (speed == 10) {
                finalValue = (int) (((speed * carsProducedPerHourAtLowSpeed) / minutesPerHour)
                        * successRateAt10Speed);
            } else {
                finalValue = (int) ((speed * carsProducedPerHourAtLowSpeed) / minutesPerHour);
            }
        }
        return finalValue;
    }

    private boolean validateSpeed(int speed) {
        return (speed > 0 && speed <= 10);
    }
}