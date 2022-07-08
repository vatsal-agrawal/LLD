package lld.basics.SOLID.InterfaceSegregation;

//public interface Shape {
//    double calculateArea();
//    double calculateVolume();
//}
//
//class Cuboid implements Shape{
//
//    @Override
//    public double calculateArea() {
//        return 0;
//    }
//
//    @Override
//    public double calculateVolume() {
//        return 0;
//    }
//}
//
//class Square implements Shape{
//
//    @Override
//    public double calculateArea() {
//        return 0;
//    }
//
//    // no use
//    @Override
//    public double calculateVolume() {
//        return 0;
//    }
//}

public interface TwoDimensionalShape {
    double calculateArea();
}

interface ThreeDimensionalShape{
    double calculateVolume();
}

class Cuboid implements TwoDimensionalShape, ThreeDimensionalShape{

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}

class Square implements TwoDimensionalShape{

    @Override
    public double calculateArea() {
        return 0;
    }
}
