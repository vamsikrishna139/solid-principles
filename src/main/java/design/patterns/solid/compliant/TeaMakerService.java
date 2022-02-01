package design.patterns.solid.compliant;

public class TeaMakerService implements TeaMaker {
    @Override
    public void brewTea() {
        System.out.println("Here's your tea!");
    }
}
