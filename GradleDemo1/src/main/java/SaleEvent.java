import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SaleEvent
{
    private String id;
    private String streetAddress;;
    private String city;


    private void setID(String s) {
        this.id = s;
    }

    public String getId() {
        return id;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "SaleEvent: "+
                id +
                ", " +
                streetAddress +
                ", " +
                city;
    }

    public static void main(String[] args) {

        SaleEvent saleEvent = new SaleEvent();
        saleEvent.setID("1234");
        saleEvent.setCity("123 Main St.");
        saleEvent.setStreetAddress("Maryland");

        System.out.println(saleEvent.toString());

        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(saleEvent);
        System.out.println(json);
    }


}
