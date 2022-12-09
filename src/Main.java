import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your goal in minutes: ");
        int goal = scan.nextInt();
        ActivityTracker tracker = new ActivityTracker(goal);

        boolean cont = true;
        while (cont)
        {
            System.out.print("Please enter your session duration: ");
            int min = scan.nextInt();

            if (min==-1) {
                cont = false;
            }
            else {
                tracker.logMinutes(min);
            }
        }
        System.out.println("Total sessions logged: " + tracker.getTimesLogged());
        System.out.println("Total minutes logged: " + tracker.getTotal());
        System.out.println("Max minutes logged: " + tracker.getHighestMin());
        System.out.println("Did you reach your goal?: " + tracker.isGoalAchieved());

        // create an ActivityTracker object

        // repeatedly ask user to enter an activity session's number of minutes
        // and enter -1 when done entering

        // log the number of minutes associated with each activity session

        // when the user is done entering numbers, end the loop and
        // tell the user their stats:
        // - total sessions logged
        // - total minutes logged
        // - max minutes logged
        // - did they reach their goal?

    }
}
