package graph;

import java.util.Stack;

public class DepthIterator {

    Stack<CarPlace> stack = new Stack<>();

    public void initEntryPoint(CarPlace carPlace) {
        stack.add(carPlace);
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public CarPlace getNext() {
        CarPlace place = stack.pop();

        for (CarPlace p : place.getNeighbours()) {
            if (p != null && !p.passed)
                stack.add(p);
        }

        if (!place.passed) {
            place.passed = true;
            return place;
        }
        return null;

    }

}
