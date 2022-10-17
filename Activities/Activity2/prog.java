/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class CricketMatch
{
    public int currentscore;
    public int currentoverprogress;
    public int targetscore;
    public void setproperty(int current_score , int current_overprogress , int target_score)
    {
        currentscore = currentscore;
        currentoverprogress = current_overprogress;
        targetscore = target_score;
    }
    
}

class ODI extends CricketMatch
{
      public void Find(String match_format)
      {
          if(match_format == "ODI")
          {
              int Score_required = targetscore - currentscore;
              System.out.println(Score_required);
              int over_left = 50 - currentoverprogress;
              int required_runrate = Score_required / over_left;
              System.out.println(Score_required + "run required in " + over_left*6 + " balls.");
              System.out.println("Required Run rate is " + required_runrate);
              
          }
      }
}


class Main
{
    public static void main(String [] args)
    {
        ODI team1 = new ODI();
        team1.setproperty(240,30,400);
        team1.Find("ODI");
    }
}
