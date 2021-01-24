package org.structure.repository.HomesteadRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.generalEntities.Season;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Integer> {
}
