package com.ttn.bootcamp.core.impls;

import com.ttn.bootcamp.core.conf.DemoConfig;
import com.ttn.bootcamp.core.services.DemoService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component()
@Designate(ocd = DemoConfig.class)
public class DemoImplementation implements DemoService {

    @Activate
    DemoConfig demoConfig;

    @Override
    public String getName() {
        return demoConfig.name();
    }

    @Override
    public int getId() {
        return demoConfig.id();
    }
}
