package com.devsu.challenge.backend.apirest.customerapp.repository;

import com.devsu.challenge.backend.apirest.customerapp.entity.Cliente;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Optional<Cliente> getClienteByClientId(String clientId);

}
