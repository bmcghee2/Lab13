import java.util.Scanner;
class Driver{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("You are about to create a dog.");
System.out.print("How old is the dog: ");
  int old=s.nextInt();
System.out.print("How much does the dog weigh: ");
      double weigh= s.nextDouble();
System.out.print("What is the dog’s name: ");
    String dn= s.next();
System.out.print("What color is the dog: ");
    String dc=s.next();
System.out.print("What breed is the dog: ");
    String db=s.next();
    Dog mydog= new Dog(old,weigh,dn,dc,db);
    System.out.println("\n"+mydog.name +" is a "+ mydog.age + " year old " + mydog.furColor + " " + mydog.breed + " that weighs " + mydog.weight + "."); 
  mydog.bark(); 
    System.out.print("\n"+ mydog.name +" is hungry, how much should he eat: "); 
  mydog.eat(s.nextDouble()); 
    System.out.print(mydog.name+ " isn’t a very good name. What should they be renamed to: ");
    mydog.rename(s.next()); 
    System.out.println("\n"+mydog.name +" is a "+ mydog.age + " year old " + mydog.furColor + " " + mydog.breed + " that weighs " + mydog.weight + "."); 
  }
}
class Dog{
  public int age;
  public double weight;
  public String name;
  public String furColor;
  public String breed; 
  public Dog(int a, double w, String n, String fc, String b){
    age=a;
    weight=w;
    name=n;
    furColor= fc; 
    breed=b;
  }
  public void bark(){
    System.out.println("\nWoof! Woof!");
  }
  public void rename(String input){
    name=input; 
  }
  public void eat(double e){
  weight+=e; 
}
}


