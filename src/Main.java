import controller.DesktopController;
import data.Desktop;

public class Main {

    public static void main(String[] args) {
        DesktopController controller = new DesktopController();

        Desktop result = controller.getDesktopByParameters("Intel", "Core i5",
                                                           "Nvidia", "GeForce GT 730",
                                                           "Kingston", "8 Gb",
                                                           "Netac", "1 Tb");
        System.out.println(result);
    }
}
