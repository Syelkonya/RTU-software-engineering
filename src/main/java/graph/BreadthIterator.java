package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthIterator {

    Queue<CarPlace> carPlacesQueue = new LinkedList<>();

    public void initEntryPoint(CarPlace carPlace){
        carPlacesQueue.add(carPlace);
    }

    public boolean hasNext() {
        return !carPlacesQueue.isEmpty();
    }

    public CarPlace getNext() {
        CarPlace place = carPlacesQueue.remove();

        for (CarPlace p : place.getNeighbours()) {
            if (p != null && !p.passed)
                carPlacesQueue.add(p);
        }
        if(!place.passed) {
            place.passed = true;
            return place;
        }
        return null;
    }
}
