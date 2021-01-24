package org.structure.persistence.armyEntities;

import lombok.Getter;
import lombok.Setter;
import org.structure.persistence.armyEntities.soldierEntities.Soldier;
import org.structure.persistence.generalEntities.Warlord;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Army {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer armyId;

    @OneToOne
    @JoinColumn(name = "warlordId")
    private Warlord warlord;

    @OneToMany(mappedBy = "army")
    private List<Soldier> soldierList;


}//de clasa
