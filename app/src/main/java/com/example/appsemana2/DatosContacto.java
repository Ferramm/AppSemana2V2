package com.example.appsemana2;

public class DatosContacto {
    private String name;
    private String birthDate;
    private String phone;
    private String email;
    private String description;

    public DatosContacto(String name, String birthDate, String phone, String email, String description) {
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
