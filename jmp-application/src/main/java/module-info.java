module jmp.application {
    requires static java.annotation;
    requires static spring.beans;
    requires static spring.context;
    requires static spring.boot;
    requires static spring.boot.autoconfigure;
    requires static lombok;
    requires static spring.data.jpa;
    requires jmp.cloud.service.impl;
    exports com.os.module1.application;
}