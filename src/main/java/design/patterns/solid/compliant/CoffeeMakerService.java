package design.patterns.solid.compliant;

public class CoffeeMakerService implements CoffeeMaker{
    @Override
    public void brewCoffee() {
        System.out.println("Here's your coffee!");
    }
}
