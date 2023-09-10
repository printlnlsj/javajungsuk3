package ch7;

/**
 * 예제 7-22
 */
class Product1 {
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    Product1(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
    }

    Product1() {} // 기본 생성자
}

class Tv3 extends Product1 {
    Tv3() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); // Tv의 가격을 100만원으로 한다.
    }
    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() { return "Tv"; }
}

class Computer1 extends Product1 {
    Computer1() { super(200); }
    public String toString() { return "Computer"; }
}

class Audio extends Product1 {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer1 { // 고객, 물건을 사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스점수
    Product1[] item = new Product1[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; // Product배열에 사용될 카운터

    void buy(Product1 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스점수를 추가한다.
        item[i++] = p; // 제품을 Product1[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summery() { // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0; // 구입한 물품의 가격합계
        String itemList = ""; // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.length; i++) {
            if (item[i] == null) {
                break;
            }
            sum += item[i].price;
//            itemList += item[i] + ", "; // 구입한 제품목록의 마지막에 출력되는 콤마(,)가 눈에 거슬린다면, 밑에 코드로 변경
            itemList += (i==0) ? "" + item[i] : ", " + item[i];
        }

        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer1 b = new Buyer1();

        b.buy(new Tv3());
        b.buy(new Computer1());
        b.buy(new Audio());
        b.summery();
    }
}
