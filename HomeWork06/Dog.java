package HomeWork06;

import HomeWork06.Animal.Animal;

public class Dog extends Animal {


        public Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    public void dogInfo() {
        System.out.println("Dog " + name  + " пробежал " + run + " м.," + " проплыл " + swim + " м.");
    }
}
