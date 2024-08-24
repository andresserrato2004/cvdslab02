package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape createShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case TRIANGLE:
                return new Triangle();
            // Agrega más formas según sea necesario
            default:
                throw new IllegalArgumentException("Shape type not supported.");
        }
    }
}

