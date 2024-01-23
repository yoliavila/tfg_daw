package com.dawes.tfg_daw.repository;

import com.dawes.tfg_daw.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
