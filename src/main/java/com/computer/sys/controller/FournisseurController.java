package com.computer.sys.controller;


import com.computer.sys.dto.FournisseurDto;
import com.computer.sys.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FournisseurController {


    @Autowired
    FournisseurService fournisseurService;

    @RequestMapping(value = "/api/fournisseurs", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<FournisseurDto>> getAllFournisseur() {
        List<FournisseurDto> fournisseursDto = fournisseurService.getAllFournisseur();
        if(fournisseursDto.isEmpty())
            return new ResponseEntity<>(fournisseursDto,HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(fournisseursDto, HttpStatus.OK);
    }

}
