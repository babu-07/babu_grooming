package inheritanceandpolymorphism;

public class Test {
    public static void main(String args[]){
        Animal a = new Animal();
        a.display();
        Animal a1 = new Dog();
        a1.display();
        Animal a2 = new Cat();
        a2.display();
        Cat c= new Cat();
        c.show();
        c.show("Cat is running");
        c.show("Cat is running","white");
    }
}
