package dev.lpa;

public class BookingAgent {

    public static void main(String[] args) {

        int rows = 10;
        int totalSeats = 100;
        Theatre rodgerNYC = new Theatre("Richard Rodgers", rows, totalSeats);

        rodgerNYC.printSeatMap();
//        ------------------------------------------------------------------------------------------
//        Richard Rodgers Seat Map
//        ------------------------------------------------------------------------------------------
//        A001    A002    A003    A004    A005    A006    A007    A008    A009    A010
//        B001    B002    B003    B004    B005    B006    B007    B008    B009    B010
//        C001    C002    C003    C004    C005    C006    C007    C008    C009    C010
//        D001    D002    D003    D004    D005    D006    D007    D008    D009    D010
//        E001    E002    E003    E004    E005    E006    E007    E008    E009    E010
//        F001    F002    F003    F004    F005    F006    F007    F008    F009    F010
//        G001    G002    G003    G004    G005    G006    G007    G008    G009    G010
//        H001    H002    H003    H004    H005    H006    H007    H008    H009    H010
//        I001    I002    I003    I004    I005    I006    I007    I008    I009    I010
//        J001    J002    J003    J004    J005    J006    J007    J008    J009    J010
//        ------------------------------------------------------------------------------------------

        bookSeat(rodgerNYC, 'A', 3);
//        ------------------------------------------------------------------------------------------
//        Congratulations! Your reserved seat is A003
//        ------------------------------------------------------------------------------------------
//        Richard Rodgers Seat Map
//        ------------------------------------------------------------------------------------------
//        A001    A002    A003(●) A004    A005    A006    A007    A008    A009    A010
//        B001    B002    B003    B004    B005    B006    B007    B008    B009    B010
//        C001    C002    C003    C004    C005    C006    C007    C008    C009    C010
//        D001    D002    D003    D004    D005    D006    D007    D008    D009    D010
//        E001    E002    E003    E004    E005    E006    E007    E008    E009    E010
//        F001    F002    F003    F004    F005    F006    F007    F008    F009    F010
//        G001    G002    G003    G004    G005    G006    G007    G008    G009    G010
//        H001    H002    H003    H004    H005    H006    H007    H008    H009    H010
//        I001    I002    I003    I004    I005    I006    I007    I008    I009    I010
//        J001    J002    J003    J004    J005    J006    J007    J008    J009    J010
//        ------------------------------------------------------------------------------------------


        bookSeat(rodgerNYC, 'A', 3);
//        Seat's already reserved.
//        Sorry! Unable to reserve A3

        bookSeat(rodgerNYC, 'B', 1);
//        Congratulations! Your reserved seat is B001
//        ------------------------------------------------------------------------------------------
//        Richard Rodgers Seat Map
//        ------------------------------------------------------------------------------------------
//        A001    A002    A003(●) A004    A005    A006    A007    A008    A009    A010
//        B001(●) B002    B003    B004    B005    B006    B007    B008    B009    B010
//        C001    C002    C003    C004    C005    C006    C007    C008    C009    C010
//        D001    D002    D003    D004    D005    D006    D007    D008    D009    D010
//        E001    E002    E003    E004    E005    E006    E007    E008    E009    E010
//        F001    F002    F003    F004    F005    F006    F007    F008    F009    F010
//        G001    G002    G003    G004    G005    G006    G007    G008    G009    G010
//        H001    H002    H003    H004    H005    H006    H007    H008    H009    H010
//        I001    I002    I003    I004    I005    I006    I007    I008    I009    I010
//        J001    J002    J003    J004    J005    J006    J007    J008    J009    J010
//        ------------------------------------------------------------------------------------------

        bookSeat(rodgerNYC, 'B', 11);
//        --> No such seat: B011: Seat must be between A001 and J010
//        Sorry! Unable to reserve B11
        bookSeat(rodgerNYC, 'M', 1);
//        --> No such seat: M001: Seat must be between A001 and J010
//        Sorry! Unable to reserve M1
    }

    private static void bookSeat(Theatre theatre, char row, int seatNo) {

        String seat = theatre.reserveSeat(row, seatNo);
        if (seat != null) {
            System.out.println("Congratulations! Your reserved seat is " + seat);
            theatre.printSeatMap();
        } else {
            System.out.println("Sorry! Unable to reserve " +  row + seatNo);
        }
    }
}
