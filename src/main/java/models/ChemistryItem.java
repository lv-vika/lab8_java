package models;
import lombok.Data;

@Data
public class ChemistryItem {
    protected String name;
    protected int typeOfObject;
    protected int price;
    protected String brand;
    protected int balanceInStock;

    ChemistryItem(String name, int typeOfObject, int price, String brand, int balanceInStock) {
        this.name = name;
        this.typeOfObject = typeOfObject;
        this.price = price;
        this.brand = brand;
        this.balanceInStock = balanceInStock;
    }

    protected ChemistryItem() {

    }
}
