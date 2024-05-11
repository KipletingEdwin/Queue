import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> bbqLine = new LinkedList<String>();
        bbqLine.add("Jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");
        bbqLine.add("Ken");
        bbqLine.add("Edgar");

        bbqLine.poll();

        System.out.println(bbqLine.peek());
        System.out.println(bbqLine.size());
        System.out.println(bbqLine.contains("Jackson"));
        System.out.println(bbqLine.toArray()[2]);


        System.out.println(bbqLine);

    }
}