module jmp.cloud.service.impl {
    requires transitive jmp.service.api;
    requires jmp.dto;
    requires static spring.beans;
    requires static spring.context;
    requires static spring.boot;
    requires static spring.core;
    requires spring.data.commons;
    requires static spring.data.jpa;
    requires hibernate.entitymanager;

    exports com.os.module1.impl;
}