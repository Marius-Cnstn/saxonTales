package org.structure.repository.HomesteadRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.homesteadEntities.BuildingCathegory;

@Repository
public interface BuildingCathegoryRepository extends JpaRepository<BuildingCathegory, Integer> {


}
