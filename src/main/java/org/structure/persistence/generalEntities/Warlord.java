package org.structure.persistence.generalEntities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.structure.persistence.armyEntities.Army;
import org.structure.persistence.armyEntities.equipmentEntities.Equipment;
import org.structure.persistence.armyEntities.equipmentEntities.EquipmentAttribute;
import org.structure.persistence.armyEntities.equipmentEntities.EquipmentCathegory;
import org.structure.persistence.armyEntities.equipmentEntities.EquipmentType;
import org.structure.repository.armyRepository.EquipmentAttributeRepository;
import org.structure.repository.armyRepository.EquipmentCathegoryRepository;
import org.structure.repository.armyRepository.EquipmentRepository;
import org.structure.repository.armyRepository.EquipmentTypeRepository;

import javax.persistence.*;
import java.util.List;


//@Component //- dc e bean, nu ii mai dau @Component
@Entity
//@Scope("singleton")//TODO - cum e aici? sunt entitati definite indiv, nu poti face o serie de Warlords
@Getter
@Setter
public class Warlord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer warlordId;

    private String warlordFirstName;

    private String warlordNickName;

    private Integer warlordProfitShare;

    private Integer warlordEconomicBonus;

    private Integer warlordAttackBonus;

    private Integer attack;

    private Integer defense;

    @ManyToMany
    @JoinTable(name ="warlords_to_equipment",
            joinColumns = {@JoinColumn(name = "soldierId")},
            inverseJoinColumns = {@JoinColumn(name = "equipmentId")}
    )
    private List<Equipment> equipmentList;

}//de clasa
