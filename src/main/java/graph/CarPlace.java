package graph;

import java.util.ArrayList;
import java.util.List;

public class CarPlace {
    int placeNumber;
    boolean passed;
    boolean vacant;
    List<CarPlace> neighbours;

    CarPlace(int placeNumber) {
        this.placeNumber = placeNumber;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbours(CarPlace neighbourCarPlace) {
        this.neighbours.add(neighbourCarPlace);
    }

    public List<CarPlace> getNeighbours() {
        return neighbours;
    }
}
