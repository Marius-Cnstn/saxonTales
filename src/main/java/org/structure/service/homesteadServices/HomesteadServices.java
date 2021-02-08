package org.structure.services.homesteadServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.structure.persistence.homesteadEntities.Homestead;
import org.structure.repository.HomesteadRepository.HomesteadRepository;

import javax.persistence.criteria.CriteriaBuilder;

@Service
public class HomesteadServices {

    //private static final Integer Max_Budget = 3000;

    @Autowired
    HomesteadRepository homesteadRepository;

    public Integer reduceCurrentBudget(Integer currentExpense) {
//        Homestead homestead = new Homestead();

        Homestead homestead = homesteadRepository.getOne(1);
        Integer budget = homestead.getBudget();

        try {
            if (budget - currentExpense >= 0) {
                homestead.setBudget(budget - currentExpense);
                homesteadRepository.save(homestead);
            } else throw new Exception();
        } catch (Exception noMoney) {
            System.out.println("Not enough money for this item.");//TODO: exceptie pe ecran sus, nu in consola
        }

        return budget;
    }

    public Integer increaseFutureExpense(Integer anotherFutureExpense) {//salarii soldati

        Homestead homestead = homesteadRepository.getOne(1);

        Integer futureExpenses = homestead.getFutureExpenses();

        homestead.setFutureExpenses(futureExpenses+ anotherFutureExpense);

        homesteadRepository.save(homestead);

        return futureExpenses;

    }

    public Integer calculateBudget(){//la end turn

        Homestead homestead = homesteadRepository.getOne(1);

        Integer futureExpenses = homestead.getFutureExpenses();

        Integer futureIncome = homestead.getFutureIncome();

        Integer actualBudget = homestead.getBudget();

        Integer newBudget;

        newBudget = (actualBudget - futureExpenses) + futureIncome;

        homestead.setBudget(newBudget);

        homesteadRepository.save(homestead);

        return newBudget;

    }

    public Integer increaseFutureIncome(Integer anotherFutureIncome) {//venituri cladiri

        Homestead homestead = homesteadRepository.getOne(1);

        Integer futureIncome = homestead.getFutureIncome();

        homestead.setFutureIncome(futureIncome+ anotherFutureIncome);

        homesteadRepository.save(homestead);

        return futureIncome;

    }

    public Homestead showBudget(){

        Homestead homestead = new Homestead();

        homestead.setBudget(homesteadRepository.getOne(1).getBudget());
        homestead.setFutureIncome(homesteadRepository.getOne(1).getFutureIncome());
        homestead.setFutureExpenses(homesteadRepository.getOne(1).getFutureExpenses());
        homestead.setFutureIncome(homesteadRepository.getOne(1).getFutureIncome());

        return homestead;
    }

}//de clasa
