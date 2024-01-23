package com.dawes.tfg_daw.repository;

import com.dawes.tfg_daw.entity.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientEntity,Long> {
}
