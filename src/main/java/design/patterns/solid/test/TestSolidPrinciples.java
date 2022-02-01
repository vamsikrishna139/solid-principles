package design.patterns.solid.test;

import design.patterns.solid.compliant.CoffeeMakerService;
import design.patterns.solid.compliant.MocaMakerService;
import design.patterns.solid.compliant.TeaMakerService;
import design.patterns.solid.violations.CoffeeMakerOCPV;
import design.patterns.solid.violations.TeaMakerLSPV;

public class TestSolidPrinciples {
    public static void main(String[] args) {

        /**
         * Liskov Substitution Principle Violation
         */
        CoffeeMakerOCPV coffeeMakerOCPV = new CoffeeMakerOCPV();
        coffeeMakerOCPV.brewCoffee(); // works fine
        coffeeMakerOCPV = new TeaMakerLSPV();//violation: when child class is performing super's action, it is not working as expected.
        //coffeeMakerOCPV.brewCoffee();

        /**
         * Liskov Substitution Principle Compliance
         * */

        CoffeeMakerService coffeeMakerService = new CoffeeMakerService();
        coffeeMakerService.brewCoffee();
        coffeeMakerService = new MocaMakerService();//when we ask for coffee, we're getting moca, which is a type of coffee and therefore inline with LSP. and we also moved teaMaker to a different class.
        coffeeMakerService.brewCoffee();
        TeaMakerService teaMakerService = new TeaMakerService();
        teaMakerService.brewTea();

    }
}
