package singleton;

public enum  TicketGenerator {
    INSTANCE;
//    private static final TicketGenerator INSTANCE = new TicketGenerator();
//
//
//    private TicketGenerator() {
//    }
//
//    public static TicketGenerator getInstance() {
//        return INSTANCE;
//    }

    private int ticketNumber = 0;
    public int generateNumber() {
        return ticketNumber++;
    }
}
