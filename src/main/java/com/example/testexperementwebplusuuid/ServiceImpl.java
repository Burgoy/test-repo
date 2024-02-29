package com.example.testexperementwebplusuuid;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ServiceImpl {
    /**
    Любая функция которя ничего не делает и млужит для проверки merge request,
    не стоит вдоваться в подробности это просто тест
    **/
    private static final String SOME_TEXT = "Hello world";

    public void i() {
        System.out.println(SOME_TEXT);
    }
}
