package com.project.rastreadorIP.controller;

import com.project.rastreadorIP.dto.IpResponse;
import com.project.rastreadorIP.service.IpTrackerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EndPointController {

    private final IpTrackerService ipService;

    // O Spring injeta o serviço automaticamente aqui
    public EndPointController(IpTrackerService ipService) {
        this.ipService = ipService;
    }

    @GetMapping("/rastrear")
    public IpResponse rastrear(@RequestParam String ip) {
        return ipService.rastrearIp(ip);
    }
}
