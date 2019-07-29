package rocks.zipcode.quiz4.collections.culonary;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    private ArrayList<Spice> spices;
    private Map<Spice, Integer> spiceIntegerMap;

    public Food() {
        this.spices = new ArrayList<>();
        this.spiceIntegerMap = new LinkedHashMap<>();
    }

    public List<Spice> getAllSpices() {

        return this.spices;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        return null;
    }

    public void applySpice(Spice spice) {

        this.spices.add(spice);

    }
}
