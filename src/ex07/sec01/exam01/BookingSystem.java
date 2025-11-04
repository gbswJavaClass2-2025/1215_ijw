package ex07.sec01.exam01;

public class BookingSystem {
    static void main() {
        System.out.println("----- 비행기 예매 시스템 실습 시작 -----");

        FlightTicket ticketA = new FlightTicket("KE001", "박민준", 300000);
        PremiumTicket ticketB = new PremiumTicket("OZ202", "최서연", 1500000, "비즈니스", 50000);

        System.out.println("\n------------------------------------\n");
        System.out.println("[좌석 예약]");
        ticketA.reserveSeat("45A");
        ticketA.reserveSeat("45B", true);
        System.out.println();
        ticketB.reserveSeat("01C");
        ticketB.reserveSeat("01D", false);
        ticketB.reserveSeat("02A", "채식 기내식 요청");
        System.out.println("\n------------------------------------\n");
        System.out.println("[예약 상세 정보]");
        System.out.println(ticketA.getReservationDetails());
        System.out.println(ticketB.getReservationDetails());
        System.out.println("\n----- 실습 종료 -----");
    }
}
