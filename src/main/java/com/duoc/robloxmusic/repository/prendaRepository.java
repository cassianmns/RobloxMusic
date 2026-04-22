package com.duoc.robloxmusic.repository;

import com.duoc.robloxmusic.model.Prenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface prendaRepository extends JpaRepository<Prenda, Integer> {
}