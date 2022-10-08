package service;

import data.RAM;

import java.util.ArrayList;
import java.util.List;

public class RAMService {

    public RAM getRAM(List<RAM> ram, String brand, String memory) {
        for(RAM item : ram) {
            if(item.getBrand().equals(brand) && item.getMemory().equals(memory)) {
                return item;
            }
        }
        return null;
    }

    public List<RAM> initializeRAMList() {
        List<RAM> ram = new ArrayList<>();
        ram.add(new RAM("Kingston", "4 Gb"));
        ram.add(new RAM("Kingston", "8 Gb"));
        ram.add(new RAM("AMD", "4 Gb"));
        ram.add(new RAM("AMD", "8 Gb"));
        ram.add(new RAM("Patriot", "4 Gb"));
        ram.add(new RAM("Patriot", "8 Gb"));
        return ram;
    }
}
