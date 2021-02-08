package org.structure.services.timeServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.structure.persistence.generalEntities.SeasonYear;
import org.structure.repository.HomesteadRepository.SeasonRepository;
import org.structure.repository.HomesteadRepository.SeasonYearRepository;
import org.structure.services.homesteadServices.HomesteadServices;

@Service
public class PlusTimeServices {

    @Autowired
    SeasonYearRepository seasonYearRepository;

    @Autowired
    SeasonRepository seasonRepository;

    @Autowired
    HomesteadServices homesteadServices;

    public SeasonYear showSeasonYear() {

        SeasonYear seasonYear = new SeasonYear();

        seasonYear.setSeason(seasonYearRepository.getOne(1).getSeason());

        seasonYear.setYear(seasonYearRepository.getOne(1).getYear());

        return seasonYear;
    }

    public SeasonYear endTurn() {

        SeasonYear updatedSeasonYear = seasonYearRepository.getOne(1);

        if (updatedSeasonYear.getSeasonCounter() < 4) {

            updatedSeasonYear.setSeasonCounter(updatedSeasonYear.getSeasonCounter() + 1);

            seasonYearRepository.save(updatedSeasonYear);

            updatedSeasonYear.setSeason(seasonRepository.getOne(seasonYearRepository.getOne(1).getSeasonCounter()));

            seasonYearRepository.save(updatedSeasonYear);

            //metoda de scadere buget si crestere buget

        } else {
            updatedSeasonYear.setSeasonCounter(1);

            updatedSeasonYear.setSeason(seasonRepository.getOne(seasonYearRepository.getOne(1).getSeasonCounter()));

            updatedSeasonYear.setYear(updatedSeasonYear.getYear()+1);

            seasonYearRepository.save(updatedSeasonYear);
        }

        showSeasonYear();

        homesteadServices.calculateBudget();

        return updatedSeasonYear;
        //TODO de vazut dc si asta ori se apeleaza automat la reincarcare view
    }
}

//
//
//
//
//    }
//
//    public void EndTurn(){
//
//        showSeasonYear().setSeason(seasonRepository.getOne(se));
//        showSeasonYear();
//
//        }
//
//
//
//    }


//    public static final String[] Season = {"SPRING", "SUMMER", "AUTUMN", "WINTER"};
//
//    public static Integer season = 3;
//    public static Integer year = 871;
//
//    public static void plusSeason() {
//        if (season < (Season.length - 1)) {
//            season++;
//        } else {
//            season = 0;
//            year++;
//        }
//    }


