package com.jdbc.crud.controller;

import com.jdbc.crud.model.student;
import com.jdbc.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StdController {

    @Autowired
    StudentRepository repo;

    @RequestMapping("/")
    public String homeMethod() {
        return "home";
    }

    @RequestMapping("/create")
    public String createMethod() {
        return "createFile";
    }

    @RequestMapping("/created")
    public String createdMethod(student obj) {
        repo.save(obj);
        return "redirect:/";
    }

    @RequestMapping("/display")
    public String display(Model mdl){
        List<student> list = repo.findAll();
        mdl.addAttribute("std",list);
        return "display";
    }

    @RequestMapping("/update")
    public String updateMethod(){
            return "update";
    }

    @RequestMapping("/delete")
    public String deleteMethod(){
        return "delete";
    }

    @RequestMapping("/deleted")
    public String deletedMethod(@RequestParam int id){
        repo.deleteById(id);
        return "redirect:/";
    }
}
