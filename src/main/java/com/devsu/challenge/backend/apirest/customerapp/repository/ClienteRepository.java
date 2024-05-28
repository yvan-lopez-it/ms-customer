package com.devsu.challenge.backend.apirest.customerapp.repository;

import com.devsu.challenge.backend.apirest.customerapp.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
