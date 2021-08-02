package HomeWork06;

import HomeWork06.Animal.Animal;

public class Cat extends Animal {

        public Cat(String name, int run, int swim) {
            super(name, run, swim);
    }

    public void catInfo() {
        System.out.println("Cat " + name + " пробежала " + run + " м. " + "Кошка плавать не умеет ");
    }
}
