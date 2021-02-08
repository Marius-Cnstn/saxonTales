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
public class WeaponsmithServices {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    EquipmentCathegoryRepository equipmentCathegoryRepository;

    @Autowired
    EquipmentTypeRepository equipmentTypeRepository;

    @Autowired
    EquipmentAttributeRepository equipmentAttributeRepository;

    public Equipment assignSword() {

        List<EquipmentAttribute> equipmentAttributeListSword = new ArrayList<>();
        EquipmentAttribute attack = equipmentAttributeRepository.getOne(1);

        equipmentAttributeListSword.add(attack);

        Equipment sword = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(1))
                .equipmentType(equipmentTypeRepository.getOne(1))
                .equipmentAttributeList(equipmentAttributeListSword)
                .assign();

        equipmentRepository.save(sword);
        return sword;
    }

    public Equipment assignLance() {

        List<EquipmentAttribute> equipmentAttributeListLance = new ArrayList<>();
        EquipmentAttribute attack = equipmentAttributeRepository.getOne(2);

        equipmentAttributeListLance.add(attack);

        Equipment lance = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(1))
                .equipmentType(equipmentTypeRepository.getOne(2))
                .equipmentAttributeList(equipmentAttributeListLance)
                .assign();

        equipmentRepository.save(lance);
        return lance;
    }

    public Equipment assignBow() {

        List<EquipmentAttribute> equipmentAttributeListBow = new ArrayList<>();
        EquipmentAttribute attack = equipmentAttributeRepository.getOne(3);

        equipmentAttributeListBow.add(attack);

        Equipment bow = Equipment.assignor()
                .equipmentCathegory(equipmentCathegoryRepository.getOne(1))
                .equipmentType(equipmentTypeRepository.getOne(3))
                .equipmentAttributeList(equipmentAttributeListBow)
                .assign();

        equipmentRepository.save(bow);
        return bow;
    }
}
