package lld.LibraryManagementSystem;

import java.util.Date;
import java.util.List;

public class Library {

    String name;
    Address location;
    List<BookItem> books;
}

class Book {

    String uniqueIdNumber;
    String title;
    List<Author> authors;
    BookType bookType;
}

class BookItem extends Book {

    String barcode; // unique to one copy of book
    Date publicationDate; // can differ to many copies of a book
    Rack rackLocation;
    BookStatus bookStatus;
    BookFormat bookFormat;
    Date issueDate;
}

class Address {

    int pinCode; //ZipCode
    String street;
    String city;
    String state;
    String country;
}

enum BookType {

    SCI_FI, ROMANTIC, FANTASY, DRAMA;
}

enum BookFormat {

    HARDCOVER, PAPERBACK, NEWSPAPER, JOURNAL;
}

enum BookStatus {

    ISSUED, AVAILABLE, RESERVED, LOST;
}

class Rack {

    int number;
    String locationId;

}

class Person {

    String firstName;
    String lastName;

}

class Author extends Person {

    List<Book> booksPublished;

}

class SystemUser extends Person {

    String Email;
    String phoneNumber;
    Account account;
}

class Member extends SystemUser {

    int totalBookCheckedOut; //maximum of 5 books can be checked out

    Search searchObj;
    BookIssueService issueService;

}

class Librarian extends SystemUser {

    Search searchObj;
    BookIssueService issueService;

    public void addBookItem(BookItem bookItem){};
    public BookItem deleteBookItem(String barcode){return null;};
    public BookItem editBookItem(BookItem bookItem){return null;};
}

class Account {

    String userName;
    String password;
    int accountId;
}

class Search {

    public List<BookItem> geBookByTitle(String title){return null;};
    public List<BookItem> geBookByAuthor(Author author){return null;};
    public List<BookItem> geBookByType(BookType bookType){return null;};
    public List<BookItem> geBookByPublicationDate(Date publicationDate){return null;};

}

class BookIssueService {

    Fine fine;

    public BookReservationDetail getReservationDetail(BookItem book){return null;};

    public void updateReservationDetail(BookReservationDetail bookReservationDetail){};

    public BookReservationDetail reserveBook(BookItem book, SystemUser user){return null;};

    public BookIssueDetail issueBook(BookItem book, SystemUser user){return null;};

    // it will internaly call the issueBook function after basic validations
    public BookIssueDetail renewBook(BookItem book, SystemUser user){return null;};

    public void returnBook(BookItem book, SystemUser user){};

}

class BookLending {

    BookItem book;
    Date startDate;
    SystemUser user;
}

class BookReservationDetail extends BookLending {

    ReservationStatus reservationStatus;

}

class BookIssueDetail extends BookLending {

    Date dueDate;

}

class Fine {

    Date fineDate;
    BookItem book;
    SystemUser user;

    public double calculateFine(int days){return 0.0};
}