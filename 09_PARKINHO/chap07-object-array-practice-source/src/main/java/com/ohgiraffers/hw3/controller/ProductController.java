package com.ohgiraffers.hw3.controller;

import com.ohgiraffers.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {
    // 초기화 블럭을 이용하여 10개의 Product 배열 크기 할당
    ProductDTO[] pro = new ProductDTO[10];
    int count = 0;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        // 메뉴 출력 --> do~while 문으로 반복 실행 처리함
        do {
            System.out.print("""
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    """);
        } while (true);
    }

    public void productInput() {
        // 키보드로 도서 정보를 입력 받아 객체 생성
        System.out.print("제품번호 : ");
        int pid = sc.nextInt();
        System.out.print("제품명 : ");
        String pName = sc.next();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pid, pName, price, tax);
        // -> Product 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가
        count++;

        // 현재 카운트 인덱스에 생성한 주소 저장


    }

    public void productPrint() {
        // 현재까지 기록된 도서 정보 모두 출력

    }

}
