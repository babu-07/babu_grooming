package stringtoenum;

public class Test {
    public enum Color{
        RED,YELLOW,GREEN,BLUE,VIOLET,INDIGO,ORANGE
    }

    public static void main(String args[]){

        String c = "RED";
        Color c1 = Color.valueOf(c);
        System.out.println(c1);
    }
}
