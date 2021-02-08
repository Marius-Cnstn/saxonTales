package org.structure.services.armyServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.structure.persistence.armyEntities.equipmentEntities.Equipment;
import org.structure.persistence.armyEntities.soldierEntities.Soldier;
import org.structure.persistence.armyEntities.soldierEntities.SoldierPersonalAttribute;
import org.structure.repository.HomesteadRepository.HomesteadRepository;
import org.structure.repository.armyRepository.EquipmentRepository;
import org.structure.repository.armyRepository.SoldierCathegoryRepository;
import org.structure.repository.armyRepository.SoldierPersonalAttributeRepository;
import org.structure.repository.armyRepository.SoldierRepository;
import org.structure.repository.generalRepository.WarlordRepository;
import org.structure.services.homesteadServices.HomesteadServices;

import java.util.ArrayList;
import java.util.List;

@Service
public class SoldierRecruitmentServices {

    @Autowired
    SoldierRepository soldierRepository;

    @Autowired
    SoldierCathegoryRepository soldierCathegoryRepository;

    @Autowired
    SoldierPersonalAttributeRepository soldierPersonalAttributeRepository;

    @Autowired
    EquipmentRepository equipmentRepository;

//    @Autowired
//    EquipmentCathegoryRepository equipmentCathegoryRepository;
//
//    @Autowired
//    EquipmentTypeRepository equipmentTypeRepository;
//
//    @Autowired
//    EquipmentAttributeRepository equipmentAttributeRepository;

    @Autowired
    HomesteadRepository homesteadRepository;

    @Autowired
    HomesteadServices homesteadServices;

    @Autowired
    WarlordRepository warlordRepository;

    @Autowired
    WeaponsmithServices weaponsmithServices;

    @Autowired
    ShieldMakerServices shieldMakerServices;

    @Autowired
    ArmourerServices armourerServices;

    @Autowired
    HorseBreederServices horseBreederServices;

    public Soldier recruitInfantryman() {

        ////Equipment List

        Equipment sword = weaponsmithServices.assignSword();

        Equipment chainMailArmor = armourerServices.assignChainMailArmor();

        Equipment heavyShield = shieldMakerServices.assignHeavyShield();

        List<Equipment> equipmentList = new ArrayList<Equipment>();
        equipmentList.add(sword);
        equipmentList.add(chainMailArmor);
        equipmentList.add(heavyShield);

        ////End Equipment List

        ////Personal Attribute List

        List<SoldierPersonalAttribute> soldierPersonalAttributeList = new ArrayList<>();
        SoldierPersonalAttribute recruitmentPrice = soldierPersonalAttributeRepository.getOne(1);
        SoldierPersonalAttribute upkeepPerSeason = soldierPersonalAttributeRepository.getOne(2);

        soldierPersonalAttributeList.add(recruitmentPrice);
        soldierPersonalAttributeList.add(upkeepPerSeason);

        ////End Personal Attribute List

        ////Compose Soldier

        Soldier infantryman = Soldier.trainer()
                .soldierCathegory(soldierCathegoryRepository.getOne(1))
                .equipmentList(equipmentList)
                .personalAttributeList(soldierPersonalAttributeList)
                .attack(sword.getEquipmentAttributeList().get(0).getEquipmentAttributeValue())
                .defense(chainMailArmor.getEquipmentAttributeList().get(0).getEquipmentAttributeValue() + heavyShield.getEquipmentAttributeList().get(0).getEquipmentAttributeValue())
                .train();

        soldierRepository.save(infantryman);

        ////Compose Soldier

        ////Budget reduction

        homesteadServices.reduceCurrentBudget(recruitmentPrice.getSoldierAttributeValue());

        homesteadServices.increaseFutureExpense(upkeepPerSeason.getSoldierAttributeValue());

        ////End Budget reduction

        return infantryman;

    }

    public Soldier recruitCavalryman() {

        ////Equipment List
        Equipment lance = weaponsmithServices.assignLance();

        Equipment chainMailArmor = armourerServices.assignChainMailArmor();

        Equipment lightShield = shieldMakerServices.assignLightShield();

        Equipment warhorse = horseBreederServices.assignWarhorse();

        List<Equipment> equipmentList = new ArrayList<Equipment>();
        equipmentList.add(lance);
        equipmentList.add(chainMailArmor);
        equipmentList.add(lightShield);
        equipmentList.add(warhorse);
        ////End Equipment List

        ////Personal Attribute List
        List<SoldierPersonalAttribute> soldierPersonalAttributeList = new ArrayList<>();

        SoldierPersonalAttribute recruitmentPrice = soldierPersonalAttributeRepository.getOne(3);
        SoldierPersonalAttribute upkeepPerSeason = soldierPersonalAttributeRepository.getOne(4);

        soldierPersonalAttributeList.add(recruitmentPrice);
        soldierPersonalAttributeList.add(upkeepPerSeason);
        ////End Personal Attribute List

        ////Compose Soldier
        Soldier cavalryman = Soldier.trainer()
                .soldierCathegory(soldierCathegoryRepository.getOne(2))
                .equipmentList(equipmentList)
                .personalAttributeList(soldierPersonalAttributeList)
                .attack(lance.getEquipmentAttributeList().get(0).getEquipmentAttributeValue())
                .defense(chainMailArmor.getEquipmentAttributeList().get(0).getEquipmentAttributeValue() + lightShield.getEquipmentAttributeList().get(0).getEquipmentAttributeValue())
                .train();

        soldierRepository.save(cavalryman);
        ////Compose Soldier

        ////Budget reduction
        homesteadServices.reduceCurrentBudget(recruitmentPrice.getSoldierAttributeValue());

        homesteadServices.increaseFutureExpense(upkeepPerSeason.getSoldierAttributeValue());
        ////End Budget reduction

        return cavalryman;

    }//cavalryman

