package controller;

import data.*;
import service.DesktopBuilder;

public class DesktopController {
    public Desktop getDesktopByParameters(String cpuBrand, String cpuModel, String gcBrand, String gcModel,
                                          String ramBrand, String ramMemory, String ssdBrand, String ssdMemory){
        DesktopBuilder db = new DesktopBuilder();
        return db.built(db.setCPU(cpuBrand,cpuModel), db.setGraphicsCard(gcBrand, gcModel),
                        db.setRAM(ramBrand, ramMemory), db.setSSD(ssdBrand,ssdMemory));
    }
}
