package HomeWork07;


import HomeWork07.parts.*;

import java.util.Random;

public abstract class Robot extends com.sun.glass.ui.Robot {

    private Random random = new Random();

    private Head head;
    private Leg leftLeg;
    private Hand leftHand;
    private Hand rightHand;
    private Torso torso;
    private String name;

    private int level;

    private RobotPart[] target;

    public Robot(String name) {
        this.name = name;
        this.level = 1;
        this.head = new Head(this, "HeadRobot1");
        this.leftLeg = new Leg(this,"Left hand", level);
        Leg rightLeg = new Leg(this, "Right hand", level);
        this.leftHand = new Hand(this,"Left Hand", level);
        this.rightHand = new Hand(this,"Right Hand", level);
        this.torso = new Torso(this,"Torso", level);
        this.target = new RobotPart[]{head, leftHand, rightHand, leftLeg, rightLeg, torso};
    }

    public void attackLeft(Robot robot) {
        leftHand.giveDamage(robot.target[random.nextInt(target.length)]);
    }

    public void attackRight(Robot robot) {
        rightHand.giveDamage(robot.target[random.nextInt(target.length)]);
    }

    public String getName() {
        return name;
    }

    public void speak() {
        System.out.println(name + " says: " + head.randomString());
    }
}
