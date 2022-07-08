package lld.basics.SOLID.singleResponsibility;

public class Book {
    private String bookName, author, text;

    //duty related to book property
    // these are good as they are taking only book properties
    public boolean findByAuthor(String authName){
        return author.contains(authName);
    }

    public boolean findByName(String bookName){
        return bookName.contains(bookName);
    }

    // this will break single responsibility beacuse this may call other classes or functions
//    void printTextToConsole(){
//
//    }
}

class BookPrinter{
    // if any other printer comes we can write that one there as well
    void printTextToConsole(){

    }

    void shareTextToSomeOtherMedium(){

    }

}
