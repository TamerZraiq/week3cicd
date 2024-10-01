package ie.atu.week3cicd;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class Week3 {
    @GetMapping("/hello")
    public String message(){
        return "Hello!";
    }
    @GetMapping("/message")
    public String getMessage(){
        return "Some Message";
    }
    @GetMapping("/hello/{name}")
    public String myName(@PathVariable String name){
        return "Your Name is " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age){
        return name + " " + age;
    }
}
