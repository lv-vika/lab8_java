package org.example;

import enums.ChemistryType;
import manager.*;
import models.*;
import java.util.List;

public class App 
{
    public static void main(final String[] args) {
        List<ChemistryItem> chemistry = List.of(
                new AirFreshener("Allure sport", 139, 10, "Dope", 35, "strawberry"),
                new Oil("oil1", 300, 25, "brand1", 10, 400, 56),
                new WindshieldWasher("wind", 300, 25, "brand1", 10, 400, 56)
                );
        CarChemistryStoreManager storeManager = new CarChemistryStoreManager(chemistry);


        System.out.println("Sorting by price");
        CarChemistryStoreManager.printSortedObjects(storeManager.sortByPrice(true));
        System.out.println("--------------------------------------------");

        System.out.println("Search by name");
        CarChemistryStoreManager.printSortedObjects(storeManager.searchByName("oil1"));
        System.out.println("----------------------------------------------");


    }
}
