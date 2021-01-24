package org.structure.persistence.armyEntities.equipmentEntities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class EquipmentCathegory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer equipmentCathegoryId;

    String equipmentCathegoryName;

}
