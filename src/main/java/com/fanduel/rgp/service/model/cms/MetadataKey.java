package com.fanduel.rgp.service.model.cms;

import lombok.Data;

import java.util.List;

@Data
public class MetadataKey {
    private ProductType productType;
    private AppType appType;
    private UsStateType usStateType;
    private List<SectionType> sections;
}
