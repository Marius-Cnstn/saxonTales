package org.structure.persistence.armyEntities.equipmentEntities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class EquipmentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer equipmentTypeId;

    String equipmentTypeName;

    private String relativeCathegory;

}
