package org.umc.workbook.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "mission")
public class Mission {
    @Id
    @GeneratedValue
    private Long id;
    private Integer reward;
    private LocalDateTime deadline;
    private String missionSpec;

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;

    @OneToMany(mappedBy = "mission")
    private List<MemberMission> memberMissions = new ArrayList<>();
}