module jmp.cloud.service.impl {
    requires transitive jmp.service.api;
    requires jmp.dto;
    requires static spring.beans;
    requires static spring.context;
    requires static spring.boot;
    requires static spring.core;
    requires static spring.data.commons;
    requires static spring.data.jpa;
    requires static hibernate.entitymanager;

    exports com.os.module1.impl;
}