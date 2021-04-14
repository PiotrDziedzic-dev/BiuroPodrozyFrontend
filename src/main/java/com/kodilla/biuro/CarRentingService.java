package com.kodilla.biuro;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.EnableVaadin;

@EnableVaadin
@Route("carRentingSystem")
public class CarRentingService extends VerticalLayout {

    private Grid<Book> carsGrid = new Grid<>(Book.class);
    private BookService bookService = BookService.getInstance();
    private TextField filter = new TextField();

    private void update() {

        carsGrid.setItems(bookService.findByTitle(filter.getValue()));

    }

    public CarRentingService() {

        filter.setPlaceholder("Filter by brand");
        filter.setClearButtonVisible(true);
        filter.setValueChangeMode(ValueChangeMode.EAGER);
        filter.addValueChangeListener(event -> update());
        carsGrid.setColumns("title", "author", "publicationYear", "type");
        add(filter,carsGrid);
        setSizeFull();
        carsGrid.setItems(bookService.getBooks());

    }
}
