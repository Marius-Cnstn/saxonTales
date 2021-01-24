package org.structure.kontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.structure.services.armyServices.ArmyStatisticServices;
import org.structure.services.armyServices.SoldierRecruitmentServices;

@RestController
public class ArmyManagementController {

    @Autowired
    SoldierRecruitmentServices soldierRecruitmentServices;

    @Autowired
    ArmyStatisticServices armyStatisticServices;

    @GetMapping("/recruitInfantryman")
    public ModelAndView recruitInfantryman() {
        return new ModelAndView("redirect:/armyManagement", "infantryman", soldierRecruitmentServices.recruitInfantryman());
    }

    @GetMapping("/recruitCavalryman")
    public ModelAndView recruitCavalryman() {
        return new ModelAndView("redirect:/armyManagement", "cavalryman", soldierRecruitmentServices.recruitCavalryman());
    }

    @GetMapping("/recruitArcher")
    public ModelAndView recruitArcher() {
        return new ModelAndView("redirect:/armyManagement", "archer", soldierRecruitmentServices.recruitArcher());
    }

//    @GetMapping("/assignWarlordtoArmy")// TODO cum fac sa nu accepte duplicat?
//    public ModelAndView assignWarlordtoArmy(){
//        return new ModelAndView("redirect:/armyManagement", "alfred", soldierRecruitmentServices.assignWarlordToArmy());
//    }

    @GetMapping("/seeAllSoldiers")
    public ModelAndView showAllSoldiers(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("soldiersList", armyStatisticServices.showAllSoldiers());
        modelAndView.addObject("alfred", armyStatisticServices.showWarlordDetails());
        modelAndView.setViewName("/armyManagement.html");

        return modelAndView;
    }

    @GetMapping("/dismissSoldier/{id}")
    public ModelAndView dismissSoldier(@PathVariable Integer id){
        ModelAndView modelAndView = new ModelAndView("redirect:/armyManagement.html");
        soldierRecruitmentServices.dismissSoldier(id);
        return modelAndView;
    }

}
