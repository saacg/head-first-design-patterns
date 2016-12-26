// from Head First Design Patterns by Freeman and Robson
package patterns.strategy;
public abstract class Duck {

    // reference variables for the behavior interface types
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {

        flyBehavior.fly();

    }

    public void performQuack() {

        quackBehavior.quack();

    }

    public void swim() {

        System.out.println("All ducks float, even decoys!");

    }




}


