package HomeWork06;


public class model {

    public static void main(String[] args) {
        Cat cat = new Cat("Peppy", 150, 10); /** значение run не должно превышать 200 */
        Dog dog = new Dog("Rich", 400, 8); /** run не больше 500, swim не больше 10 */

        cat.catInfo();
        dog.dogInfo();

    }

}
