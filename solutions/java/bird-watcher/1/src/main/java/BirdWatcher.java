import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    static int[] lastWeekBirdsPerDay = { 0, 2, 5, 3, 7, 8, 4 };

    public static int[] getLastWeek() {
        return lastWeekBirdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(birds -> birds == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int maxDays = Math.min(birdsPerDay.length, numberOfDays);

        for (int i = 0; i < maxDays; i++) {
            count += birdsPerDay[i];
        }

        return  count;
    }

    public int getBusyDays() {
        int busyDays = 0;

        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                busyDays++;
            }
        }

        return busyDays;
    }
}
