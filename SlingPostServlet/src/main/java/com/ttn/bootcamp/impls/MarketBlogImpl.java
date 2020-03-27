package com.ttn.bootcamp.impls;

import com.ttn.bootcamp.configs.MarketBlogConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import com.ttn.bootcamp.services.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component(name = "MarketBlog_Implementation", property = {"version=Market"})
@Designate(ocd = MarketBlogConfig.class)
public class MarketBlogImpl implements BlogService {

    String category;
    int rank;
    Date date;

    @Activate
    public void activate(MarketBlogConfig marketBlogConfig) {
        category = marketBlogConfig.blogCategory();
        rank = marketBlogConfig.rank();
        date = convertStringToDate(marketBlogConfig.dateCreated());
    }


    public Date convertStringToDate(String dateString)
    {
        Date date = null;
        Date formatteddate = null;
        DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        try{
            date = df.parse(dateString);
            formatteddate = new Date(df.format(date));
        }
        catch ( Exception ex ){
            System.out.println(ex);
        }
        return formatteddate;
    }

    public String getBlogCategory() {
        return category;
    }

    public int getRank() {
        return rank;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        return "Rank: "+rank+ " Category: "+ category+ " Date Created: "+ date;
    }
}
