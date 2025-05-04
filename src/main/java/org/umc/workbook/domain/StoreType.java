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
@Table(name = "store_type")
public class StoreType {
    @Id
    @GeneratedValue
    private Long id;
    private String type;
    @ManyToOne(fetch = FetchType.LAZY)
    private FoodCategory category;
    @OneToMany(mappedBy = "type")
    private List<Store> stores = new ArrayList<>();

}
