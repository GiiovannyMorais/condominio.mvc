package com.giovanny.condominio.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovanny.condominio.model.Apartamento;

@Repository
public interface ApartamentoRepository extends JpaRepository<Apartamento, Long> {
    List<Apartamento> findAllByOrderByNumeroPortaAsc();
    List<Apartamento> findByProprietarioId(Long proprietarioId);
}