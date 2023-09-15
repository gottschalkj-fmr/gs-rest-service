/* 
 * Copyright (c) 2020 gottschalkj-fmr.
 * Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.github.gottschalkjfmr.examples.gsrestservice;

public class Greeting {

    private final long id;
    private final String content;

    @SuppressWarnings("WeakerAccess")
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @SuppressWarnings("unused")
    public long getId() {
        return id;
    }

    @SuppressWarnings("unused")
    public String getContent() {
        return content;
    }
}
