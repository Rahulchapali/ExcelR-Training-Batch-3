class Bowler {

    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;

    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (isInvalidInput()) {
            System.out.println("Error");
            return;
        }

        if (wickets > 0) {
            double bowlingAvg = (double) runs_conceded / wickets;
            System.out.println("Name: " + name);
            System.out.printf("bowling avg", bowlingAvg);
        } else {
            System.out.println("Error");
        }
    }

    public void showStatistics() {
        if (isInvalidInput()) {
            System.out.println("Error");
            return;
        }

        System.out.println("Name: " + name);
        System.out.println("wickets: " + wickets);
        System.out.println("matches: " + matches);
        System.out.println("balls_bowled:" + balls_bowled);
        System.out.println("runs_conceded: " + runs_conceded);
    }

    public void computeStrikeRate() {
        if (isInvalidInput()) {
            System.out.println("Error");
            return;
        }

        if (balls_bowled > 0) {
            double strikeRate = (double) runs_conceded / balls_bowled;
            System.out.println("Name: " + name);
            System.out.printf("Strike rate broo: ", strikeRate);
        } else {
            System.out.println("Error");
        }
    }

    private boolean isInvalidInput() {
        return (wickets < 0 || matches < 0 || balls_bowled < 0 || runs_conceded < 0);
    }
}

public class Ps003 {
    public static void main(String[] args) {

        Bowler bowler = new Bowler("Nitish", 10, 5, 750, 463);

        bowler.computeBowlingAverage();
        bowler.showStatistics();
        bowler.computeStrikeRate();
    }
}
