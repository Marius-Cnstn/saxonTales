package org.structure.persistence.generalEntities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class SeasonYear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seasonYearId;

    @OneToOne
    @JoinColumn(name = "seasonId")
    private Season season;

    private Integer year;

    private Integer seasonCounter;

}
