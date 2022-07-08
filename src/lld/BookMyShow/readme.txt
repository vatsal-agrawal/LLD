Interviewer might ask to extend to any event other than movies like stadium booking, concert etc
so we can make event place clas and extend our cinemahall to that also we can take concert and
can extend to that as well. and inside bms service we can put List<EventPlace> events.. thats it.
instead of movie it can be event type.

So using strategy pattern and inheritance we can extend this booking system to any kind of booking system

Requirements

    . It should be able to list the cities where affiliate cinemas
    are located.

    . Each cinema can have multiple Audis and each Audi
    can run one movie show at a time.

    . Each Movie will have multiple shows.

    . Customers should be able to search movies by their
    title, language, genre, release date, and city name.

    . Once the customer selects a movie, the service should
    display the cinemas running that movie and its
    available shows.

    . The customer should be able to select a show at a
    particular cinema and book their tickets.

    . The service should show the customer the seating
    arrangement of the cinema hall. The customer should
    be able to select multiple seats according to their
    preference.

    . The customer should be able to distinguish
    available seats and booked ones.