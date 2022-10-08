package service;

import data.SSD;

import java.util.ArrayList;
import java.util.List;

public class SSDService {

    public SSD getSSD(List<SSD> ssd, String brand, String memory) {
        for(SSD item : ssd) {
            if(item.getBrand().equals(brand) && item.getMemory().equals(memory)) {
                return item;
            }
        }
        return null;
    }

    public List<SSD> initializeSSDList() {
        List<SSD> ssd = new ArrayList<>();
        ssd.add(new SSD("Samsung", "512 Gb"));
        ssd.add(new SSD("Samsung", "1 Tb"));
        ssd.add(new SSD("Kingston", "512 Gb"));
        ssd.add(new SSD("Kingston", "1 Tb"));
        ssd.add(new SSD("Netac", "512 Gb"));
        ssd.add(new SSD("Netac", "1 Tb"));
        return ssd;
    }
}
