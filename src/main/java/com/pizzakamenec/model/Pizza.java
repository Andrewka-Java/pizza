package com.pizzakamenec.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "pizza")
@ApiModel(value = "class Pizza")
public class Pizza {

    @Id
    private String id;

    @ApiModelProperty(value = "Title of pizza", example = "Pepperoni")
    @NonNull
    private String title;

    @ApiModelProperty(value = "Description of pizza")
    @NonNull
    private String description;

    @ApiModelProperty(value = "Price per pizza", example = "10.25")
    @NonNull
    private Double cost;

}
