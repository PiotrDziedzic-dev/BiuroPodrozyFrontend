package com.kodilla.biuro;


import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("mainPage")
public class MainView extends VerticalLayout {

    public MainView() {

        Button kontaktButton = new Button("Contact", event -> UI.getCurrent().navigate("kontakt"));
        Button oNasButton = new Button("About us", event -> UI.getCurrent().navigate("aboutUs"));
        Button mojeKontoButton = new Button("My Account", event -> UI.getCurrent().navigate("otherServices"));
        Button wyszukajWakacjeButton = new Button("Find Trip", event -> UI.getCurrent().navigate("page5"));
        Button lastMinuteButton = new Button("Last Minute", event -> UI.getCurrent().navigate("page6"));
        Button bestsellersButton = new Button("Bestsellers", event -> UI.getCurrent().navigate("page7"));
        Button blogOPodróżachButton = new Button("Trip Blog", event -> UI.getCurrent().navigate("page8"));
        Button inneUslugiButton = new Button("Other services", event -> UI.getCurrent().navigate("otherServices"));


        MenuBar menuBar = new MenuBar();
        menuBar.setOpenOnHover(true);
        menuBar.addItem(kontaktButton);
        menuBar.addItem(oNasButton);
        menuBar.addItem(mojeKontoButton);

        MenuItem inneUsługi = menuBar.addItem("Inne usługi");
        inneUsługi.getSubMenu().addItem("Wynajmnij Samochód",event -> UI.getCurrent().navigate("a"));
        inneUsługi.getSubMenu().addItem("Wynajmnij Autokar",event -> UI.getCurrent().navigate("a"));
        inneUsługi.getSubMenu().addItem("Wynajmnij Jacht",event -> UI.getCurrent().navigate("a"));
        inneUsługi.getSubMenu().addItem("Wynajmnij Helikopter",event -> UI.getCurrent().navigate("a"));


        HorizontalLayout layoutMenuBar = new HorizontalLayout();
        layoutMenuBar.setPadding(true);
        layoutMenuBar.addAndExpand(kontaktButton,oNasButton,mojeKontoButton,inneUslugiButton);

        Image image = new Image("https://i.pinimg.com/564x/29/7e/c4/297ec4523d17ff846127c0d759dca45a.jpg","nie ma");
        HorizontalLayout layoutImage = new HorizontalLayout();
        layoutImage.setPadding(true);
        layoutImage.addAndExpand(image);

        HorizontalLayout layout = new HorizontalLayout();
        layout.setPadding(true);
        layout.addAndExpand(wyszukajWakacjeButton,lastMinuteButton,bestsellersButton,blogOPodróżachButton);

        add(layoutMenuBar,layoutImage,layout);

    }

}

