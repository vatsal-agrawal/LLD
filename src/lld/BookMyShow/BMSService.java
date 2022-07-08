package lld.BookMyShow;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class BMSService  {

    List<CinemaHall> cinemas;

    public List<Movie> getMovies(Date date, String city){return null;};
    public List<CinemaHall> getCinemalHalls(String city){return null;};

}

class CinemaHall {

    int cinemaHallId;
    String cinemaHallName;

    Address address;

    List<Audi>audiList;

    public Map<Date, Movie> getMovies(List<Date> dateList){return null;};
    public Map<Date, Show> getShows(List<Date> dateList){return null;};

}

class Address {

    int pinCode; //ZipCode
    String street;
    String city;
    String state;
    String country;

}

class Audi {

    int audiId;
    String audiName;
    int totalSeats;

    List<Show> shows;

}

class Show {

    int showId;
    Movie movie;
    Date startTime;
    Date endTime;
    CinemaHall cinemaPlayedAt;
    List<Seat> seats; // based upon the show availability and price of seat may vary so it is a component of show

}

class Seat {

    int seatId;
    SeatType seatType;
    SeatStatus seatStatus;
    Double price;

}


enum SeatType {

    DELUX, VIP, ECONOMY, OTHER;

}

enum SeatStatus {

    BOOKED, AVAILABLE, RESERVED, NOT_AVAILABLE;

}

class Movie {

    String movieName;
    int movieId;
    int durationInMins;
    String language;
    Genre genre;
    Date releaseDate;
    Map<String, List<Show>> cityShowMap;

}

enum Genre {

    SCI_FI, DRAMA, ROM_COM, FANTASY;
}

class User {

    int userId;
    Search searchObj;

}

class SystemMember extends User {

    Account account;
    String name;
    String email;
    Address address;

}



class Member extends SystemMember {

    public Booking makeBooking(Booking booking){return null;};
    public List<Booking> getBooking(){return null;};

}

class Admin extends SystemMember {

    public boolean addMovie(Movie movie){return false;};
    public boolean addShow(Show show){return false;};

}

class Account {

    String userName;
    String password;

}

class Search {

    public List<Movie> searchMoviesByNames(String name){return null;};
    public List<Movie> searchMoviesByGenre(Genre genre){return null;};
    public List<Movie> searchMoviesByLanguage(String language){return null;};
    public List<Movie> searchMoviesByDate(Date releaseDate){return null;};
}

class Booking {

    String bookingId;
    Date bookingDate;
    Member member;
    Audi audi;
    Show show;
    BookingStatus bookingStatus;
    double totalAmount;
    List<Seat> seats;
    Payment paymentObj;

    public boolean makePayment(Payment payment){return false;};

}

class Payment {

    double amount;
    Date paymentDate;
    int transactionId;
    PaymentStatus paymentStatus;

}

enum BookingStatus {

    REQUESTED, PENDING, CONFIRMED, CANCELLED;
}

enum PaymentStatus {

    UNPAID, PENDING, COMPLETED, DECLINED, CANCELLED, REFUNDED;

}