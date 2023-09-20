 class MobilePhone {
     double height;
     double breadth;
     double length;

    // Constructor with parameters for height, breadth, and length
     MobilePhone(double h, double b, double l) {
        height = h;
        breadth = b;
        length = l;
    }

    // Method to display the dimensions of the mobile phone
     void displayDimensions() {
        System.out.println("Height: " + height);
        System.out.println("Breadth: " + breadth);
        System.out.println("Length: " + length);
    }

    public static void main(String[] args) {
        // Create some mobile phone objects with different dimensions
        MobilePhone phone1 = new MobilePhone(5.5, 2.7, 0.3);
        MobilePhone phone2 = new MobilePhone(6.1, 3.0, 0.4);
        MobilePhone phone3 = new MobilePhone(5.8, 2.8, 0.3);

        // Display the dimensions of each mobile phone
        System.out.println("Mobile phone 1 dimensions:");
        phone1.displayDimensions();
        System.out.println("Mobile phone 2 dimensions:");
        phone2.displayDimensions();
        System.out.println("Mobile phone 3 dimensions:");
        phone3.displayDimensions();
    }
}
