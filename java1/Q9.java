package Demo.Assignment;

enum Houses
{
    BHK2(42), BHK3(65), BHK4(84);
    private int price;

    Houses(int p)
        {
            price = p;
        }
    int getPrice()
    {
        return price;
    }

}

public class Q9
{
    public static void main(String[] args)
    {
        for(Houses h: Houses.values())
        {
            System.out.println(h + " costs " + h.getPrice() + " Lakhs.");
        }
    }
}
