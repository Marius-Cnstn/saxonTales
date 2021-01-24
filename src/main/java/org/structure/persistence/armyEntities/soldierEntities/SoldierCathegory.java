package org.structure.persistence.armyEntities.soldierEntities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class SoldierCathegory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer soldierCathegoryId;

    private String soldierCathegoryName;

}
