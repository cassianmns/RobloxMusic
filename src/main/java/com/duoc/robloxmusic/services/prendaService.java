package com.duoc.robloxmusic.services;

import com.duoc.robloxmusic.model.Prenda;
import com.duoc.robloxmusic.repository.prendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class prendaService {

    @Autowired
    private prendaRepository PrendaRepository;

    public List<Prenda> getPrendas() {
        return PrendaRepository.findAll();
    }

    public Prenda savePrenda(Prenda prenda) {
        return PrendaRepository.save(prenda);
    }

    public Prenda getPrendaId(int id) {
        return PrendaRepository.findById(id).orElse(null);
    }

    public Prenda updatePrenda(Prenda prenda) {
        if (!PrendaRepository.existsById(prenda.getId())) {
            return null;
        }
        return PrendaRepository.save(prenda);
    }

    public void deletePrenda(int id) {
        PrendaRepository.deleteById(id);
    }
}