package com.example.demo9.controller;

import com.example.demo9.jdbc.IuserDao;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class MyController {

    @Autowired
    IuserDao iuserDao;

    @GetMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/index")
    public String index2(Model model) {
        model.addAttribute("count", 100);
        return "index";
    }

    @RequestMapping("/{num}")
    public String index4(@PathVariable int num, Model model) {
        model.addAttribute("count", num);
        return "index";
    }

    @RequestMapping(value = "/index3", method = RequestMethod.GET)
    public ModelAndView index3(ModelAndView mav) {
        mav.addObject("count", 500);
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", iuserDao.list());
        return "listUser";
    }

    @GetMapping("/input")
    public String input(@RequestParam String name,
                        @RequestParam String text) {
        int res = iuserDao.insert(name,text);
        log.info("============= " + res+ "건이 입력되었습니다.");
        return "redirect:/list";
    }

    @GetMapping("/del")
    public String delete(@RequestParam int id) {
        int res = iuserDao.delete(id);
        log.info("============= " + res+ "건이 입력되었습니다.");
        return "redirect:/list";
    }

    @GetMapping("/update")
    public String update(@RequestParam String name, @RequestParam String text) {
        int res = iuserDao.update(name,text);
        log.info("============= " + res+ "건이 입력되었습니다.");
        return "redirect:/list";
    }

}
