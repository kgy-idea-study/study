package com.designPattern.structuralPattern.composite;

public abstract class Company {
    private String name;

    public Company() {
    }

    public Company(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void add(Company company);

    protected abstract void romove(Company company);

    protected abstract void display(int depth);
}
