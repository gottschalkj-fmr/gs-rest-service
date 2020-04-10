/* 
 * Copyright (c) 2020 krautbax.
 * Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.github.krautbax.examples.gsrestservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    new SpringApplicationBuilder(Application.class).web(WebApplicationType.SERVLET).run(args);
  }
}
