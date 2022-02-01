package design.patterns.solid.compliant;

public class BirdISC implements Bird{
    /**
     * Now we have things that bird does. Hence, compliant with Interface-Segregation. And as the principle says, small interfaces are better than bigger ones.
     */
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }
}
