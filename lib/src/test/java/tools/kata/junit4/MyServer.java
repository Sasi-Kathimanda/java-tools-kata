package tools.kata.junit4;

import org.junit.rules.ExternalResource;

public class MyServer extends ExternalResource {

    @Override
    public void before() {
        //before start of the server
    }

    @Override
    public void after() {
        //after stopping server
    }

}
