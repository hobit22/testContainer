package com.example.testcontainer.basic;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Slf4j
@Testcontainers
@DisplayName("MySQL 컨테이너 커스텀 설정")
@SpringBootTest
@ActiveProfiles("test")
class CustomMySQLContainer {

    static JdbcDatabaseContainer mySQLContainer = new MySQLContainer("mysql:8")
//            .withConfigurationOverride("learning.testcontainers/custom.conf.d")
            .withDatabaseName("customdb")
            .withUsername("kukim")
            .withPassword("1234")
            .withInitScript("init.sql");

    @BeforeEach
    void setUp() {
        mySQLContainer.start(); // 매 테스트 시작 시 컨테이너 시작
    }

    @AfterEach
    void tearDown() {
        mySQLContainer.stop(); // 매 테스트 끝난 뒤 컨테이너 종료
    }

    @Test
    void test1() {
        log.info("test 1 로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("test 1 로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("test 1 로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("test 1 로그 getHost {} ", mySQLContainer.getHost());
        log.info("test 1 로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("test 1 로그 getPassword {} ", mySQLContainer.getPassword());
    }

    @Test
    void test2() {
        log.info("test 2 로그 getJdbcDriverInstance {} ", mySQLContainer.getJdbcDriverInstance());
        log.info("test 2 로그 getJdbcUrl {} ", mySQLContainer.getJdbcUrl());
        log.info("test 2 로그 getMappedPort {} ", mySQLContainer.getMappedPort(3306));
        log.info("test 2 로그 getHost {} ", mySQLContainer.getHost());
        log.info("test 2 로그 getUsername {} ", mySQLContainer.getUsername());
        log.info("test 2 로그 getPassword {} ", mySQLContainer.getPassword());
    }
}