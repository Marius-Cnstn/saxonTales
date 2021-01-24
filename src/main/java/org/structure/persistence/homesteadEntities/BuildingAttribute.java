package org.structure.persistence.homesteadEntities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class BuildingAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buildingAttributeId;

    private String buildingAttributeName;

    private Integer buildingAttributeValue;

    private String relativeCathegory;

    private String relativeLevel;

    @ManyToMany(mappedBy = "buildingAttributeList")
    private List<Building> buildingsList;

}
