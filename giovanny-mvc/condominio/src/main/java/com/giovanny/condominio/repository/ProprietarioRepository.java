package com.giovanny.condominio.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovanny.condominio.model.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
    List<Proprietario> findAllByOrderByNomeAsc();
}