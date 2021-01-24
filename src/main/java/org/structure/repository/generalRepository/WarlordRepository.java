package org.structure.repository.generalRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.generalEntities.Warlord;

@Repository
public interface WarlordRepository extends JpaRepository <Warlord, Integer> {

}
