package com.ttn.SlingModels.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MyDetailsModel {

    @Inject
    private String firstname;

    @Inject
    private String lastname;

    @Inject
    private Date dob;

    @Inject
    private String gender;


    @Inject
    private String marital;

    private String fullname;

    private  int age;

    private String honorific;


    @PostConstruct
    protected void init()
    {

        fullname=firstname + " " + lastname;

        if (("male").equalsIgnoreCase(gender))
        {
            honorific="Mr";
        }
        else if (("female").equalsIgnoreCase(gender) && ("single").equalsIgnoreCase(marital))
        {
            honorific="Ms";
        }
        else if (("female").equalsIgnoreCase(gender) && ("married").equalsIgnoreCase(marital))
        {
            honorific="Mrs";
        }

        age = calculateAge();
    }

    private int calculateAge()
    {
        if(null != dob){
            Calendar c = Calendar.getInstance();
            c.setTime(dob);
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH) + 1;
            int date = c.get(Calendar.DATE);
            LocalDate l1 = LocalDate.of(year, month, date);
            LocalDate now1 = LocalDate.now();
            Period diff= Period.between(l1, now1);
            return diff.getYears();
        }
        return 0;
    }

    public String getFirstname() {
        return firstname;
    }


    public String getLastname() {
        return lastname;
    }


    public Date getDob() {
        return dob;
    }


    public String getGender() {
        return gender;
    }

    public String getMarital() {
        return marital;
    }


    public String getFullname()
    {
        return fullname;
    }
    public String getHonorific() {
        return honorific;
    }
    public int getAge() {
        return age;
    }
}

