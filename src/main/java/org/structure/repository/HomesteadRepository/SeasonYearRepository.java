package org.structure.repository.HomesteadRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.generalEntities.Season;
import org.structure.persistence.generalEntities.SeasonYear;

@Repository
public interface SeasonYearRepository extends JpaRepository<SeasonYear, Integer> {



}
