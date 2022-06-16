package com.example.backendproject.controller;

import com.example.backendproject.model.ContactUs;
import com.example.backendproject.service.ContatUsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api")
@Transactional
@Slf4j
@CrossOrigin
public class ContactUsController {

    @Autowired
    public ContatUsService contatUsService;

    @PostMapping("/send")
    public ContactUs save(@RequestBody ContactUs contactUs){
        log.info("Contacted Saved Successfully !" );
        return contatUsService.saveAll(contactUs);
    }
    @GetMapping("/find")
    public List<ContactUs> getContactUs(){
        log.info("List with details of all details.");
        return contatUsService.getContactUs();
    }
//    @DeleteMapping("/delete/{id}")
//    public List<ContactUs> deleteContactUs(@PathVariable("id") Long id){
//        log.info("Delete forms by id!");
//        return contatUsService.deleteContactUs(id);
//    }
}
