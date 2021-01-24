package org.structure.repository.armyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.armyEntities.equipmentEntities.EquipmentType;

@Repository
public interface EquipmentTypeRepository extends JpaRepository<EquipmentType, Integer> {

}
