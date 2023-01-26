package v1.az.unibank.softpos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;
import java.util.List;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SpringFoxConfig {

    private static final String AUTHORIZATION_HEADER = "Authorization";

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .securityContexts(Collections.singletonList(securityContext()))
//                .securitySchemes(List.of(apiKey()))
//                .apiInfo(apiInfo());
//    }
    @Bean
    public Docket swaggerApiV1() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("softpos-api-1.1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("v1.az.unibank.softpos.controllers"))
                .paths(regex(".*/v1.1.*"))
                .build()
                .apiInfo(new ApiInfoBuilder().version("v1.1").title("soft-pos-generator").description("Documentation SoftPos API v1.1").build());
    }

    @Bean
    public Docket swaggerApiV2() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("softpos-api-1.2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("v1.az.unibank.softpos.controllers"))
                .paths(regex(".*/v1.2.*"))
                .build()
                .apiInfo(new ApiInfoBuilder().version("v1.2").title("soft-pos-generator").description("Documentation SoftPos API v1.2").build());
    }
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "SOFT-POS REST API",
                "Description of SOFT-POS APIs",
                "API 1.0.0",
                "Terms of serviceV2",
                new Contact("Unibank CB", "https://unibank.az", "info@unibank.az"),
                "License of API", "API license URL", Collections.emptyList());
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .build();
    }


    private ApiKey apiKey() {
        return new ApiKey(AUTHORIZATION_HEADER, AUTHORIZATION_HEADER, "header");
    }

    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope
                = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return List.of(new SecurityReference(AUTHORIZATION_HEADER, authorizationScopes));
    }
}