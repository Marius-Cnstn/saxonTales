package org.structure.kontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.structure.services.homesteadServices.BuildingConstructionServices;
import org.structure.services.homesteadServices.BuildingStatisticServices;
import org.structure.services.homesteadServices.HomesteadServices;

@Controller
public class HomesteadManagementController {

    @Autowired
    BuildingConstructionServices buildingConstructionServices;

    @Autowired
    BuildingStatisticServices buildingStatisticServices;

    @Autowired
    HomesteadServices homesteadServices;

    //port
    @GetMapping("/buildPort")
    public ModelAndView buildPort() {
        return new ModelAndView("redirect:/homesteadManagement", "port", buildingConstructionServices.buildPort());
    }

    @GetMapping("/upgradePortToDocks/{buildingId}")
    public ModelAndView upgradePortToDocks(@PathVariable("buildingId") Integer buildingId) {
        return new ModelAndView("redirect:/homesteadManagement", "docks", buildingConstructionServices.upgradePortToDocks(buildingId));
    }

    @GetMapping("/upgradeDocksToTradingPort/{buildingId}")
    public ModelAndView upgradeDocksToTradingPort(@PathVariable("buildingId") Integer buildingId) {
        return new ModelAndView("redirect:/homesteadManagement", "tradingPort", buildingConstructionServices.upgradeDocksToTradingPort(buildingId));
    }
    //end port

    //workshop

    @GetMapping("/buildWorkshop")
    public ModelAndView buildWorkshop() {
        return new ModelAndView("redirect:/homesteadManagement", "workshop", buildingConstructionServices.buildWorkshop());
    }

    @GetMapping("/upgradeWorkshopToForge/{buildingId}")
    public ModelAndView upgradeWorkshopToForge(@PathVariable("buildingId") Integer buildingId) {
        return new ModelAndView("redirect:/homesteadManagement", "docks", buildingConstructionServices.upgradeWorkshopToForge(buildingId));
    }

    @GetMapping("/upgradeWorkshopToArmourer/{buildingId}")
    public ModelAndView upgradeWorkshopToArmourer(@PathVariable("buildingId") Integer buildingId) {
        return new ModelAndView("redirect:/homesteadManagement", "docks", buildingConstructionServices.upgradeWorkshopToArmourer(buildingId));
    }
    //end workshop

    @GetMapping("/seeAllBuildings")
    public ModelAndView showAllBuildings() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("buildingsList", buildingStatisticServices.showAllBuildings());
        modelAndView.addObject("budgetDetails", homesteadServices.showBudget());
        modelAndView.setViewName("homesteadManagement");
        return modelAndView;
    }


}

