package com.example.testexperementwebplusuuid;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Slf4j
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity<?> hello(HttpServletRequest request){
        return ResponseEntity.ok("Hello " + request.getRemoteUser());
    }

    //Test print new functional
    @GetMapping
    public ResponseEntity<?> helloWorldDefault(){
        return ResponseEntity.ok("Hello world");
    }

}
