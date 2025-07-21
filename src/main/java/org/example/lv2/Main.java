package org.example.lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //`main` 함수에서 `MenuItem` 클래스를 활용하여 햄버거 메뉴를 출력합니다.
        //`MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅합니다.
        //키워드: `new`
        MenuItem shackBurger = new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        MenuItem smokeBurger = new MenuItem("SmokeShack",  8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        MenuItem cheeseBurger = new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        MenuItem hamburger = new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");

        // `Scanner`를 사용하여 여러 햄버거 메뉴를 출력합니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. " + shackBurger.getName() + "| W " + shackBurger.getPrice() + " | " + shackBurger.getDescription());
        System.out.println("2. " + smokeBurger.getName() + "| W " + smokeBurger.getPrice() + " | " + smokeBurger.getDescription());
        System.out.println("3. " + cheeseBurger.getName() + "| W " + cheeseBurger.getPrice() + " | " + cheeseBurger.getDescription());
        System.out.println("4. " + hamburger.getName() + "| W " + hamburger.getPrice() + " | " + hamburger.getDescription());
        System.out.println("0. " + "종료      " + "| 종료");

        System.out.println("메뉴 번호를 입력하세요: " );

        int choice = scanner.nextInt();

        //제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
        //반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료합니다
        switch (choice) {
            case 1:
                System.out.println("ShackBurger  " + "| W 6.9 |" + " 토마토, 양상추, 쉑소스가 토핑된 치즈버거" );
                break;
            case 2:
                System.out.println("SmokeShack   " + "| W 8.9 |" + " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" );
                break;
            case 3:
                System.out.println("Cheeseburger " + "| W 6.9 |" + " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" );
                break;
            case 4:
                System.out.println("Hamburger    " + "| W 5.4 |" + " 비프패티를 기반으로 야채가 들어간 기본버거" );
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }
}
