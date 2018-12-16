package com.computer.sys.service;

import com.computer.sys.dto.FournisseurDto;
import com.computer.sys.repository.FournisseurRepository;
import com.computer.sys.util.EntityToDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FournisseurService {

    @Autowired
    FournisseurRepository fournisseurRepository;

    public List<FournisseurDto> getAllFournisseur(){
        return EntityToDto.mapFournisseursToFournisseursDto(fournisseurRepository.findAll());
    }
}
