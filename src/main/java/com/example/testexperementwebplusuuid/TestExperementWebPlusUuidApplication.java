package com.example.testexperementwebplusuuid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.SimpleTimeZone;
import java.util.TimeZone;


@SpringBootApplication
public class TestExperementWebPlusUuidApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestExperementWebPlusUuidApplication.class);
    }
}


