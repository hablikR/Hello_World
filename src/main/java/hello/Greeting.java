package hello;

public class Greeting {


    private final String greeting;

    public Greeting(String content) {
        this.greeting = content;
    }

    public String getContent() {
        return greeting;
    }
}