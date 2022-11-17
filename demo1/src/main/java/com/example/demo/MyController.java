package com.example.demo;

import com.example.demo.jdbc.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    @Autowired
    private PersonDAO personDAO;


    @RequestMapping("/")
    public String root(Model model){
        model.addAttribute("user",personDAO.list());

        return "userlist";
    }
    @RequestMapping("/write")
    public String wrtie(@RequestParam String name, @RequestParam String text) {
        personDAO.insert(name, text);
        return "redirect:/";
    }
}
