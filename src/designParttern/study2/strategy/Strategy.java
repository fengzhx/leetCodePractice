package designParttern.study2.strategy;

public class Strategy {
    public static void main(String[] args) {
        NormalZombie normalZombie = new NormalZombie();
        normalZombie.setAttack(new HitAttack());
        normalZombie.attack();
    }
}


interface Attack{
    void attack();
}

interface Move{
    void move();
}

interface Display{
    void display();
}

class BiteAttack implements Attack{

    @Override
    public void attack() {
        System.out.println("咬");
    }
}


class HitAttack implements Attack{

    @Override
    public void attack() {
        System.out.println("打");
    }
}

class LitterMove implements Move{

    @Override
    public void move() {
        System.out.println("缓慢移动");
    }
}

class CommonDisplay implements Display{

    @Override
    public void display() {
        System.out.println("普通装扮");
    }
}

abstract class Zombie{
    public Display display;
    public Attack attack;
    public Move move;

    public Zombie(Display display, Attack attack, Move move) {
        this.display = display;
        this.attack = attack;
        this.move = move;
    }

    public Zombie() {
        this.display = new CommonDisplay();
        this.attack = new BiteAttack();
        this.move = new LitterMove();
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Attack getAttack() {
        return attack;
    }

    public void setAttack(Attack attack) {
        this.attack = attack;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    abstract void move();
    abstract void display();
    abstract void attack();
}

class NormalZombie extends Zombie{
    public NormalZombie() {
    }

    public NormalZombie(Display display, Attack attack, Move move) {
        this.move = move;
        this.display = display;
        this.attack = attack;
    }

    @Override
    void move() {
        move.move();
    }

    @Override
    void display() {
        display.display();
    }

    @Override
    void attack() {
        attack.attack();
    }
}