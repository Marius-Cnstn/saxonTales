package org.structure.repository.armyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.armyEntities.equipmentEntities.EquipmentAttribute;

@Repository
public interface EquipmentAttributeRepository extends JpaRepository<EquipmentAttribute, Integer> {



}
