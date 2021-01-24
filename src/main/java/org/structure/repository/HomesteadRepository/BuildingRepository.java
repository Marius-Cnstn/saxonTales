package org.structure.repository.HomesteadRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.homesteadEntities.Building;
import org.structure.persistence.homesteadEntities.BuildingCathegory;

import java.util.List;


@Repository
public interface BuildingRepository extends JpaRepository<Building, Integer> {

//    List<Building> findBuildingsByBuildingCathegory_BuildingCathegoryId(Integer id);
    List<Building> findByOrderByBuildingCathegory_BuildingCathegoryId();



}
