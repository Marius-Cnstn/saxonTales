package org.structure.persistence.armyEntities.equipmentEntities;

import lombok.Getter;
import lombok.Setter;
import org.structure.persistence.armyEntities.soldierEntities.Soldier;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class EquipmentAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer equipmentAttributeId;

    String equipmentAttributeName;

    Integer equipmentAttributeValue;

    private String relativeEquipmentCathegory;

    private String relativeEquipmentType;

    @ManyToMany(mappedBy = "equipmentAttributeList")
    private List<Equipment> equipmentList;

//    @ManyToMany(mappedBy = "equipmentAttributeList")
//    private List<Soldier> soldierList;


}
