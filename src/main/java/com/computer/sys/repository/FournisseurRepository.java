package com.computer.sys.repository;

import com.computer.sys.entities.Fourniseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Fourniseur,Integer > {

    Fourniseur findByAdresse(String adresse);

}
