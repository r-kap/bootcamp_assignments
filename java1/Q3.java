package Demo.Assignment;

public class Q3
{
    public static void main(String[] args) {

        //Q3
        String ss = "This my name who you name";
        System.out.println("Occurences: ");
        int count = ss.length() - ss.replace("m", "").length();
        System.out.println(count);
    }
}
