package org.structure.kontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.structure.services.armyServices.ArmyStatisticServices;
import org.structure.services.homesteadServices.BuildingStatisticServices;
import org.structure.services.homesteadServices.HomesteadServices;
import org.structure.services.timeServices.PlusTimeServices;

@Controller
public class WessexFactionController {

    @Autowired
    PlusTimeServices plusTimeServices;

    @Autowired
    HomesteadServices homesteadServices;

    @Autowired
    ArmyStatisticServices armyStatisticServices;

    @Autowired
    BuildingStatisticServices buildingStatisticServices;

    @GetMapping("/homesteadManagement")
    public ModelAndView goToHomsteadManagement(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("buildingsList", buildingStatisticServices.showAllBuildings());
        modelAndView.addObject("budgetDetails", homesteadServices.showBudget());
        modelAndView.setViewName("homesteadManagement");
        return modelAndView;
    }

    @GetMapping("/armyManagement")
    public ModelAndView goToArmyManagement(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("budgetDetails", homesteadServices.showBudget());
        modelAndView.addObject("soldiersList", armyStatisticServices.showAllSoldiers());
        modelAndView.setViewName("armyManagement");
        return modelAndView;
    }


    @GetMapping("/endTurn")
    public ModelAndView endTurn(){
        return new ModelAndView("redirect:/wessexFaction", "seasonYear", plusTimeServices.endTurn());
    }

}
