
import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("\n Top ten points \n");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("\n Top ten by penalties \n");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Search by player");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("\nStatistics for Philadelphia Flyers \n");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("Player in Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");


    }
}
