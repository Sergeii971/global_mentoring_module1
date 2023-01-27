module jmp.service.api {
    requires jmp.dto;
    requires static spring.data.commons;
    requires static spring.data.jpa;
    requires static spring.core;
    requires static spring.beans;
    requires spring.boot;
    requires spring.context;
    requires spring.boot.starter.data.jpa;
    exports com.os.module1.service;
    exports com.os.module1.service.repository;
}