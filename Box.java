public class Box{
    double height;
    double breadth;
    double length;

    // Constructor with parameters for height, breadth, and length
    Box(double h, double b, double l) {
        height = h;
        breadth = b;
        length = l;
    }

    // Method to calculate and return the volume of the box
    double getVolume() {
        return height * breadth * length;
    }

    public static void main(String[] args) {
        // Create some box objects with different dimensions
        Box box1 = new Box(2.5, 3.0, 4.0);
        Box box2 = new Box(1.0, 2.0, 3.0);
        Box box3 = new Box(4.0, 4.0, 4.0);

        // Print the volume of each box
        System.out.println("Box 1 volume: " + box1.getVolume());
        System.out.println("Box 2 volume: " + box2.getVolume());
        System.out.println("Box 3 volume: " + box3.getVolume());
    }
}

