package com.fanduel.rgp.service.model.cms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class VisualComponent extends ComponentBase {

    public VisualComponent() {
        super();
    }

    @JsonProperty("visualComponentType")
    private VisualComponentType visualComponentType;
    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
}
