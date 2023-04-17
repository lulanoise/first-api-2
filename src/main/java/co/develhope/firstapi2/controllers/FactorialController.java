package co.develhope.firstapi2.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class FactorialController {

    @GetMapping("/factorial/{n}")
    public long factorial(@PathVariable int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a non-negative integer");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}