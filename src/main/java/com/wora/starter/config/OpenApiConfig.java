package com.wora.starter.config;

import com.wora.starter.CommonConfigurationProperties;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor
public class OpenApiConfig {
    private final CommonConfigurationProperties properties;

    @Bean
    public OpenAPI defineOpenApi() {
        Server server = new Server();
        server.setUrl(properties.server());
        server.setDescription(properties.description());

        Contact contact = new Contact();
        contact.setName(properties.info().contact().name());
        contact.setEmail(properties.info().contact().email());
        contact.setUrl(properties.info().contact().url());

        Info info = new Info()
                .title(properties.info().title())
                .version(properties.info().version())
                .description(properties.info().description())
                .contact(contact);

        return new OpenAPI().info(info).servers(List.of(server));
    }

}
