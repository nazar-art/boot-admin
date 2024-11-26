package com.xpinjection.bootadmin.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import jakarta.validation.constraints.NotBlank;

@Validated
@Getter @Setter
@ConfigurationProperties(prefix = "actuator")
public class ActuatorProperties {

    @NotBlank
    /*
      Username to access Actuator endpoints.
     */
    private String username;

    @NotBlank
    /*
      Password to access actuator endpoints.
     */
    private String password;
}
