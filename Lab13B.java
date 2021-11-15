import java.util.Scanner;
class Chair {
 public int numofLegs;
  public boolean rolling;
  public String material;
  public Chair(int legs, boolean r, String m) {
   numofLegs= legs;
    rolling= r;
    material= m;
  }
}
class Driver{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("You are about to create a chair");
    System.out.print("How many legs does your chair have? ");
       int l= s.nextInt();
    System.out.print("Is your chair rolling (true or false): ");
     boolean roll= s.nextBoolean();
    System.out.print("What is your chair made of? ");
     String made= s.next();
      Chair myc= new Chair(l,roll,made);
    String check;
    if(myc.rolling==true){
      check="rolling";
    }
    else{
      check="not rolling";
    }
    System.out.println("\nYour chair has "+ myc.numofLegs +" legs, is "+check+ ","+" and is made of "+myc.material+".");
    System.out.println("\nThis program is going to change that.");

    myc.numofLegs=4;
    myc.rolling=false;
    myc.material="wood";

    if(myc.rolling==true){
      check="rolling";
    }
   
    else{
      check="not rolling";
    }
     System.out.println("\nYour chair has "+ myc.numofLegs + " legs, is "+check+ ","+ " and is made of "+myc.material+".");
  }
}
