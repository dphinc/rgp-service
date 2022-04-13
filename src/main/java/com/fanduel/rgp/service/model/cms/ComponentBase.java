package com.fanduel.rgp.service.model.cms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.SortedSet;

@Data
public class ComponentBase implements Component {
    @JsonProperty("componentType")
    private ComponentType componentType;
    @JsonProperty("sequence")
    private short sequence;
    @JsonProperty("childComponents")
    private SortedSet<ComponentBase> childComponents;
}
