package org.structure.repository.HomesteadRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.homesteadEntities.BuildingLevel;

@Repository
public interface BuildingLevelRepository extends JpaRepository<BuildingLevel, Integer> {
}
