
import java.util.LinkedList;

public class UC6{
    public static void main(String args[])
    {

        LinkedList<String> list = new LinkedList<String>();



        list.add("56");
        list.add("30");
        list.add("70");


        System.out.println("LinkedList:" + list);


        System.out.println("The first element is: " + list.removeLast());

        System.out.println("Final LinkedList:" + list);
    }
}