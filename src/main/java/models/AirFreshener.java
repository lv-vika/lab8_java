package models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class AirFreshener extends ChemistryItem {
    private String flavor;


    public AirFreshener(String name, int typeOfObject, int price, String brand, int balanceInStock, String flavor) {
        super(name, typeOfObject, price, brand, balanceInStock);
        this.flavor = flavor;
    }
}