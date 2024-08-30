package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory implements ShapeFactoryMethod {
    public static Shape create(RegularShapesType type) {
        switch (type) {
            case Pentagon:
                return new Pentagon();
            case Quadrilateral:
                return new Quadrilateral();
            case Triangle:
                return new Triangle();
            case Hexagon:
                return new Hexagon();
            default:
                throw new IllegalArgumentException("Shape type not supported.");
        }
    }
}