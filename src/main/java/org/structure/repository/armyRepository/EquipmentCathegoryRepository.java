package org.structure.repository.armyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.armyEntities.equipmentEntities.EquipmentCathegory;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface EquipmentCathegoryRepository extends JpaRepository<EquipmentCathegory, Integer> {

}
