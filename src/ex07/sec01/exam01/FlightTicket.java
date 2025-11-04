package ex07.sec01.exam01;

public class FlightTicket {
    String fnum;
    String passenger;
    String seat;
    int fare;

    public FlightTicket(String fnum, String passenger, int fare) {
        this.fnum = fnum;
        this.passenger = passenger;
        this.fare = fare;
        System.out.printf(">> FlightTicket 객체 생성: %s, 탑승객: %s\n", fnum, passenger);
    }

    public void reserveSeat(String seat) {
        this.seat = seat;
        System.out.printf("%s (일반): [예약] 일반 좌석 %s 이/가 배정되었습니다.\n", fnum, seat);
    }

    public void reserveSeat(String seat, boolean check) {
        this.seat = seat;
        String msg = check ? "(탑승 수속 완료)" : "(수속 미완료)";
        System.out.printf("%s (일반): [예약] 일반 좌석 %s 이/가 배정되었습니다. %s\n", fnum, seat, msg);
    }
    
    public String getReservationDetails() {
        return String.format("일반 항공권: 항공편: %s | 탑승객: %s | 좌석: %s | 기본 운임: %,d 원",
                fnum, passenger, seat, fare);
    }
}
