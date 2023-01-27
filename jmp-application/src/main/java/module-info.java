open module jmp.application {
    requires static spring.beans;
    requires static spring.context;
    requires static spring.boot;
    requires spring.core;
    requires static spring.boot.autoconfigure;
    requires spring.data.jpa;

    requires jmp.cloud.service.impl;
    requires jmp.service.api;

    exports com.os.module1.application;
}