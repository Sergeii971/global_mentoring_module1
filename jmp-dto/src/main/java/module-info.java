module jmp.dto {
    requires static lombok;
    requires static java.persistence;

    requires static spring.data.commons;
    requires static spring.data.jpa;
    requires static spring.core;
    requires static spring.beans;
    requires static spring.boot;
    requires static spring.context;
    requires static spring.boot.starter.data.jpa;

    exports com.os.module1.dto;
    exports com.os.module1.repository;

}