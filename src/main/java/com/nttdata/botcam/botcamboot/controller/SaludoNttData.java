package com.nttdata.botcam.botcamboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class SaludoNttData {

    @GetMapping("/saludame")
    public String SaludarNttData(){
        return "Hola a todos somos de NttData";
    }

}
