package org.structure.persistence.homesteadEntities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "Build_type")

@Entity
@Table
@Getter
@Setter
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buildingId;

    @OneToOne
    @JoinColumn(name = "buildingCathegoryId")
    private BuildingCathegory buildingCathegory;

    @OneToOne
    @JoinColumn(name = "buildingLevelId")
    private BuildingLevel buildingLevel;

    @ManyToMany
    @JoinTable(
            name = "buildings_to_attributes",
            joinColumns = {@JoinColumn(name = "buildingId")},
            inverseJoinColumns = {@JoinColumn(name = "buildingAttributeId")}
    )
    private List<BuildingAttribute> buildingAttributeList;

    @ManyToOne
    @JoinColumn(name = "homesteadId")
    private Homestead homestead;

}
