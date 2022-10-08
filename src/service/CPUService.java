package service;

import data.CPU;

import java.util.ArrayList;
import java.util.List;

public class CPUService {

    public CPU getCPU(List<CPU> cpu, String brand, String model) {
        for (CPU item : cpu) {
            if(item.getBrand().equals(brand) && item.getModel().equals(model)) {
                return item;
            }

        }
        return null;
    }

    public List<CPU> initializeCPUList() {
        List<CPU> cpu = new ArrayList<>();
        cpu.add(new CPU("Intel", "Core i3"));
        cpu.add(new CPU("Intel", "Core i5"));
        cpu.add(new CPU("Intel", "Core i7"));
        cpu.add(new CPU("AMD", "Ryzen 5"));
        cpu.add(new CPU("AMD", "Ryzen 7"));
        cpu.add(new CPU("AMD", "Ryzen 7PRO"));
        return cpu;
    }


}
