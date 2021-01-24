package org.structure.services.homesteadServices;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.structure.persistence.homesteadEntities.Building;
import org.structure.repository.HomesteadRepository.BuildingRepository;

import java.util.List;

@Service
public class BuildingStatisticServices {

    @Autowired
    BuildingRepository buildingRepository;

    public List<Building> showAllBuildings(){
        return buildingRepository.findByOrderByBuildingCathegory_BuildingCathegoryId();
    }

//    public List<Building> showAllPorts(){
//        return buildingRepository.findBuildingsByBuildingCathegory_BuildingCathegoryId(1);
//    }

//    public List<Building> showAllWorkshops(){
//        return buildingRepository.findBuildingsByBuildingCathegory_BuildingCathegoryId(2);
//    }

}//de clasa
