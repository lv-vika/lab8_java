package models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class WindshieldWasher extends ChemistryItem{
    private int alcoholContent;
    private int freezingPoint;

    public WindshieldWasher(String name, int typeOfObject, int price, String brand, int balanceInStock, int alcoholContent, int freezingPoint) {
        super(name, typeOfObject, price, brand, balanceInStock);
        this.alcoholContent = alcoholContent;
        this.freezingPoint = freezingPoint;
    }
}
