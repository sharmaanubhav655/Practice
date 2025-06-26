package ENUM_Sample;

class Main_Enum {
    enum Color {
        RED, GREEN, BLUE, YELLOW;
    }

    // Main Function
    public static void main(String[] args) {
        Color color = Color.RED;

        switch (color) {
            case RED:
                System.out.println("Red color observed");
                break;
            case GREEN:
                System.out.println("Green color observed");
                break;
            case BLUE:
                System.out.println("Blue color observed");
                break;
            default:
                System.out.println("Other color observed");
        }
    }
}