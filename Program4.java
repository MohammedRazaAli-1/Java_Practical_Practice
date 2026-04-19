// 4.Define class phone and camera with required data members and member function,
//  constructors and inherit these class in Smart phone with additional attributes.

class Phone {
    double height;
    double displaySize;
    boolean sim_option;

    Phone(double h, double d, boolean sim) {
        height = h;
        displaySize = d;
        sim_option = sim;
    }

    void phoneInfo() {
        System.out.println("Height: " + height);
        System.out.println("Display Size: " + displaySize + " inch");
        if (sim_option) {
            System.out.println("Phone has SIM option");
        }
    }
}

// Interface
interface Camera {
    void cameraInfo();
}

// Smartphone class
class SmartPhone extends Phone implements Camera {
    String brand;
    String Model;
    int LaunchYear;
    int megapixel;
    double zoom;

    SmartPhone(double h, double d, boolean sim, String b, String m , int y, int mp, double z) {
        super(h, d, sim);
        brand = b;
        Model = m;
        LaunchYear = y;
        megapixel = mp;
        zoom = z;
    }

    // Implement interface method
    public void cameraInfo() {
        System.out.println("Camera: " + megapixel + " MP");
        System.out.println("Zoom: " + zoom + "X");
    }

    void smartPhoneInfo() {
        System.out.println("smartphone Brand is: " + brand + "of model "+ Model + "Launched in year "+ LaunchYear);
        phoneInfo();
        cameraInfo();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        SmartPhone s1 = new SmartPhone(6.0, 6.5, true, "Samsung", "S24 ultra" , 2025 , 64, 10);

        s1.smartPhoneInfo();
    }
}