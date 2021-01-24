package org.structure.persistence.homesteadEntities;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class BuildingCathegory {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="buildingCathegoryId")
    private Integer buildingCathegoryId;

    private String buildingCathegoryName;

}
