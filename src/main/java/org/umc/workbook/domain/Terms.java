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
@Table(name = "terms")
public class Terms {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String body;
    private String optional;

    @OneToMany(mappedBy = "terms")
    private List<MemberAgree> agreements = new ArrayList<>();
}