package org.umc.workbook.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "review_image")
public class ReviewImage {
    @Id
    @GeneratedValue
    private Long id;
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    private Review review;
}