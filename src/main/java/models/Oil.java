package models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class Oil extends ChemistryItem {
    private int viscosity;
    private int flashPoint;

    public Oil(String name, int typeOfObject, int price, String brand, int balanceInStock, int viscosity, int flashPoint) {
        super(name, typeOfObject, price, brand, balanceInStock);
        this.viscosity = viscosity;
        this.flashPoint = flashPoint;
    }
}