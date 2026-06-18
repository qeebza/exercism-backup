public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        if (speed < 0 || speed > 10) {
            throw new IllegalArgumentException("Speed be in between 0 and 10");
        } else if (speed <= 4) {
            return speed * 221;
        } else if (speed <= 8) {
            return speed * 221 * 0.9;
        } else if (speed <= 9) {
            return speed * 221 * 0.8;
        } else if (speed <= 10) {
            return speed * 221 * 0.77;
        }
        else {
            throw new IllegalArgumentException("Speed be integer value");
        }
    }

    public int workingItemsPerMinute(int speed) {
        double hourToMin = productionRatePerHour(speed) / 60;
        int convertInt = (int) hourToMin;
        return convertInt;
    }
}
