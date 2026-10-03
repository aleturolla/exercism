public class Lasagna {
    public static final int EXPECTED_MINUTES_IN_OVEN = 40;
    public static final int PREPARATION_TIME_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int passedMinutes) {
        return expectedMinutesInOven() - passedMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return PREPARATION_TIME_PER_LAYER * layers;
    }

    public int totalTimeInMinutes(int layers, int passedMinutes) {
        return preparationTimeInMinutes(layers) + passedMinutes;
    }
}
