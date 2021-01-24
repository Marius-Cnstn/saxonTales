package org.structure.repository.HomesteadRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.structure.persistence.homesteadEntities.Homestead;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Repository
public interface HomesteadRepository extends JpaRepository<Homestead, Integer> {




}
