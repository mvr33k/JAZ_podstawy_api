package pl.pjatk.mar;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")
public class HomeworkController {

    @GetMapping("/get")
    public ResponseEntity<String> getParam(
            @RequestParam("req") String someValue) {
        return ResponseEntity.ok(someValue);
    }
    @GetMapping("/get/{someValue}")
    public ResponseEntity<String> getPath(
            @PathVariable String someValue) {
        return ResponseEntity.ok(someValue);
    }
//    get działa ^
    @PutMapping("/put/{someValue}")
    public ResponseEntity<Car> putReturnCar(
            @PathVariable String someValue,
            @RequestBody int rok ){
        Car newCar=new Car(someValue,rok);
        return ResponseEntity.ok(newCar);
    }
//    put działa ale
//    post przy przekazywaniu roku przyjmuje raw/json (raw/text nie) ale przyjmuje pojedyńczą wartość i body wygląda np. tak jak poniżej:
//    2002

    @PostMapping("/post")
    public ResponseEntity<Car> createReturnCar(
            @RequestBody String marka) {
        return ResponseEntity.ok(new Car(marka, 2001));
    }
//    post działa


    @DeleteMapping("/delete/{someValue}")
    public ResponseEntity deleteSomething(
            @PathVariable String someValue){
        return ResponseEntity.ok().build();
    }
//    git
//    2 podejście zwraca ok w body
//    @DeleteMapping("/delete/{someValue}")
//    public HttpStatus deleteSomething(
//            @PathVariable String someValue){
//        return HttpStatus.OK;
//    }

}
