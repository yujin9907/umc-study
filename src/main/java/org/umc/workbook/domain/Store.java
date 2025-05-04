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
@Table(name = "store")
public class Store {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private int startTime;
    private int endTime;
    private Float score; // TODO 쓸지말지

    @ManyToOne(fetch = FetchType.LAZY)
    private StoreType type;

    @OneToMany(mappedBy = "store")
    private List<Mission> missions = new ArrayList<>();

    @OneToMany(mappedBy = "store")
    private List<Review> reviews = new ArrayList<>();

    @OneToMany(mappedBy = "store")
    private List<Storeimage> iamges = new ArrayList<>();

}
