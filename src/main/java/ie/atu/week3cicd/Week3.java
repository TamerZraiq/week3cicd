package ie.atu.week3cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String getDetails(){
        return "Some Other Message";
    }
}
