package org.example.lv1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // `Scanner`를 사용하여 여러 햄버거 메뉴를 출력합니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. " + "ShackBurger  " + "| W 6.9 |" + " 토마토, 양상추, 쉑소스가 토핑된 치즈버거" );
        System.out.println("2. " + "SmokeShack   " + "| W 8.9 |" + " 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거" );
        System.out.println("3. " + "Cheeseburger " + "| W 6.9 |" + " 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거" );
        System.out.println("4. " + "Hamburger    " + "| W 5.4 |" + " 비프패티를 기반으로 야채가 들어간 기본버거" );
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