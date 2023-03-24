package inheritanceandpolymorphism;

public class Cat extends Animal{
    public void display(){
        System.out.println("This is a Cat");
    }

    public void show(){
        System.out.println("Cat has 4 legs");
    }

    public void show(String s){
        System.out.println(s);
    }

    public void show(String s,String c){
        System.out.println(s +" and it is "+c+" in color.");
    }
}
