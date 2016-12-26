// from Head First Design Patters by Freeman and Robson

package patterns.strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {

        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
            
    }

    public void display() {

        System.out.println("I'm a Model duck");

    }


}
