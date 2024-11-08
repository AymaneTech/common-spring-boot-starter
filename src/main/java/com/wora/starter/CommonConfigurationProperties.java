package com.wora.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("my-common-starter")
public record CommonConfigurationProperties(
        @DefaultValue("http://localhost:8080") String server,
        @DefaultValue("Development") String description,
        Info info
) {

    public record Contact(
            @DefaultValue("Aymane El Maini") String name,
            @DefaultValue("elmainiaymane03@gmail.com") String email,
            @DefaultValue("https://aymaneelmaini.vercel.app") String url
    ) {
    }

    public record Info(
            @DefaultValue("malk m3gaz sir dir title l api dyalk asahbi") String title,
            @DefaultValue("1.0") String version,
            @DefaultValue("o dir description tahiya malk ach kahsser") String description,
            Contact contact
    ) {
    }
}