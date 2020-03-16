package apps.example;

import com.adobe.cq.sightly.WCMUsePojo;

public class Info extends WCMUsePojo {

    String str ;
    @Override
    public void activate() throws Exception {
        //str =getProperties().get("title", "").toLowerCase();
        str = String.valueOf(new java.util.Date());
    }

    public String getTitle(){
        return str;
    }
}
