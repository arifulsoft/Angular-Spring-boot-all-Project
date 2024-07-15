package com.example.demo.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Signup;
import com.example.demo.Repository.SignupRepo;

@RestController
@CrossOrigin("*")
public class SignupControlar {
    private final SignupRepo signupRepo;

    public SignupControlar(SignupRepo signupRepo) {
        this.signupRepo = signupRepo;
    }

    List<Signup> llist = new ArrayList<>();

    @PostMapping("/insertdata")
    public Signup doinsert(@RequestBody Signup s) {
        Signup data = signupRepo.save(s);
        return data;
    }

    @GetMapping("/showalldata")
    public List<Signup> show() {
        llist = (List<Signup>) signupRepo.findAll();
        return llist;
    }

    @GetMapping("/{id}/{password}")
    public Signup login(@PathVariable int id, @PathVariable String password) {
        Signup data = signupRepo.findByIdAndPassword(id, password);
        return data;
    }
    
    @PostMapping(value = "/login2")
    public Signup signinAdmin(@RequestBody Signup loginRequest) {
        Signup data = signupRepo.findByIdAndPassword(loginRequest.getId(), loginRequest.getPassword());
        return data;
    }


}
