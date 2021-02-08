package org.structure.services.armyServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.structure.persistence.armyEntities.soldierEntities.Soldier;
import org.structure.persistence.generalEntities.Warlord;
import org.structure.repository.armyRepository.SoldierRepository;
import org.structure.repository.generalRepository.WarlordRepository;

import java.util.List;

@Service
public class ArmyStatisticServices {

    @Autowired
    SoldierRepository soldierRepository;

    @Autowired
    WarlordRepository warlordRepository;

    public List<Soldier> showAllSoldiers(){
        return soldierRepository.findByOrderBySoldierCathegory_SoldierCathegoryId();
    }

    public Warlord showWarlordDetails(){
        return warlordRepository.getOne(1);
    }

}
