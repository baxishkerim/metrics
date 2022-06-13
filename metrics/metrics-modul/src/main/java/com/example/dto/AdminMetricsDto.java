package com.example.dto;


import com.example.model.enums.AdminRoles;
import com.example.model.enums.ValueType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Set;

@Data
@Builder
public class AdminMetricsDto {

    @NonNull
    private Set<AdminRoles> roles;

    @NonNull
    private String name;

    @NonNull
    @JsonProperty("value_types")
    private Set<ValueType> valueTypes;

    @NonNull
    private boolean ICO;


    private String desc;



}
