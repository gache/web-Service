package com.formation.nike_rest.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NonNull
    private String name;

    @NonNull
    private  String type;

    @Lob // va tranformer en long text
    @NonNull
    private  String base64String;

}
