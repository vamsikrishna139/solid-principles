package design.patterns.solid.violations;

public class MammalISV implements Mammal{
    /**
     * Interface-segregation violation. Mammals do eat and swim, but do not fly. But here the mammal class is being forced implement the fly method.
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
