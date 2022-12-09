public class ActivityTracker {
    private int total;
    private int targetGoal;
    private int timesLogged;
    private int highestMin;

    public ActivityTracker(int targetGoal) {
        this.targetGoal = targetGoal;
        total = 0;
        timesLogged = 0;
        highestMin = 0;
    }

    public void logMinutes(int minutes) {
        total += minutes;
        timesLogged++;
        if (minutes >= highestMin) {
            highestMin = minutes;
        }
    }

    public int getTimesLogged() {
        return timesLogged;
    }

    public int getHighestMin() {
        return highestMin;
    }

    public int getTotal() {
        return total;
    }

    public boolean isGoalAchieved() {
        if (total >= targetGoal) {
            return true;
        }
        return false;
    }
}