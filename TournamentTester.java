public class TournamentTester {
     public static void main(String[] args) {
    Cricket_Tournament ct1 = new Cricket_Tournament();
    System.out.println(ct1.info());
    System.out.println("-----------------------");
    
    Cricket_Tournament ct2 = new Cricket_Tournament("IPL", 10, "t20");
    System.out.println(ct2.info());
    System.out.println("-----------------------");
    
    Tennis_Tournament tt = new Tennis_Tournament("Roland Garros", 128);
    System.out.println(tt.info());
  }

}


//Class starts here

 class Tournament {
  private String name;

  public Tournament() {
    this.name = "Default";
  }

  public Tournament(String name) {
    this.name = name;
  }

  public String getName(){
    return "Tournament Name: "+name;
  }
}

class Cricket_Tournament extends Tournament{
    public String type="No type";
    public int team;

   public Cricket_Tournament(){
    super("Default");
   }

   public Cricket_Tournament(String n,int t, String p){
     super(n);
     team=t;
     type=p;
   }

   public String info(){
    return "Cricket "+getName()+"\nNumber of teams: "+team+"\nType: "+type;
   }

  
}


class Tennis_Tournament extends Tournament{
    public int total;
    public Tennis_Tournament(String n,int t){
        super(n);
        total=t;

    }


    public String info(){
        return "Tennis "+getName()+"\nNumber of Players: "+total;
    }
}
