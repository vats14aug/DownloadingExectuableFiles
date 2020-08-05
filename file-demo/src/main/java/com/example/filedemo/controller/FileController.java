package com.example.filedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FileController {


    @GetMapping("/file")
    public String downloadFile() {
    	String fileName="https://github.com/notepad-plus-plus/notepad-plus-plus/releases/download/v7.8.8/npp.7.8.8.Installer.exe";
    	//String fileName="https://10.10.1.45:8083/emessenger/desktop";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(fileName, String.class);
         
        return result;
		
	}

   

}