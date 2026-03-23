package com.safeplace.safeplaceapi.resource.service;

import com.safeplace.safeplaceapi.dto.ResourceResponseDTO;
import com.safeplace.safeplaceapi.resource.domain.Address;
import com.safeplace.safeplaceapi.resource.domain.Category;
import com.safeplace.safeplaceapi.resource.domain.Resource;
import com.safeplace.safeplaceapi.resource.mapper.ResourceMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceService {
    private final ResourceMapper resourceMapper;

    public ResourceService(ResourceMapper resourceMapper) {
        this.resourceMapper = resourceMapper;
    }

    public List<ResourceResponseDTO> getResources(){
        Category category = Category.PSYCHOLOGICAL_SUPPORT;

        Address address = new Address();
        address.setProvince("Santa Fe");
        address.setCity("Rosario");
        address.setStreet("Salta");
        address.setStreetNumber("1270");
        address.setApartment("A");
        address.setFloor("4");

        Resource resource = new Resource("Centro de Ayuda", "Este es un centro de ayuda", address, "email@example.com", "12345677", true, false, category);
        ResourceResponseDTO resourceResponseDTO = resourceMapper.toResponse(resource);

        List<ResourceResponseDTO> resources = new ArrayList<>();
        resources.add(resourceResponseDTO);

        return resources;
    }
}
