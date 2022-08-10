package com.kodilla.hibernate.manytomany.facade;

public final class CompanyDto {
    private final String name;

    public CompanyDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
