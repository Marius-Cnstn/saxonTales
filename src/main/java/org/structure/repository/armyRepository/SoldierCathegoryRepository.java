package org.structure.repository.armyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.armyEntities.soldierEntities.SoldierCathegory;

@Repository
public interface SoldierCathegoryRepository extends JpaRepository<SoldierCathegory, Integer> {

}
