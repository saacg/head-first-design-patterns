// from Head First Design Patterns by Freeman and Robson
package patterns.strategy;
public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        DuckCall duckCall = new DuckCall(new MuteQuack());
        duckCall.performCall();
        duckCall.setCallBehavior(new Squeak());
        duckCall.performCall();


    }

}
