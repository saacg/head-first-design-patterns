// extension of strategic design pattern exercise from Head First Design Patterns by Freeman and Robson

package patterns.strategy;

public class DuckCall {

    QuackBehavior quackBehavior;
    
    public DuckCall() {

        this.quackBehavior = new Quack();

    }

    public DuckCall(QuackBehavior qb) {

        this.quackBehavior = qb;

    }

    public void setCallBehavior(QuackBehavior qb) {

        this.quackBehavior = qb;

    }

    public void performCall() {

        quackBehavior.quack();

    }

} 
