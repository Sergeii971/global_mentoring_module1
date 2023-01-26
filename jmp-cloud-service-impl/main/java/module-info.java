module jmp.cloud.service.impl {
    requires transitive jmp.service.api;
    requires jmp.dto;
    requires static spring.boot;
    requires static spring.context;
    requires static spring.core;
    requires static spring.beans;
    requires spring.data.commons;

    exports com.os.module1.impl;
    exports com.os.module1.repository;
}