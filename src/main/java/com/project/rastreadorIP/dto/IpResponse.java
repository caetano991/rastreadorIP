package com.project.rastreadorIP.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class IpResponse {
    private String status;
    private String country;
    private String regionName;
    private String city;
    private String isp;
}

