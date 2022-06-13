package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import com.example.model.enums.AdminRoles;
import com.example.model.enums.ValueType;

import java.util.Set;

@Data
public class AdminMetrics {

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
