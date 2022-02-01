package design.patterns.solid.violations;

public class BirdISV implements Bird{
    /**
     * Interface-segregation violation. Birds do eat and fly, but do not swim. But here the bird class is being forced implement the swim method.
     */
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
