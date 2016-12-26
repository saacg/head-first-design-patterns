// from Head First Design Patters by Freeman and Robson

package patterns.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
            
    }

    public void display() {

        System.out.println("I'm a real Mallard duck");

    }


}
