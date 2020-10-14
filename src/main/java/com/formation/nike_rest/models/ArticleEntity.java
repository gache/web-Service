package com.formation.nike_rest.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NonNull
    private String title;

    @Column(columnDefinition = "TEXT")
    @NonNull
    private  String description;

    @NonNull
    private  Float price;

    @OneToMany(cascade = CascadeType.ALL)
    @NonNull
    private List<ImageEntity> images;
}
