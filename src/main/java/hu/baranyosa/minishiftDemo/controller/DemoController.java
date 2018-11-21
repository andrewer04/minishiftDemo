package hu.baranyosa.minishiftDemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class DemoController {

    @GetMapping("/{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok("Szervusz " + name);
    }


}
