package com.imtf.config;


import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(description = "Test config")
public @interface TestConfig {

    @AttributeDefinition(description = "Attribute 1")
    String attribute1() default "Attribute 1";

    @AttributeDefinition(description = "Attribute 2")
    String attribute2() default "Attribute 2";

}
