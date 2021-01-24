package org.structure.persistence.generalEntities;

import lombok.Getter;
import lombok.Setter;
import org.structure.persistence.armyEntities.Army;
import org.structure.persistence.homesteadEntities.Homestead;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Faction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer factionId;

    private String factionName;

    @OneToOne
    @JoinColumn(name = "warlordId")
    private Warlord warlord;

    @OneToOne
    @JoinColumn(name = "homesteadId")
    private Homestead homestead;

    @OneToOne
    @JoinColumn(name = "armyId")
    private Army army;
}
