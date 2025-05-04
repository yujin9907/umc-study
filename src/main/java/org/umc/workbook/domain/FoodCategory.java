package org.umc.workbook.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "food_category")
public class FoodCategory {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private List<MemberPrefer> preferences = new ArrayList<>();
    @OneToMany(mappedBy = "category")
    private List<StoreType> storeTypes = new ArrayList<>();

}