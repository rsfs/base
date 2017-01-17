package com.datatoinfo.app.base.repository.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datatoinfo.app.base.model.client.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}