package org.structure.persistence.armyEntities.equipmentEntities;

import lombok.*;
import org.structure.persistence.armyEntities.soldierEntities.Soldier;
import org.structure.persistence.generalEntities.Warlord;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Builder(buildMethodName = "assign", builderMethodName = "assignor")
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer equipmentId;

    @OneToOne
    @JoinColumn(name = "equipmentCathegoryId")
    private EquipmentCathegory equipmentCathegory;

    @OneToOne
    @JoinColumn(name = "equipmentTypeId")
    private EquipmentType equipmentType;

    @ManyToMany(mappedBy = "equipmentList")
    private List<Soldier> soldierList;

    @ManyToMany(mappedBy = "equipmentList")
    private List<Warlord> warlordList;

    @ManyToMany
    @JoinTable(
            name = "equipments_to_attributes",
            joinColumns = {@JoinColumn(name = "equipmentId")},
            inverseJoinColumns = {@JoinColumn(name = "equipmentAttributeId")}
    )
    private List<EquipmentAttribute> equipmentAttributeList;

}
