package design.patterns.solid.violations;

public class TeaMakerLSPV extends CoffeeMakerOCPV {
    public void brewCoffee() {
        throw new RuntimeException("I do not brew coffee!!!");
    }

    public void brewTea() {
        System.out.println("Here's your tea :) ");
    }
}
