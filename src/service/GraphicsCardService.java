package service;

import data.GraphicsCard;

import java.util.ArrayList;
import java.util.List;

public class GraphicsCardService {

    public GraphicsCard getGraphicsCard(List<GraphicsCard> gc, String brand, String model) {
        for(GraphicsCard item : gc) {
            if(item.getBrand().equals(brand) && item.getModel().equals(model)) {
                return item;
            }
        }
        return null;
    }

    public List<GraphicsCard> initializeGraphicsCardList() {
        List<GraphicsCard> gc = new ArrayList<>();
        gc.add(new GraphicsCard("Nvidia", "GeForce GT 710"));
        gc.add(new GraphicsCard("Nvidia", "GeForce GT 730"));
        gc.add(new GraphicsCard("Nvidia", "GeForce 210"));
        gc.add(new GraphicsCard("Radeon", "550 LP"));
        gc.add(new GraphicsCard("Radeon", "RX 550"));
        gc.add(new GraphicsCard("Radeon", "RX 580"));
        return gc;
    }
}
