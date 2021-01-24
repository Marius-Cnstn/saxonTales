package org.structure.repository.armyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.armyEntities.soldierEntities.Soldier;

import java.util.List;

@Repository
public interface SoldierRepository extends JpaRepository<Soldier, Integer>{

    List<Soldier> findByOrderBySoldierCathegory_SoldierCathegoryId();

}
