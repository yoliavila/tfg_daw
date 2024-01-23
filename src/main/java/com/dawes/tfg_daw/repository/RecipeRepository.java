package com.dawes.tfg_daw.repository;

import com.dawes.tfg_daw.entity.RecipeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RecipeRepository extends JpaRepository<RecipeEntity,Long> {
}
