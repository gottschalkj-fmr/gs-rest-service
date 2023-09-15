/* 
 * Copyright (c) 2020 gottschalkj-fmr.
 * Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.github.gottschalkjfmr.examples.gsrestservice;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplicationTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    @SuppressWarnings("unused")
    private WebTestClient webClient;

    @Test
    public void testActuator() {
        webClient.get().uri(builder -> builder.path("/actuator/health").build()).exchange().expectStatus().isOk().expectBody()
            .jsonPath("$.status").isEqualTo("UP");
    }

    @Test
    public void testGreeting() {
        webClient.get().uri(builder -> builder.path("/greeting").build()).exchange().expectStatus().isOk().expectBody()
            .jsonPath("$.id").isEqualTo(1)
            .jsonPath("$.content").isEqualTo("Hello, World!");
    }
}
