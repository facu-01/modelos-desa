package com.example.repositories;

import com.example.entities.Factura;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long> {
}
