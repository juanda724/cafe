package com.finca.cafedb.repository;

import com.finca.cafedb.entity.VariedadCafe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariedadCafeRepository 
        extends JpaRepository<VariedadCafe, Long> {
}