package ex07.sec01.exam01;

public class PremiumTicket extends FlightTicket {
    private String tclass;     // "비즈니스" 등
    private int fee;

    public PremiumTicket(String fnum, String passenger, int fare, String tclass, int fee) {
        super(fnum, passenger, fare);
        this.tclass = tclass;
        this.fee = fee;
    }

    public void reserveSeat(String seat, String mealRequest) {
        this.seat = seat;
        System.out.printf("%s (프리미엄): [예약] 비즈니스 좌석 %s 이/가 배정되었습니다. (요청: %s)\n",
                fnum, seat, mealRequest);
    }

    @Override
    public String getReservationDetails() {
        return String.format(
                "프리미엄 항공권: 항공편: %s | 탑승객: %s | 좌석: %s | 기본 운임: %,d 원 | 클래스: **%s** | 라운지 이용료: %,d 원",
                fnum, passenger, seat, fare, tclass, fee
        );
    }
}
