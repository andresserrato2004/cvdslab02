package edu.eci.cvds.patterns.shapes;

public class ShapesMain {
  public static void main(String[] args) {
    if (args == null || args.length != 1) {
      System.err.println("Parameter of type RegularShapesType is required.");
      return;
    }
    try {
      RegularShapesType type = RegularShapesType.valueOf(args[0]);
      Shape shape = ShapeFactory.create(type);
      System.out.println(
        String.format(
          "Successfully created a %s with %s sides.",
          type,
          shape.getNumberOfEdges()
        )
      );
    } catch (IllegalArgumentException ex) {
      System.err.println(
        "Parameter '" + args[0] + "' is not a valid RegularShapesType"
      );
      return;
    }
  }
}