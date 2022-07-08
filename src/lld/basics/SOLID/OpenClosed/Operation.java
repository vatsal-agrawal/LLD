package lld.basics.SOLID.OpenClosed;

// here we have to modify the existing class if new functionality comes. That may introduce a bug in existing flow
//public class Operation {
//    public double calculate(double a1, double a2, String operationType){
//        switch (operationType){
//            case "+": {
//                return a1 + a2;
//            }
//            case "-": {
//                return a1 - a2;
//            }
//            default:
//        }
//        return 0;
//    }
//}

// so we should extend it instead of modifying it
public interface Operation {
    public double calculate(double a1, double a2);

}

class AddOperation implements Operation{

    @Override
    public double calculate(double a1, double a2) {
        return a1 + a2;
    }
}

class SubtractOperation implements Operation{

    @Override
    public double calculate(double a1, double a2) {
        return a1 - a2;
    }
}
