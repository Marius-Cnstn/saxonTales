package org.structure.persistence.armyEntities.soldierEntities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class SoldierPersonalAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer soldierAttributeId;

    private String soldierAttributeName;

    private Integer soldierAttributeValue;

    private String relativeCathegory;

    @ManyToMany(mappedBy = "personalAttributeList")
    private List<Soldier> soldierList;

}
