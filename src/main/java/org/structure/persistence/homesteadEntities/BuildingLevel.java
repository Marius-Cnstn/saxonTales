package org.structure.persistence.homesteadEntities;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
public class BuildingLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buildingLevelId;

    private String buildingLevelName;

    private String relativeCathegory;

}
