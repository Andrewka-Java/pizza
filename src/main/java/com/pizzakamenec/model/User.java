package com.pizzakamenec.model;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Document
public class User {

    @Id
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String password;

    @NonNull
    private Role role;
    private Double cash;

}
