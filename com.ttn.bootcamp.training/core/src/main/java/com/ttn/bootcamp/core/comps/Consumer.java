package com.ttn.bootcamp.core.comps;

import com.ttn.bootcamp.core.services.DemoService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(name = "Service consumer")
public class Consumer {

    @Reference
    DemoService demoService;

    Logger logger = LoggerFactory.getLogger(Consumer.class);

    @Activate
    public void activate(){
        logger.info("Name is: "+ demoService.getName());
        logger.info("id is: "+ demoService.getId());
    }

}
