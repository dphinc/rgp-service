package com.fanduel.rgp.service.model.cms;

import java.util.Comparator;

public class ComponentComparator implements Comparator<ComponentBase>{
    @Override
    public int compare(ComponentBase o1, ComponentBase o2) {
        return o1.getSequence() - o2.getSequence();
    }
}
