package com.example.local2002.collections;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstCollections {
    @GetMapping
    public String start (){
        return  "Приложение запущено!";
    }


    @GetMapping("path/info")
    public String info (){
        return  "имя ученика,\n" +
                "название проекта,\n" +
                "дату создания проекта,\n" +
                "описание проекта.";
    }

    @GetMapping ("path/to/info")
    public String page (@RequestParam String page){
        return  "Page: "+page;
    }



}



