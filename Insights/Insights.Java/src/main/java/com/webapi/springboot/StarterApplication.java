package com.webapi.springboot;

import java.util.Properties;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.webapi.mars.AppPackageMarker;


@EnableDiscoveryClient
@SpringBootApplication(scanBasePackageClasses = {
        AppPackageMarker.class
})
@EnableAspectJAutoProxy
public class StarterApplication {


    public static void main(String[] args) {

        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(StarterApplication.class);
        springApplicationBuilder.sources(StarterApplication.class)
                .properties(getProperties())
                .run(args);
    }

    static Properties getProperties() {
        Properties props = new Properties();
        //for linux
//        props.put("spring.config.additional-location", "/app/config/TI-MARS-SERVICE/");
        //for Windows
        props.put("spring.config.additional-location", "../../Insights/cfg/");
        props.put("spring.config.name", "appconfig");

        return props;
    }

    

}
