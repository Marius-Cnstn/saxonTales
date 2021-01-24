package org.structure.services.armyServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.structure.persistence.armyEntities.equipmentEntities.Equipment;
import org.structure.persistence.armyEntities.equipmentEntities.EquipmentAttribute;
import org.structure.repository.armyRepository.EquipmentAttributeRepository;
import org.structure.repository.armyRepository.EquipmentCathegoryRepository;
import org.structure.repository.armyRepository.EquipmentRepository;
import org.structure.repository.armyRepository.EquipmentTypeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArmourerServices {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    EquipmentCathegoryRepository equipmentCathegoryRepository;

    @Autowired
    EquipmentTypeRepository equipmentTypeRepository;

    @Autowired
    EquipmentAttributeRepository equipmentAttributeRepository;

    public Equipment assignLeatherArmor() {

        List<EquipmentAttribute> equipmentAttributeListArmor = new ArrayList<>();
        EquipmentAttribute defense = equipmentAttributeRepository.getOne(4);

        equipmentAttributeListArmor.add(defense);

        Equipment leatherArmor = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(2))
                .equipmentType(equipmentTypeRepository.getOne(4))
                .equipmentAttributeList(equipmentAttributeListArmor)
                .assign();

        equipmentRepository.save(leatherArmor);

        return leatherArmor;
    }

    public Equipment assignChainMailArmor() {

        List<EquipmentAttribute> equipmentAttributeListArmor = new ArrayList<>();
        EquipmentAttribute defense = equipmentAttributeRepository.getOne(7);

        equipmentAttributeListArmor.add(defense);

        Equipment chainMailArmor = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(2))
                .equipmentType(equipmentTypeRepository.getOne(5))
                .equipmentAttributeList(equipmentAttributeListArmor)
                .assign();

        equipmentRepository.save(chainMailArmor);

        return chainMailArmor;
    }

}
