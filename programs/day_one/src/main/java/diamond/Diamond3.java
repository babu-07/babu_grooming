package diamond;

public class Diamond3 implements Diamond1,Diamond2{
    public void display()
    {
        Diamond1.super.display();
        Diamond2.super.display();
        System.out.println("This is Diamond 3");
    }
}
