package Inheritance;

public class Main {

    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
        Cat c=new Cat();//heirarchy inheritance
        c.meow();
        c.eat();
        BabyDog bd=new BabyDog();//multi level inheritance
        bd.weep();
        bd.bark();
        bd.eat();
        TestInterface obj = new TestInterface();//Multiple inheritance
        obj.print();
    }
}
