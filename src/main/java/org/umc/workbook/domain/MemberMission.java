package org.umc.workbook.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "member_mission")
public class MemberMission {
    @Id
    @GeneratedValue
    private Long id;
    private String status;
    private String missionKey;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    private Mission mission;
}

