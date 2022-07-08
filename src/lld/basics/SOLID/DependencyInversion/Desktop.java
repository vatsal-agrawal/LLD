package lld.basics.SOLID.DependencyInversion;
//
//public class Desktop {
//    private Monitor monitor;
//    private QwertyKeyboard keyboard;
//
//    // high level module is depending upon low level module
////    public Desktop(){
////        this.monitor = new Monitor();
////        this.keyboard = new QwertyKeyboard();
////    }
//
//    // high level module is not depending upon low level module
//    public Desktop(QwertyKeyboard keyboard, Monitor monitor){
//        this.monitor = monitor;
//        this.keyboard = keyboard;
//    }
//}
//
//class Monitor{}
//class QwertyKeyboard{}





// Part 2 -> both should depend upon abstraction
public class Desktop {
    private Monitor monitor;
    private Keyboard keyboard;

    // high level module is depending upon low level module
//    public Desktop(){
//        this.monitor = new Monitor();
//        this.keyboard = new QwertyKeyboard();
//    }

    // high level module is not depending upon low level module
    public Desktop(Keyboard keyboard, Monitor monitor){
        this.monitor = monitor;
        this.keyboard = keyboard;
    }
}

interface Keyboard{}
class Monitor{}
class QwertyKeyboard implements Keyboard{}