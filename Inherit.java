import java.util.*;

abstract class Insurance {

  String type;
  double monthlyCost;

  // Getters
  public String getType() {
   return type;
 }

 public double getCost() {
   return monthlyCost;
 }

  // Setters
 public void setType(String newType) {
   this.type = newType;
 }

 public void setCost(double newCost) {
   this.monthlyCost = newCost;
 }

 abstract public void setInsuranceCost(double month);

 abstract public String displayInfo();

}

class Health extends Insurance {

  public Health(String type) {

    this.type = type;
  }

  public void setInsuranceCost(double month) {
    monthlyCost = month;
  }

  public String displayInfo() {
    System.out.println("This is your type and monthly cost.");
    System.out.println(type);
    System.out.println(monthlyCost);
    return "yay!";
  }



}

class Life extends Insurance {

  public Life(String type) {
    this.type = type;
  }

  public void setInsuranceCost(double month) {
    monthlyCost = month;
  }

  public String displayInfo() {
    System.out.println("This is your type and monthly cost.");
    System.out.println(type);
    System.out.println(monthlyCost);
    return "Wow!";
  }

}


class Bob {

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);

    System.out.println("What type of insurance do you want type A for life or B for Health.");
    String userAnswer = userInput.nextLine();

    if (userAnswer.contains("A")) {

      Life l = new Life("Life");
      System.out.println("Now type in what is your montly cost?");
      userAnswer = userInput.nextLine();
      l.setInsuranceCost(Double.parseDouble(userAnswer));
      l.displayInfo();

    }
    else if (userAnswer.contains("B")) {

      Health h = new Health("Health");
      System.out.println("Now type in what is your montly cost?");
      userAnswer = userInput.nextLine();
      h.setInsuranceCost(Double.parseDouble(userAnswer));
      h.displayInfo();

    } else {
      System.out.println("Not correct type. Choose A or B.");
    }

  }


}
