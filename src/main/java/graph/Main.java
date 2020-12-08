package graph;

public class Main {
    public static void main(String[] args) {

        CarPlace carPlace0 = new CarPlace(0);
        CarPlace carPlace1 = new CarPlace(1);
        CarPlace carPlace11 = new CarPlace(11);
        CarPlace carPlace12 = new CarPlace(12);
        CarPlace carPlace13 = new CarPlace(13);
        CarPlace carPlace2 = new CarPlace(2);
        CarPlace carPlace21 = new CarPlace(21);
        CarPlace carPlace22 = new CarPlace(22);
        CarPlace carPlace221 = new CarPlace(221);
        CarPlace carPlace222 = new CarPlace(222);
        CarPlace carPlace23 = new CarPlace(23);


        carPlace0.addNeighbours(carPlace1);
        carPlace0.addNeighbours(carPlace2);
        carPlace1.addNeighbours(carPlace11);
        carPlace1.addNeighbours(carPlace12);
        carPlace1.addNeighbours(carPlace13);
        carPlace2.addNeighbours(carPlace21);
        carPlace2.addNeighbours(carPlace22);
        carPlace2.addNeighbours(carPlace23);
        carPlace22.addNeighbours(carPlace221);
        carPlace22.addNeighbours(carPlace222);

        DepthIterator depthIterator = new DepthIterator();

        depthIterator.initEntryPoint(carPlace0);

        carPlace23.vacant = true;
        carPlace2.vacant = true;

//        System.out.println("Обход элементов в глубину");
//        while (depthIterator.hasNext())
//            System.out.print(depthIterator.getNext().placeNumber + " ");

//        System.out.println("Поиск свободных мест при обходе в глубину");
//        while (depthIterator.hasNext()) {
//            CarPlace carPlace = depthIterator.getNext();
//            if(carPlace.vacant)
//                System.out.println(carPlace.placeNumber);;
//        }


        BreadthIterator breadthIterator = new BreadthIterator();
        breadthIterator.initEntryPoint(carPlace0);

//        System.out.println("Обход элементов в ширину");
//        while (breadthIterator.hasNext())
//            System.out.print(breadthIterator.getNext().placeNumber + " ");

        System.out.println("Поиск свободных мест при обходе в ширину");
        while (depthIterator.hasNext()) {
            CarPlace carPlace = depthIterator.getNext();
            if(carPlace.vacant)
                System.out.println(carPlace.placeNumber);;
        }
    }

}
