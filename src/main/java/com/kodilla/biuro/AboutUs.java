package com.kodilla.biuro;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.EnableVaadin;

@EnableVaadin
@Route("aboutUs")
public class AboutUs extends VerticalLayout {

    public AboutUs() {

        Dialog dialog = new Dialog();
        dialog.add(new Text("Informacje o nas............... !!! "));
        dialog.setCloseOnEsc(false);
        dialog.setCloseOnOutsideClick(false);

        Button confirmButton = new Button("OK", event -> {
            dialog.close();
        });
        dialog.add(new Div( confirmButton));

        HorizontalLayout layout1 = new HorizontalLayout();
        HorizontalLayout layout2 = new HorizontalLayout();

        Button aboutUsButton = new Button();
        aboutUsButton.addClickListener(event -> dialog.open());
        aboutUsButton.setText("ABOUT US");
        aboutUsButton.setHeight("300px");
        aboutUsButton.setWidth("300px");
        aboutUsButton.setIconAfterText(true);
        aboutUsButton.setIcon(new Icon(VaadinIcon.GLOBE));

        Button mainPageButton = new Button("BACK TO MAIN PAGE", event -> UI.getCurrent().navigate("mainPage"));
        layout1.addAndExpand(mainPageButton);
        layout2.addAndExpand(aboutUsButton);

        add(layout2,layout1);

    }
}
