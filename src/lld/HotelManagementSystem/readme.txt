First step -> Gather requirements in such a way that you can identify actors, actions ie there use cases
                and components.

enums are good to define status of a particular object or type of a particular object

Requirements:

    The system should support the booking of different
    room types like standard, deluxe ete(Component is room type ie standard, deluxe)

    Guests should be able to search the room inventory
    and book any available room(action ie functions)(guest is an actor, search and book is use case)

    The system should be able to retrieve information, such as who booked a particular room, or what
    rooms were booked by a specific customer.

    The system should allow customers to cancel their booking - and provide them with a full refund if,
    the cancellation occurs before 24 hours of the check-in date.

    The system should be able to send notifications whenever the booking is nearing the check-in
    check-out date.

    The system should maintain a room housekeeping log to keep track of all housekeeping tasks.

    Any customer should be able to add room services and food items.

    The customers should be able to pay their bills through credit card, check or cash.

    Admin should be able to add delete and edit a room

Actors:
    Guest
    Receptionist
    Admin
    Server
    HouseKeeping

Use Cases:
    Add/Remove/Edit room
    Search room
    Book room
    Cancel room
    Check-in
    Check-out
    Update HouseKeeping Logs