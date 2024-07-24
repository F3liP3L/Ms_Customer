package co.moonforest.mscustomer.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"co.moonforest.mscustomer"})
@ComponentScan(basePackages = {"co.moonforest.mscustomer"})
public class MSCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MSCustomerApplication.class, args);
    }

}
