package az.unibank.softpos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "az.unibank.softpos.config")
public class SoftPosSpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoftPosSpApplication.class, args);
    }
}
