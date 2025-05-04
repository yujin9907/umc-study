package org.umc.workbook.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "store_image")
public class Storeimage {
    @Id
    @GeneratedValue
    private Long id;
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    private Store store;
}