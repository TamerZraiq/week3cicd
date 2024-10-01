package ie.atu.week3cicd;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class Calc {
    @GetMapping("/calculate")
    public String calculate(@RequestParam int num1, @RequestParam int num2,  @RequestParam String operation){

        switch (operation) {
            case "add":
                int add = num1 + num2;
                return num1 + " + " + num2 + " = " + add;
            case "subtract":
                int subtract = num1 - num2;
                return num1 + " - " + num2 + " = " + subtract;
            case "multiply":
                int multiply = num1 * num2;
                return num1 + " x " + num2 + " = " + multiply;

            case "divide":
                float divide = (float)num1 / (float)num2;
                if(num2 == 0){
                    return "Error!! second number shouldn't be 0";
                }
                return num1 + " / " + num2 + " = " + divide;
        }
    return operation;
    }
}
