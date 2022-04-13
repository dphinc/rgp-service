package com.fanduel.rgp.service.model.cms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DataComponent extends ComponentBase {

    public DataComponent() {
        super();
    }

    @JsonProperty("tag")
    private String tag;
    @JsonProperty("value")
    private String value;
}
