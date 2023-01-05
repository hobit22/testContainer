package com.example.testcontainer.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Slf4j
@Testcontainers
@DisplayName("@Container")
class Basic2MySQLContainer {

    @Container
    MySQLContainer mySQLContainer = new MySQLContainer("mysql:8");

    // 생략

    @Test
    void test1() {
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }

    @Test
    void test2() {
        log.info("로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("로그 getHost {} ", mySQLContainer.getHost());
        log.info("로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("로그 getPassword {} ", mySQLContainer.getPassword());
    }

}