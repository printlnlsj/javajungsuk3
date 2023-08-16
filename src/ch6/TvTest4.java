package ch6;

public class TvTest4 {
    public static void main(String[] args) {
        Tv4[] tvArr = new Tv4[3]; // 길이가 3인 Tv객체 배열
        
        // Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
        for(int i=0; i < tvArr.length; i++) {
            tvArr[i] = new Tv4();
            tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i+10을 저장
        }
        
        for(int i=0; i < tvArr.length; i++) {
            tvArr[i].channelUp(); // tvArr[i]의 메서드 호출. 채널이 1 증가
            System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
        }
    } // main 끝
}

class Tv4 {
    // Tv의 속성(멤버변수);
    String color; // 색상
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    // Tv의 기능(메서드)
    void power() {
        power = !power;
    } // Tv를 켜거나 끄는 기능을 하는 메서드
    void channelUp() {
        ++channel;
    } // Tv의 채널을 높이는 기능을 하는 메서드
    void channelDown() {
        --channel;
    } // Tv의 채널을 낮추는 기능을 하는 메서드
}