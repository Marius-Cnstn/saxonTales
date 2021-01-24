package org.structure.persistence.armyEntities.soldierEntities;

import lombok.*;
import org.structure.persistence.armyEntities.Army;
import org.structure.persistence.armyEntities.equipmentEntities.Equipment;

import javax.persistence.*;
import java.util.List;


//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
//@JsonSubTypes({
//        @JsonSubTypes.Type(value = ArcherEntity.class, name = "ArcherEntity"),
//        @JsonSubTypes.Type(value = CavalryEntity.class, name = "CavalryEntity"),
//        @JsonSubTypes.Type(value = Infantry.class, name = "Infantry"),
//        @JsonSubTypes.Type(value = Warlord.class, name = "Warlord")
//})
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "soldierType")
@Entity
@Table
@Getter
@Builder(buildMethodName = "train", builderMethodName = "trainer")
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Soldier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer soldierId;

    @OneToOne
    @JoinColumn(name = "soldierCathegoryId")
    private SoldierCathegory soldierCathegory;

    @ManyToMany
    @JoinTable(name = "soldiers_to_equipment",
            joinColumns = {@JoinColumn(name = "soldierId")},
            inverseJoinColumns = {@JoinColumn(name = "equipmentId")}
    )
    private List<Equipment> equipmentList;

    @ManyToMany
    @JoinTable(name = "soldiers_to_personal_attributes",
            joinColumns = {@JoinColumn(name = "soldierId")},
            inverseJoinColumns = {@JoinColumn(name = "soldierAttributeId")}
    )
    private List<SoldierPersonalAttribute> personalAttributeList;

    @ManyToOne
    @JoinColumn(name = "armyId")
    private Army army;

    private Integer attack;

    private Integer defense;

    //special characters like Warlords
    private String firstName;

    private String nickName;

    private Integer profitShare;

    private Integer economicBonus;

    private Integer attackBonus;

//END special characters like Warlords



}
