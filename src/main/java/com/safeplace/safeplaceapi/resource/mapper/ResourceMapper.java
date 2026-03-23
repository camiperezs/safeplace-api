package com.safeplace.safeplaceapi.resource.mapper;

import com.safeplace.safeplaceapi.dto.ResourceResponseDTO;
import com.safeplace.safeplaceapi.resource.domain.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceMapper {
    public ResourceResponseDTO toResponse(Resource resource){
        return new ResourceResponseDTO(resource.getName(), resource.getDescription(), resource.getFullAddress(), resource.getEmail(), resource.getTelephone(), resource.isActive(), resource.isVerified(), resource.getCategory().getLabel());
    }
}
