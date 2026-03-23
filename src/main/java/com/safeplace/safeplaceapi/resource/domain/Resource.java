package com.safeplace.safeplaceapi.resource.domain;

public class Resource {
    private Long id;
    private String name;
    private String description;
    private Address address;
    private String email;
    private String telephone;
    private boolean active;
    private boolean verified;
    private Category category;

    public Resource(){
    }

    public Resource(String name, String description,Address address, String email, String telephone, boolean active, boolean verified, Category category){
        this.name = name;
        this.description = description;
        this.address = address;
        this.email = email;
        this.telephone = telephone;
        this.active = active;
        this.verified = verified;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", active=" + active +
                ", verified=" + verified +
                ", category=" + category +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Address getAddress() {
        return address;
    }

    public String getFullAddress(){
        return address.getFullAddress();
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
