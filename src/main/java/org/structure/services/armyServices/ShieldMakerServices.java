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
public class ShieldMakerServices {


    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    EquipmentCathegoryRepository equipmentCathegoryRepository;

    @Autowired
    EquipmentTypeRepository equipmentTypeRepository;

    @Autowired
    EquipmentAttributeRepository equipmentAttributeRepository;

    public Equipment assignHeavyShield() {

        List<EquipmentAttribute> equipmentAttributeListShield = new ArrayList<>();
        EquipmentAttribute defense = equipmentAttributeRepository.getOne(7);

        equipmentAttributeListShield.add(defense);

        Equipment heavyShield = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(3))
                .equipmentType(equipmentTypeRepository.getOne(7))
                .equipmentAttributeList(equipmentAttributeListShield)
                .assign();

        equipmentRepository.save(heavyShield);

        return heavyShield;
    }

    public Equipment assignLightShield() {

        List<EquipmentAttribute> equipmentAttributeListShield = new ArrayList<>();
        EquipmentAttribute defense = equipmentAttributeRepository.getOne(6);

        equipmentAttributeListShield.add(defense);

        Equipment lightShield = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(3))
                .equipmentType(equipmentTypeRepository.getOne(6))
                .equipmentAttributeList(equipmentAttributeListShield)
                .assign();

        equipmentRepository.save(lightShield);

        return lightShield;
    }

}
