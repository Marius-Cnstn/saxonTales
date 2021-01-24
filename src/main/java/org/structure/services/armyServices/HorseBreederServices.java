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
public class HorseBreederServices {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    EquipmentCathegoryRepository equipmentCathegoryRepository;

    @Autowired
    EquipmentTypeRepository equipmentTypeRepository;

    @Autowired
    EquipmentAttributeRepository equipmentAttributeRepository;

    public Equipment assignWarhorse() {

        List<EquipmentAttribute> equipmentAttributeListWarhorse = new ArrayList<>();

        EquipmentAttribute speedBonus = equipmentAttributeRepository.getOne(9);
        EquipmentAttribute attackBonus = equipmentAttributeRepository.getOne(10);

        equipmentAttributeListWarhorse.add(speedBonus);
        equipmentAttributeListWarhorse.add(attackBonus);

        Equipment warhorse = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(4))
                .equipmentType(equipmentTypeRepository.getOne(8))
                .equipmentAttributeList(equipmentAttributeListWarhorse)
                .assign();

        equipmentRepository.save(warhorse);

        return warhorse;
    }

}
