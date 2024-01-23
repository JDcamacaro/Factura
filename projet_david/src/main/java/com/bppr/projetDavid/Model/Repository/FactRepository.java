package com.bppr.projetDavid.Model.Repository;

import com.bppr.projetDavid.Model.FactModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FactRepository  extends JpaRepository<FactModel, Integer>{

}
