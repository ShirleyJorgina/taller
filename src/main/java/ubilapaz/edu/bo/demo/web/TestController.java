package ubilapaz.edu.bo.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public ResponseEntity<String> test(){

        return new ResponseEntity<String>("", HttpStatus.OK);
    }
}
