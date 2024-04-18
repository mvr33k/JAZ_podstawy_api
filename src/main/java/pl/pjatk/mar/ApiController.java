package pl.pjatk.mar;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class ApiController {

    @GetMapping("/hello")
    public ResponseEntity<String> returnHello(
            @RequestParam("reqParam") String someValue) {
        if (!someValue.isEmpty()) {
            return ResponseEntity.ok(someValue);
        } else return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> returnHelloPath(
            @PathVariable() String someValue) {
        return ResponseEntity.ok(someValue);
    }


    @PostMapping("/model")
    public ResponseEntity<Car> returnCar(
            @RequestBody Car newCar) {
        return ResponseEntity.ok(newCar);
    }
}
