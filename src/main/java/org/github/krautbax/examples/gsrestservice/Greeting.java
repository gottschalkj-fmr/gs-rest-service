package org.github.krautbax.examples.gsrestservice;

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
