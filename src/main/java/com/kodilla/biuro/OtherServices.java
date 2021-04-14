package com.kodilla.biuro;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.EnableVaadin;

@EnableVaadin
@Route("otherServices")
public class OtherServices extends VerticalLayout {

    public OtherServices() {

        HorizontalLayout layout1 = new HorizontalLayout();
        layout1.setPadding(true);
        HorizontalLayout layout2 = new HorizontalLayout();
        layout2.setPadding(true);
        HorizontalLayout layout3 = new HorizontalLayout();
        layout3.setPadding(true);

        Icon carIcon = new Icon(VaadinIcon.CAR);
        carIcon.setSize("100px");
        carIcon.setColor("blue");
        Icon helicopterIcon = new Icon(VaadinIcon.AIRPLANE);
        helicopterIcon.setSize("100px");
        helicopterIcon.setColor("blue");
        Icon busIcon = new Icon(VaadinIcon.BUSS);
        busIcon.setSize("100px");
        busIcon.setColor("blue");
        Icon boatIcon = new Icon(VaadinIcon.BOAT);
        boatIcon.setSize("100px");
        boatIcon.setColor("blue");

        Button carsButton = new Button("CARS", event -> UI.getCurrent().navigate("carRentingSystem"));
        Button helicoptersButton = new Button();
        helicoptersButton.setText("HELICOPTERS");
        Button bussesButton = new Button();
        bussesButton.setText("BUSSES");
        Button boatsButton = new Button();
        boatsButton.setText("BOATS");

        Button mainPageButton = new Button("BACK TO MAIN PAGE", event -> UI.getCurrent().navigate("mainPage"));
        layout3.addAndExpand(mainPageButton);

        layout2.addAndExpand(carsButton,helicoptersButton,bussesButton,boatsButton);
        layout1.addAndExpand(carIcon,helicopterIcon,busIcon,boatIcon);
        add(layout1);
        add(layout2);
        add(layout3);
    }
}
