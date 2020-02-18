package Demo.Assignment;

public class Q3
{
    public static void main(String[] args) {

        //Q3
        String ss = "This my name who you name";
        System.out.println("Occurences: ");

        //count the total length of he string and the length of string after removing the character.
        //subtract the latter from the former and we get the count off a particular character.
        int count = ss.length() - ss.replace("m", "").length();
        System.out.println(count);
    }
}
