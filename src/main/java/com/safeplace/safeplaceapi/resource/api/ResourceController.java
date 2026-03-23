package com.safeplace.safeplaceapi.resource.api;

import com.safeplace.safeplaceapi.dto.ResourceResponseDTO;
import com.safeplace.safeplaceapi.resource.service.ResourceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResourceController {
    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    @GetMapping("/resources")
    public List<ResourceResponseDTO> resources(){
        return resourceService.getResources();
    }
}
