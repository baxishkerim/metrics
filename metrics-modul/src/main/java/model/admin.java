package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;
import model.enums.AdminRoles;
import model.enums.ValueType;

import java.util.Set;

@Data
public class admin {

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
