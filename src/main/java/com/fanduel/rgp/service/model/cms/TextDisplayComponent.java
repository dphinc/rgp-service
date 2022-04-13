package com.fanduel.rgp.service.model.cms;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class TextDisplayComponent extends ComponentBase {

    public TextDisplayComponent() {
        super();
    }

    @JsonProperty("title")
    private String title;
    @JsonProperty("text")
    private String text;
}
