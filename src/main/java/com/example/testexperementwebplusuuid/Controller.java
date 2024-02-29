package com.example.testexperementwebplusuuid;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.TimeZone;
import java.util.UUID;

@AllArgsConstructor
@RestController
@Slf4j
public class Controller {

    @GetMapping
    public ResponseEntity<?> hello(HttpServletRequest request){
        return ResponseEntity.ok("Hello " + request.getRemoteUser());
    }

    @GetMapping("/date")
    public ResponseEntity<?> getCurrentDate(HttpServletRequest request){
        return ResponseEntity.ok(Optional.ofNullable(request.getHeader("Data"))
                .orElse(LocalDateTime
                        .now()
                        .format(DateTimeFormatter.ofPattern("HH:mm"))));
    }

}
