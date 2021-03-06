package com.designPattern.creationalPattern.BuilderPattern;

public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
