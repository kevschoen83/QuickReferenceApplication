package com.genspark.practice.Controller;

import com.genspark.practice.Entity.MyEntity;
import com.genspark.practice.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MyController {

    @Autowired
    private MyService myService;

    @GetMapping("/home")
    public String home() {
        return "<html><h1>Welcome to my entity application!</h1></html>";
    }

    @GetMapping("/entities")
    public List<MyEntity> getAllEntities() {
        return this.myService.getAllEntities();
    }

    @GetMapping("/entities/{myId}")
    public MyEntity getEntity(@PathVariable String myId) {
        return this.myService.getEntityById(Integer.parseInt(myId));
    }

    @PostMapping("/entities")
    public MyEntity addEntity(@RequestBody MyEntity myEntity) {
        return this.myService.addEntity(myEntity);
    }

    @PutMapping("/entities")
    public MyEntity updateEntity(@RequestBody MyEntity myEntity) {
        return this.myService.updateEntity(myEntity);
    }

    @DeleteMapping("/entities/{myId}")
    public String deleteEntity(@PathVariable String myId) {
        return this.myService.deleteEntityById(Integer.parseInt(myId));
    }

}
