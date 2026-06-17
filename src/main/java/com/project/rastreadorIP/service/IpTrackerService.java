package com.project.rastreadorIP.service;

import com.project.rastreadorIP.dto.IpResponse;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class IpTrackerService {

    public IpResponse rastrearIp(String ip) {
        String url = "http://ip-api.com/json/" + ip;
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(url, IpResponse.class);
    }

}
