/*Given the following classes, write the code for the Player and the Manager classes derived from SportsPerson class so that the following output is printed. To calculate the match earnings use the following formula:
Player: (total_goal * 1000) + (total_match * 10)
Manager: match_win * 1000
 */

public class PlayerTester { // Driver code
    public static void main(String[] args) {
        Player playerOne = new Player("Al-Nassr", "Ronaldo", "Striker", 25, 32);
        playerOne.calculateRatio();
        playerOne.printDetails();
        System.out.println("----------------");
        Manager managerOne = new Manager("Real Madrid", "Zidane", "Manager", 25);
        managerOne.printDetails();
    }
}

// Class starts here

class SportsPerson { // Parent class
    private String team;
    private String name;
    public String role;
    public double earningPerMatch;

    public SportsPerson(String teamName, String name, String role) {
        this.team = teamName;
        this.name = name;
        this.role = role;
        this.earningPerMatch = 0;
    }

    public String getNameTeam() {
        return "Name: " + name + ", Team Name: " + team;
    }
}

class Player extends SportsPerson { // Child class
    public int goal;
    public int match;
    public double ratio;

    public Player(String team, String name, String position, int goals, int matches) {
        super(team, name, position);
        this.goal = goals;
        this.match = matches;
    }

    public void calculateRatio() {
        this.ratio = (double) goal / (double) match;
    }

    public void printDetails() {
        System.out.println(getNameTeam());
        System.out.println("Team Role: " + role);
        System.out.println("Total Goal: " + goal + ", Total Played: " + match);
        System.out.printf("Goal Ratio: %.2f\n",ratio);

        int earning = (goal * 1000) + (match * 10);

        System.out.println("Match Earning: " + earning + "K");
    }
}

class Manager extends SportsPerson { // Child class
    public int win;

    public Manager(String team, String name, String manager, int wins) {
        super(team, name, manager);
        this.win = wins;
    }

    public void printDetails() {
        System.out.println(getNameTeam());
        System.out.println("Team Role: " + role);
        System.out.println("Total Win: " + win);

        int earning = (win * 1000);

        System.out.println("Match Earning: " + earning + "K");

    }
}
