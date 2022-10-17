import java.util.*;

class CricketMatch {
  public int currentscore;
  public int currentoverprogress;
  public int targetscore;

  public void setproperty(int current_score, int current_overprogress, int target_score) throws ValidData {
    if (target_score < current_score) {
      throw new ValidData("exception in data");
    } else {
      currentscore = current_score;
      currentoverprogress = current_overprogress;
      targetscore = target_score;
    }
  }

}

class FormatType extends CricketMatch {
  
  public int match_format;

  void checkMatchFormat(int format) throws InvalidMatchFormat {
    if (format > 4) {
      throw new InvalidMatchFormat("Exception");
    } else {
      match_format = format;
    }
  }

  void Find() {

    if (match_format == 1) {
      int Score_required = targetscore - currentscore;
      int over_left = 50 - currentoverprogress;
      double required_runrate = Score_required / over_left;
      System.out.println("\nNeed " + Score_required + " runs in " + over_left * 6 + " balls.");
      System.out.println("Required RunRate : " + required_runrate);

    }

    else if (match_format == 2) {
      int Score_required = targetscore - currentscore;
      int over_left = 20 - currentoverprogress;
      double required_runrate = Score_required / over_left;
      System.out.println("\nNeed " + Score_required + " runs in " + over_left * 6 + " balls.");
      System.out.println("Required RunRate : " + required_runrate);

    }

    else if (match_format == 3) {
      int Score_required = targetscore - currentscore;
      int over_left = 90 - currentoverprogress;
      double required_runrate = Score_required / over_left;
      System.out.println("\nNeed " + Score_required + " runs in " + over_left * 6 + " balls.");
      System.out.println("Required RunRate : " + required_runrate);

    } else if (match_format == 4) {
      int Score_required = targetscore - currentscore;
      int over_left = 10 - currentoverprogress;
      double required_runrate = Score_required / over_left;
      System.out.println("\nNeed " + Score_required + " runs in " + over_left * 6 + " balls.");
      System.out.println("Required RunRate : " + required_runrate);

    }

  }

}

class Main {
  public static void main(String[] args) {

    FormatType MatchReport = new FormatType();
    Scanner scn = new Scanner(System.in);

    System.out.println(" Enter match Format ");
    System.out.println("1. ODI");
    System.out.println("2. T20");
    System.out.println("3. Test");
    System.out.println("4. T10");

    int format = scn.nextInt();
    try {
      MatchReport.checkMatchFormat(format);
    } catch (InvalidMatchFormat e) {
      System.out.println("Excepiton you can't press option above 4");
      return;
    }
    System.out.println("Enter the Current score");
    int current_score = scn.nextInt();
    System.out.println("Enter the current Over");
    int current_overprogress = scn.nextInt();
    System.out.println("Enter the Target Score");
    int target_score = scn.nextInt();
    try {
      MatchReport.setproperty(current_score, current_overprogress, target_score);
    } catch (ValidData e) {
      System.out.println("Current Score can't be more than Target Score");
      return;
    }
    MatchReport.Find();

  }
}

class InvalidMatchFormat extends Exception {
  InvalidMatchFormat(String Message) {

  }
}

class ValidData extends Exception {
  ValidData(String Message2) {
    super(Message2);
  }
}
