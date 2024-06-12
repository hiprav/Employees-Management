package com.CRUD.reposetory;

import com.CRUD.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact,String> {
    @Override
    Optional<Contact> findById(String id);
}
