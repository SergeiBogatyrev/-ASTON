    interface Shape {
    default double calculatePerimeter() {
        return 0.0;
    }

    default double calculateArea() {
        return 0.0;
    }

    String getFillColor();

    String getBorderColor();
}

