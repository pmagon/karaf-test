package com.imtf.impl;

import com.imtf.api.TestService;
import com.imtf.config.TestConfig;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@Component(immediate = true)
@Designate(ocd = TestConfig.class)
public class TestServiceImpl implements TestService {

    private static final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);

    @Activate
    public void init(TestConfig config) {
        log.info("ACTIVATE -------------------------------> " + config.attribute1());
    }

    @Modified
    public void modify(TestConfig config) {
        log.info("MODIFIED -------------------------------> " + config.attribute1());
    }


    public String getDate() {
        return new Date().toString();
    }

}
