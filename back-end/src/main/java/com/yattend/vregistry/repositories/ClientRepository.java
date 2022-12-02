package com.yattend.vregistry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yattend.vregistry.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