    public Soldier recruitArcher() {

        ////Equipment List
        Equipment bow = weaponsmithServices.assignBow();
        Equipment leatherArmor = armourerServices.assignLeatherArmor();

        List<Equipment> equipmentList = new ArrayList<Equipment>();
        equipmentList.add(bow);
        equipmentList.add(leatherArmor);
        ////End Equipment List

        ////Personal Attribute List
        List<SoldierPersonalAttribute> soldierPersonalAttributeList = new ArrayList<>();

        SoldierPersonalAttribute recruitmentPrice = soldierPersonalAttributeRepository.getOne(5);
        SoldierPersonalAttribute upkeepPerSeason = soldierPersonalAttributeRepository.getOne(6);

        soldierPersonalAttributeList.add(recruitmentPrice);
        soldierPersonalAttributeList.add(upkeepPerSeason);
        ////End Personal Attribute List

        ////Compose Soldier
        Soldier archer = Soldier.trainer()
                .soldierCathegory(soldierCathegoryRepository.getOne(3))
                .equipmentList(equipmentList)
                .personalAttributeList(soldierPersonalAttributeList)
                .attack(bow.getEquipmentAttributeList().get(0).getEquipmentAttributeValue())
                .defense(leatherArmor.getEquipmentAttributeList().get(0).getEquipmentAttributeValue())
                .train();

        soldierRepository.save(archer);
        ////Compose Soldier

        ////Budget reduction
        homesteadServices.reduceCurrentBudget(recruitmentPrice.getSoldierAttributeValue());

        homesteadServices.increaseFutureExpense(upkeepPerSeason.getSoldierAttributeValue());
        ////End Budget reduction

        return archer;
    }

    public void dismissSoldier(Integer id) {
        soldierRepository.deleteById(id);
    }

//    public Warlord assignWarlordToArmy() {
//
//
//
////        Warlord alfred = warlordRepository.getOne(1);
////
////        Equipment equipmentWeapon = new Equipment();
////        Equipment equipmentArmor = new Equipment();
////        Equipment equipmentShield = new Equipment();
////        Equipment equipmentHorse = new Equipment();
////
////        //Weapon
////        List<EquipmentAttribute> equipmentAttributeListWeapon = new ArrayList<>();
////        equipmentAttributeListWeapon.add(equipmentAttributeRepository.getOne(12));
////        equipmentWeapon.setEquipmentAttributeList(equipmentAttributeListWeapon);
////
////        equipmentWeapon.setEquipmentCathegory(equipmentCathegoryRepository.getOne(1));
////        equipmentWeapon.setEquipmentType(equipmentTypeRepository.getOne(1));
////        equipmentRepository.save(equipmentWeapon);
////        //EndWeapon
////
////        //Armor
////        List<EquipmentAttribute> equipmentAttributeListArmor = new ArrayList<>();
////        equipmentAttributeListArmor.add(equipmentAttributeRepository.getOne(15));
////        equipmentArmor.setEquipmentAttributeList(equipmentAttributeListArmor);
////
////        equipmentArmor.setEquipmentCathegory(equipmentCathegoryRepository.getOne(2));
////        equipmentArmor.setEquipmentType(equipmentTypeRepository.getOne(12));
////        equipmentRepository.save(equipmentArmor);
////        //EndArmor
////
////        //Shield
////        List<EquipmentAttribute> equipmentAttributeListShield = new ArrayList<>();
////        equipmentAttributeListShield.add(equipmentAttributeRepository.getOne(16));
////        equipmentShield.setEquipmentAttributeList(equipmentAttributeListShield);
////
////        equipmentShield.setEquipmentCathegory(equipmentCathegoryRepository.getOne(3));
////        equipmentShield.setEquipmentType(equipmentTypeRepository.getOne(13));
////        equipmentRepository.save(equipmentShield);
////        //EndShield
////
////        //Horse
////        List<EquipmentAttribute> equipmentAttributeListHorse = new ArrayList<>();
////        equipmentAttributeListHorse.add(equipmentAttributeRepository.getOne(17));
////        equipmentHorse.setEquipmentAttributeList(equipmentAttributeListHorse);
////
////        equipmentHorse.setEquipmentCathegory(equipmentCathegoryRepository.getOne(4));
////        equipmentHorse.setEquipmentType(equipmentTypeRepository.getOne(14));
////        equipmentRepository.save(equipmentHorse);
////        //EndHorse
////
////        //nulls
////
////        //endNulls
////
////        List<Equipment> equipmentList = new ArrayList<Equipment>();
////        equipmentList.add(equipmentWeapon);
////        equipmentList.add(equipmentArmor);
////        equipmentList.add(equipmentShield);
////        equipmentList.add(equipmentHorse);
////
////        alfred.setEquipmentList(equipmentList);
////
////        alfred.setAttack(equipmentWeapon.getEquipmentAttributeList().get(0).getEquipmentAttributeValue() + equipmentHorse.getEquipmentAttributeList().get(0).getEquipmentAttributeValue());
////
////        alfred.setDefense(equipmentArmor.getEquipmentAttributeList().get(0).getEquipmentAttributeValue() + equipmentShield.getEquipmentAttributeList().get(0).getEquipmentAttributeValue());//TODO
////
////        warlordRepository.save(alfred);
////
////        return alfred;
//
//    }

}//de clasa
