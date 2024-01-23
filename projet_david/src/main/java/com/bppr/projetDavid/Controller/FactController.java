package com.bppr.projetDavid.Controller;


import com.bppr.projetDavid.Model.FactModel;

import com.bppr.projetDavid.Services.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "fact")
public class FactController {

    @Autowired
    FactService factService;

    @GetMapping()
    public List<FactModel> FactAll() {
        return factService.getAll();
    }
    @GetMapping(path ="{id}")
        public FactModel FactById(Integer id){
        return factService.getAllById(id);
    }

    @PostMapping()
    public FactModel FactCreate(@RequestBody FactModel factModel){
        return factService.CreateId(factModel);
    }


}
