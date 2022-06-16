package com.example.backendproject.service;

import com.example.backendproject.model.ContactUs;
import com.example.backendproject.repository.ContatUsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatUsService {

    @Autowired
    public ContatUsRepository contatUsRepository;

    public ContactUs saveAll(ContactUs contactUs){
        return contatUsRepository.save(contactUs);
    }
    public List<ContactUs> getContactUs(){
        return contatUsRepository.findAll();
    }

    public List<ContactUs> deleteContactUs(Long id) {
        return contatUsRepository.deleteAllById(id);
    }
//    public void deleteContactUs(Long id) {
//        boolean exists = contatUsRepository.existsById(id);
//        if(!exists){
//            throw  new IllegalStateException("user with id " + id + " does not exist");
//        }
//        contatUsRepository.deleteById(id);
//    }
}
