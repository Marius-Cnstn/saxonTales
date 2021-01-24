package org.structure.persistence.homesteadEntities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Homestead {//save ca object in Household, salvat cu repository?

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer homesteadId;

    private Integer budget;

    //public static Integer currentExpenses;

    private Integer futureExpenses;

    private Integer futureIncome;

    //nerelevant acum
    public static Integer currentIncome;

    @OneToMany(mappedBy = "homestead")
    private Set<Building> buildingsList;

}
