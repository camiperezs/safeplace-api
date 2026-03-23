package com.safeplace.safeplaceapi.dto;

public class ResourceResponseDTO {
    private String name;
    private String description;
    private String fullAddress;
    private String email;
    private String telephone;
    private boolean active;
    private boolean verified;
    private String category;

    public ResourceResponseDTO() {
    }

    public ResourceResponseDTO(String name, String description, String fullAddress, String email, String telephone, boolean active, boolean verified, String category) {
        this.name = name;
        this.description = description;
        this.fullAddress = fullAddress;
        this.email = email;
        this.telephone = telephone;
        this.active = active;
        this.verified = verified;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
