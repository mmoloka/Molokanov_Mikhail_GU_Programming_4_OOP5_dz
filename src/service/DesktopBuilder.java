package service;

import data.*;

public class DesktopBuilder {
    private CPU processor;
    private GraphicsCard videoAdapter;
    private RAM memoryCard;
    private SSD hardDisk;

    public CPU setCPU(String brand, String model) {
        return this.processor = new CPU(brand,model);
    }
    public GraphicsCard setGraphicsCard(String brand, String model) {
        return this.videoAdapter = new GraphicsCard(brand,model);
    }
    public RAM setRAM(String brand, String memory) {
        return this.memoryCard = new RAM(brand,memory);
    }
    public SSD setSSD(String brand, String memory) {
        return this.hardDisk = new SSD(brand,memory);
    }

    public Desktop built(CPU processor, GraphicsCard videoAdapter, RAM memoryCard, SSD hardDisk) {
        CPUService cpuService = new CPUService();
        GraphicsCardService graphicsCardService = new GraphicsCardService();
        RAMService ramService = new RAMService();
        SSDService ssdService = new SSDService();

        Desktop desktop = new Desktop(
            cpuService.getCPU(cpuService.initializeCPUList(), processor.getBrand(), processor.getModel()),
            graphicsCardService.getGraphicsCard(graphicsCardService.initializeGraphicsCardList(),
                                                videoAdapter.getBrand(), videoAdapter.getModel()),
            ramService.getRAM(ramService.initializeRAMList(), memoryCard.getBrand(), memoryCard.getMemory()),
            ssdService.getSSD(ssdService.initializeSSDList(), hardDisk.getBrand(), hardDisk.getMemory()));
        return desktop;
    }
}
