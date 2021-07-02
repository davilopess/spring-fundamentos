package br.com.treinaweb.twclientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/mensagem")
    public ModelAndView mensagem() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("mensagem");
        modelAndView.addObject("mensagem", "mensagem do serv");

        return modelAndView;
    }
}