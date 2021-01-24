package org.structure.kontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.structure.services.armyServices.ArmyStatisticServices;
import org.structure.services.homesteadServices.BuildingConstructionServices;
import org.structure.services.homesteadServices.HomesteadServices;
import org.structure.services.timeServices.PlusTimeServices;

@Controller
public class HomepageController {

    @Autowired
    PlusTimeServices plusTimeServices;

    @Autowired
    BuildingConstructionServices buildingConstructionServices;

    @Autowired
    HomesteadServices homesteadServices;

    @Autowired
    ArmyStatisticServices armyStatisticServices;

    @GetMapping("/")
    public ModelAndView showHomepage() {
        return new ModelAndView("homepage");
    }

    @GetMapping("/wessexFaction")
    public ModelAndView showWessexFaction() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("budgetDetails", homesteadServices.showBudget());
        modelAndView.addObject("seasonYear", plusTimeServices.showSeasonYear());
        modelAndView.addObject("alfred", armyStatisticServices.showWarlordDetails());
        modelAndView.setViewName("wessexFaction");

        return modelAndView;
    }

    @GetMapping("/homepageHistory")
    public ModelAndView goToHomepageHistory() {
        return new ModelAndView("homepageHistory");
    }

}