package edu.eci.cvds.patterns.shapes.concrete;

import edu.eci.cvds.patterns.shapes.Shape;

public class Square implements Shape {
    @Override
    public int getNumberOfEdges() {
        return 4;
    }
}
