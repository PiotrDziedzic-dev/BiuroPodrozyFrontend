package com.kodilla.biuro;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.textfield.TextFieldVariant;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.EnableVaadin;

@EnableVaadin
@Route("kontakt")
public class Contact extends VerticalLayout {

    public Contact() {

        HorizontalLayout layout1 = new HorizontalLayout();
        layout1.setPadding(true);

        HorizontalLayout layout2 = new HorizontalLayout();
        layout2.setPadding(true);

        HorizontalLayout layout3 = new HorizontalLayout();
        layout3.setPadding(true);

        HorizontalLayout layout4 = new HorizontalLayout();
        layout4.setPadding(true);

        Icon contactIcon = new Icon(VaadinIcon.ENVELOPE);
        contactIcon.setSize("200px");
        contactIcon.setColor("blue");
        Icon jobIcon = new Icon(VaadinIcon.SPECIALIST);
        jobIcon.setSize("200px");
        jobIcon.setColor("blue");
        Icon localizationIcon = new Icon(VaadinIcon.LOCATION_ARROW);
        localizationIcon.setSize("200px");
        localizationIcon.setColor("blue");
        layout1.addAndExpand(contactIcon,jobIcon,localizationIcon);

        TextField leftTextField = new TextField();
        leftTextField.setValue("Contact Us");
        leftTextField.addThemeVariants(TextFieldVariant.LUMO_ALIGN_CENTER);

        TextField centerTextField = new TextField();
        centerTextField.setValue("Sign up for a job");
        centerTextField.addThemeVariants(TextFieldVariant.LUMO_ALIGN_CENTER);

        TextField rightTextField = new TextField();
        rightTextField.setValue("Our location");
        rightTextField.addThemeVariants(TextFieldVariant.LUMO_ALIGN_CENTER);

        layout2.addAndExpand(leftTextField,centerTextField,rightTextField);

        TextArea textArea = new TextArea();
        textArea.setPlaceholder("Our Contact ...");

        TextArea textArea2 = new TextArea();
        textArea.setPlaceholder("Jobs ...");

        TextArea textArea3 = new TextArea();
        textArea.setPlaceholder("Our Location ...");

        layout3.addAndExpand(textArea,textArea2,textArea3);

        Button mainPageButton = new Button("BACK TO MAIN PAGE", event -> UI.getCurrent().navigate("mainPage"));
        layout4.addAndExpand(mainPageButton);

        add(layout1,layout2,layout3,layout4);


    }
}
