package com.example.backendproject.repository;

import com.example.backendproject.model.ContactUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatUsRepository extends JpaRepository<ContactUs, Long> {
    List<ContactUs> deleteAllById(Long id);
}
