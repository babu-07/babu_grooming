package visibility;

public class Test1 {

    public static void main(String args[]) {
        Test t = new Test();
        System.out.println(t.id);  //accessible
        System.out.println(t.name); //accessible inside package
        //System.out.println(t.mobile); not accessible because private
        System.out.println(t.getMobile());  //use getter
    }
}
