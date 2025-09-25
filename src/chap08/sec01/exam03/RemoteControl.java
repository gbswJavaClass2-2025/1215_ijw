package chap08.sec01.exam03;

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    // 추상 메소드(컴파일러가 알아서 abstract 붙여줌)

    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
}
