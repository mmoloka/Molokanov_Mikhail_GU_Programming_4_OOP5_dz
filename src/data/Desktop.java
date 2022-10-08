package data;

public class Desktop {

    private CPU processor;
    private GraphicsCard videoAdapter;
    private RAM memoryCard;
    private SSD hardDisk;

    public Desktop(CPU processor, GraphicsCard videoAdapter, RAM memoryCard, SSD hardDisk) {
        this.processor = processor;
        this.videoAdapter = videoAdapter;
        this.memoryCard = memoryCard;
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "processor=" + processor +
                ", videoAdapter=" + videoAdapter +
                ", memoryCard=" + memoryCard +
                ", hardDisk=" + hardDisk +
                '}';
    }
}
