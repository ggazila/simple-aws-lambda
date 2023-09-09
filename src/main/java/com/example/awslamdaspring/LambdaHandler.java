package com.example.awslamdaspring;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.example.awslamdaspring.config.AppConfig;
import com.example.awslamdaspring.service.DbService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class LambdaHandler implements RequestHandler<Object, String> {

    @Override
    public String handleRequest(Object input, Context context) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DbService dbService = applicationContext.getBean(DbService.class);

        context.getLogger().log(dbService.getPassword());
        return "Hello from Spring Boot and AWS Lambda!";
    }
}

