package org.structure.repository.HomesteadRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.homesteadEntities.BuildingAttribute;

@Repository
public interface BuildingAttributeRepository extends JpaRepository<BuildingAttribute, Integer> {
}
