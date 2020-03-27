package com.ttn.bootcamp.impls;

import com.ttn.bootcamp.configs.TechBlogConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;
import com.ttn.bootcamp.services.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component(name = "TechBlog", property = {"version=Tech"})
@Designate(ocd = TechBlogConfig.class)
public class TechBlogImpl implements BlogService {

    String category;
    int rank;
    Date date = new Date();

    @Activate
    public void activate(TechBlogConfig techBlogConfig){
        category = techBlogConfig.blogCategory();
        rank = techBlogConfig.rank();
        date = convertStringToDate(techBlogConfig.dateCreated());
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

    public String getBlogCategory(){
        return category;
    }

    public int getRank(){
        return rank;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        return "Rank: "+rank+ " Category: "+ category+ " Date Created: "+ date;
    }
}
