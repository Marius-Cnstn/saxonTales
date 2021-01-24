package org.structure.services.homesteadServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.structure.persistence.homesteadEntities.Building;
import org.structure.persistence.homesteadEntities.BuildingAttribute;
import org.structure.repository.HomesteadRepository.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class BuildingConstructionServices {

    @Autowired
    BuildingRepository buildingRepository;

    @Autowired
    BuildingCathegoryRepository buildingCathegoryRepository;

    @Autowired
    BuildingLevelRepository buildingLevelRepository;

    @Autowired
    BuildingAttributeRepository buildingAttributeRepository;

    @Autowired
    HomesteadRepository homesteadRepository;

    @Autowired
    HomesteadServices homesteadServices;


    public Building buildPort() {

        Building building = new Building();

        List<BuildingAttribute> buildingAttributesList = new ArrayList<>();

        buildingAttributesList.add(buildingAttributeRepository.getOne(1));
        buildingAttributesList.add(buildingAttributeRepository.getOne(2));
        building.setBuildingAttributeList(buildingAttributesList);

        building.setBuildingCathegory(buildingCathegoryRepository.getOne(1));
        building.setBuildingLevel(buildingLevelRepository.getOne(1));


        Integer price = buildingAttributeRepository.getOne(1).getBuildingAttributeValue();
        homesteadServices.reduceCurrentBudget(price);

        buildingRepository.save(building);

        Integer anotherFutureIncome = buildingAttributeRepository.getOne(2).getBuildingAttributeValue();
        homesteadServices.increaseFutureIncome(anotherFutureIncome);

        return building;
    }

    public Building upgradePortToDocks(Integer portId) {

        Building portToUpgrade = buildingRepository.getOne(portId);
        portToUpgrade.setBuildingLevel(buildingLevelRepository.getOne(2));

        List<BuildingAttribute> levelAttributesList = new ArrayList<>();

        levelAttributesList.add(buildingAttributeRepository.getOne(3));
        levelAttributesList.add(buildingAttributeRepository.getOne(4));

        portToUpgrade.setBuildingAttributeList(levelAttributesList);

        Integer expense = buildingAttributeRepository.getOne(3).getBuildingAttributeValue();
        homesteadServices.reduceCurrentBudget(expense);

        buildingRepository.save(portToUpgrade);

        //impact economic

        Integer oldIncome = buildingAttributeRepository.getOne(2).getBuildingAttributeValue();
        Integer newIncome = buildingAttributeRepository.getOne(4).getBuildingAttributeValue();

        Integer anotherFutureIncome = newIncome - oldIncome;
        homesteadServices.increaseFutureIncome(anotherFutureIncome);

        //end impact economic

        return portToUpgrade;
    }

    public Building upgradeDocksToTradingPort(Integer portId) {

        Building portToUpgrade = buildingRepository.getOne(portId);

        try {
            if (portToUpgrade.getBuildingLevel().getBuildingLevelId() == 2) {
                portToUpgrade.setBuildingLevel(buildingLevelRepository.getOne(3));

                List<BuildingAttribute> levelAttributesList = new ArrayList<>();

                levelAttributesList.add(buildingAttributeRepository.getOne(5));
                levelAttributesList.add(buildingAttributeRepository.getOne(6));

                portToUpgrade.setBuildingAttributeList(levelAttributesList);

                Integer expense = buildingAttributeRepository.getOne(5).getBuildingAttributeValue();
                homesteadServices.reduceCurrentBudget(expense);

                buildingRepository.save(portToUpgrade);
            } // de la if
            else throw new Exception();
        }/*de la try */ catch (Exception upgradeUnavailable) {
            System.out.println("Upgrade unavailable. Perform previous upgrade first.");
        }//de la catch

        //impact economic

        Integer oldIncome = buildingAttributeRepository.getOne(4).getBuildingAttributeValue();
        Integer newIncome = buildingAttributeRepository.getOne(6).getBuildingAttributeValue();

        Integer anotherFutureIncome = newIncome - oldIncome;
        homesteadServices.increaseFutureIncome(anotherFutureIncome);

        //end impact economic

        return portToUpgrade;
    }

    public Building buildWorkshop() {

        List<BuildingAttribute> levelAttributesList = new ArrayList<>();

        levelAttributesList.add(buildingAttributeRepository.getOne(7));
        levelAttributesList.add(buildingAttributeRepository.getOne(8));

        Building building = new Building();

        building.setBuildingCathegory(buildingCathegoryRepository.getOne(2));
        building.setBuildingLevel(buildingLevelRepository.getOne(4));
        building.setBuildingAttributeList(levelAttributesList);

        Integer expense = buildingAttributeRepository.getOne(7).getBuildingAttributeValue();
        homesteadServices.reduceCurrentBudget(expense);

        buildingRepository.save(building);

        Integer anotherFutureIncome = buildingAttributeRepository.getOne(8).getBuildingAttributeValue();
        homesteadServices.increaseFutureIncome(anotherFutureIncome);


        return building;


    }

    public Building upgradeWorkshopToForge(Integer portId) {

        Building workshopToUpgrade = buildingRepository.getOne(portId);
        workshopToUpgrade.setBuildingLevel(buildingLevelRepository.getOne(5));

        List<BuildingAttribute> levelAttributesList = new ArrayList<>();

        levelAttributesList.add(buildingAttributeRepository.getOne(9));
        levelAttributesList.add(buildingAttributeRepository.getOne(10));

        workshopToUpgrade.setBuildingAttributeList(levelAttributesList);

        Integer expense = buildingAttributeRepository.getOne(9).getBuildingAttributeValue();
        homesteadServices.reduceCurrentBudget(expense);

        buildingRepository.save(workshopToUpgrade);

        //impact economic

        Integer oldIncome = buildingAttributeRepository.getOne(8).getBuildingAttributeValue();
        Integer newIncome = buildingAttributeRepository.getOne(10).getBuildingAttributeValue();

        Integer anotherFutureIncome = newIncome - oldIncome;
        homesteadServices.increaseFutureIncome(anotherFutureIncome);

        //end impact economic

        return workshopToUpgrade;
    }

    public Building upgradeWorkshopToArmourer(Integer portId) {

        Building workshopToUpgrade = buildingRepository.getOne(portId);

        try {
            if (workshopToUpgrade.getBuildingLevel().getBuildingLevelId() == 5) {
                workshopToUpgrade.setBuildingLevel(buildingLevelRepository.getOne(6));

                List<BuildingAttribute> levelAttributesList = new ArrayList<>();

                levelAttributesList.add(buildingAttributeRepository.getOne(11));
                levelAttributesList.add(buildingAttributeRepository.getOne(12));

                workshopToUpgrade.setBuildingAttributeList(levelAttributesList);

                Integer expense = buildingAttributeRepository.getOne(11).getBuildingAttributeValue();
                homesteadServices.reduceCurrentBudget(expense);

                buildingRepository.save(workshopToUpgrade);
            } // de la if
            else throw new Exception();
        }/*de la try */
        catch (Exception upgradeUnavailable) {
            System.out.println("Upgrade unavailable. Perform previous upgrade first.");
        }//de la catch

        //impact economic

        Integer oldIncome = buildingAttributeRepository.getOne(10).getBuildingAttributeValue();
        Integer newIncome = buildingAttributeRepository.getOne(12).getBuildingAttributeValue();

        Integer anotherFutureIncome = newIncome - oldIncome;
        homesteadServices.increaseFutureIncome(anotherFutureIncome);

        //end impact economic

        return workshopToUpgrade;
    }
}// de la clasa





