open module jmp.application {
    requires static spring.beans;
    requires static spring.context;
    requires static spring.boot;
    requires static spring.core;
    requires static spring.boot.autoconfigure;
    requires static spring.data.jpa;

    requires jmp.cloud.service.impl;
    requires jmp.service.api;
    requires jmp.dto;
    requires jmp.bank.api;

    exports com.os.module1.application;
}