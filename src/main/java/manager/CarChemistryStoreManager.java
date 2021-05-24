package manager;
import lombok.AllArgsConstructor;
import models.ChemistryItem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class CarChemistryStoreManager {
    private final List<ChemistryItem> chemistry;

    public List<ChemistryItem> searchByName(String name) {
        return chemistry.stream().filter(device -> device.getName() == name).collect(Collectors.toList());
    }

    public List<ChemistryItem> sortByPrice(boolean sortOrder) {
        List<ChemistryItem> allObjectsSorted = new ArrayList<>(chemistry);
        if (sortOrder) {
            allObjectsSorted.sort(Comparator.comparing(ChemistryItem::getPrice));
        } else {
            allObjectsSorted.sort(Comparator.comparing(ChemistryItem::getPrice).reversed());
        }
        return allObjectsSorted;
    }

    public static void printSortedObjects(List<ChemistryItem> chemistry) {
        chemistry.forEach(System.out::println);
    }
}
