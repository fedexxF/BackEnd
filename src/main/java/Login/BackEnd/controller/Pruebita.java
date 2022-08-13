package Login.BackEnd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pruebita {

    @GetMapping("/miInfo")
    public String miINFO(){
        return "HOLAAAA FEDEEEEEEEE";
    }

}
