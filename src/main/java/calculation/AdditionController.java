package calculation;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

    @RequestMapping("/add/{first}/{second}")
    private String add(@PathVariable int first, @PathVariable int second){
        double cal = first+second;
        String calc = "Addition of " + first + " and " + second + " = " + (int)cal;
        return calc;
    }
    @RequestMapping("/subtract/{first}/{second}")
    private String sub(@PathVariable int first, @PathVariable int second){
        double cal = first-second;
        String calc = "Subtraction of " + first + " and " + second + " = " + (int)cal;
        return calc;
    }
    @RequestMapping("/multiply/{first}/{second}")
    private String mult(@PathVariable int first, @PathVariable int second){
        double cal = first*second;
        String calc = "Multiplication of " + first + " and " + second + " = " + (int)cal;
        return calc;
    }
    @RequestMapping("/divide/{first}/{second}")
    private String divide(@PathVariable int first, @PathVariable int second){
        double cal = (double)first/(double)second;
        String calc = "Division of " + first + " and " + second + " = " + (int)cal;
        return calc;
    }
}
