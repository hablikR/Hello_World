package hello;

import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/api/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="JSON") String name) {
        return new Greeting(String.format(template, name));
    }

    @RequestMapping("/api/greeting/{userName}")
    public Greeting greetingUser(@PathVariable(value="userName") String name) {
        return new Greeting(String.format(template, StaticFunctions.CapitalFirstLetter(name)));
    }

    @RequestMapping("/api/db")
    public String returnDb() {
        return new TesttableEntity().getName();
    }

}