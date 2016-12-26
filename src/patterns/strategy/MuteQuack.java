// from Head First Design Patterns by Freeman and Robson

package patterns.strategy;

public class MuteQuack implements QuackBehavior {

    public void quack() {

        System.out.println("<< Silence >>");

    }

}
