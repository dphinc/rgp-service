package com.fanduel.rgp.service.model.cms;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;


class ComponentTest {

    @Test
    public void exampleJsonSerializationOutputResponse() {
        try {
            TextDisplayComponent classUnderTest = (TextDisplayComponent) setupClassUnderTest();
            ObjectMapper mapper = new ObjectMapper();
            String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(classUnderTest);
            System.out.println(result);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Test void exampleJsonSerializationOutputRequest () {
        try {
            MetadataKey classUnderTest = new MetadataKey();
            classUnderTest.setAppType(AppType.DFS);
            classUnderTest.setProductType(ProductType.DFS);
            classUnderTest.setUsStateType(UsStateType.AZ);
            ArrayList<SectionType> sections = new ArrayList<>();
            sections.add(SectionType.HELP);
            sections.add(SectionType.PARENTAL_CONTROLS);
            classUnderTest.setSections(sections);
            ObjectMapper mapper = new ObjectMapper();
            String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(classUnderTest);
            System.out.println(result);
        } catch (JsonProcessingException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private Component setupClassUnderTest() {

        SortedSet<ComponentBase> sub_subcomponentSet = new TreeSet<>(new ComponentComparator());

        TextDisplayComponent sub_subcomponent1 = new TextDisplayComponent();
        sub_subcomponent1.setComponentType(ComponentType.TEXT);
        sub_subcomponent1.setSequence((short) 1);
        sub_subcomponent1.setChildComponents(null);
        sub_subcomponent1.setTitle("Title - Sub-Subcomponent 1");
        sub_subcomponent1.setText("This is a TextComponent used in an initial sub-subcomponent context example.");

        sub_subcomponentSet.add(sub_subcomponent1);

        SortedSet<ComponentBase> subcomponentSet = new TreeSet<>(new ComponentComparator());

        TextDisplayComponent subcomponent1 = new TextDisplayComponent();
        subcomponent1.setComponentType(ComponentType.TEXT);
        subcomponent1.setSequence((short) 1);
        subcomponent1.setChildComponents(sub_subcomponentSet);
        subcomponent1.setTitle("Title - Subcomponent 1");
        subcomponent1.setText("This is a TextComponent used in an initial subcomponent context example.");

        subcomponentSet.add(subcomponent1);

        TextDisplayComponent subcomponent2= new TextDisplayComponent();
        subcomponent2.setComponentType(ComponentType.TEXT);
        subcomponent2.setSequence((short) 2);
        subcomponent2.setChildComponents(null);
        subcomponent2.setTitle("Title - Subcomponent 2");
        subcomponent2.setText("This is a second TextComponent used in a subcomponent context example.");

        subcomponentSet.add(subcomponent2);

        SortedSet<ComponentBase> subcomponentSet3 = new TreeSet<>(new ComponentComparator());

        DataComponent sub_subcomponent3a = new DataComponent();
        sub_subcomponent3a.setComponentType(ComponentType.DATA);
        sub_subcomponent3a.setSequence((short) 1);
        sub_subcomponent3a.setChildComponents(null);
        sub_subcomponent3a.setTag("This is a data tag.");
        sub_subcomponent3a.setValue("This is The Tag Value to be displayed as the data element.");

        subcomponentSet3.add(sub_subcomponent3a);

        VisualComponent sub_subcomponent3b = new VisualComponent();
        sub_subcomponent3b.setComponentType(ComponentType.URL);
        sub_subcomponent3b.setSequence((short) 2);
        sub_subcomponent3b.setChildComponents(null);
        sub_subcomponent3b.setVisualComponentType(VisualComponentType.IMAGE);
        sub_subcomponent3b.setUrl("https://s3.amazonaws.com/cdn.fanduel.com/images/2021/Homepage/logo.png");

        subcomponentSet3.add(sub_subcomponent3b);

        VisualComponent sub_subcomponent3c = new VisualComponent();
        sub_subcomponent3c.setComponentType(ComponentType.URL);
        sub_subcomponent3c.setSequence((short) 3);
        sub_subcomponent3c.setChildComponents(null);
        sub_subcomponent3c.setVisualComponentType(VisualComponentType.VIDEO);
        sub_subcomponent3c.setUrl("https://www.youtube.com/watch?v=4M65joX1TX8");

        subcomponentSet3.add(sub_subcomponent3c);

        TextDisplayComponent subcomponent3 = new TextDisplayComponent();
        subcomponent3.setComponentType(ComponentType.TEXT);
        subcomponent3.setSequence((short) 3);
        subcomponent3.setChildComponents(subcomponentSet3);
        subcomponent3.setTitle("Title - Subcomponent 3");
        subcomponent3.setText("This is a third TextComponent used in a subcomponent context example.");

        subcomponentSet.add(subcomponent3);

        TextDisplayComponent classUnderTest = new TextDisplayComponent();
        classUnderTest.setComponentType(ComponentType.TEXT);
        classUnderTest.setSequence((short) 1);
        classUnderTest.setChildComponents(subcomponentSet);
        classUnderTest.setTitle("Title");
        classUnderTest.setText("This is a TextComponent example.");

        return classUnderTest;
    }
}

