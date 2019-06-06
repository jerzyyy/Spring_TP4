package com.training.springcore;

import com.training.springcore.service.CaptorService;
import com.training.springcore.service.CaptorServiceImpl;
import com.training.springcore.service.SiteService;
import com.training.springcore.service.SiteServiceImpl;
import org.springframework.context.annotation.*;

@ComponentScan
@Configuration
public class BigCorpApplicationConfig {

    public SiteService serviceA() {
        return new SiteServiceImpl(serviceB());
    }

    public CaptorService serviceB() {
        return new CaptorServiceImpl();
    }
}
