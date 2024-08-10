package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PressController {
    @Autowired
    private PressService pressService;
    @GetMapping("/press/{id}")
    public Press getPress(@PathVariable Long id) {
        return pressService.getPressById(id);
    }
}
