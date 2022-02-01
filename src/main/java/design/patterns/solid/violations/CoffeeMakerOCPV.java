package design.patterns.solid.violations;

public class CoffeeMakerOCPV {
    public void brewCoffee(){
        System.out.println("I brew plain coffee");
    }

    /*
        This is a violation. This should come as a child.
     */
    public void brewMoca(){
        System.out.println("I brew moca");
    }
}
