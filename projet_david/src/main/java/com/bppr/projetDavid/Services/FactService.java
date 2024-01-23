package com.bppr.projetDavid.Services;


import com.bppr.projetDavid.Model.FactModel;
import com.bppr.projetDavid.Model.Repository.FactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactService {

    @Autowired
    FactRepository factRepository;

    public List<FactModel> getAll(){
        return factRepository.findAll();
    }

    public FactModel getAllById(Integer id) {
        return factRepository.getReferenceById(id);
    }

    public FactModel CreateId(FactModel factModel){
        return factRepository.save(factModel);
    }

    public void deleteFact(Integer id){
        factRepository.deleteById(id);
    }
}
