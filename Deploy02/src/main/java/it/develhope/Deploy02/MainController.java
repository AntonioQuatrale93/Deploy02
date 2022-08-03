package it.develhope.Deploy02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MainController  {

    @GetMapping
    public int sum(){
        return 10+5;
    }
}
