package business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CompanyMain {
	public static void main(String[] args) {
		ArrayList<CompanyBasics> CB = new ArrayList<>();
		int selectNum = 0;
		System.out.println("<사원 정보 관리 프로그램>");
		while(true) {
			System.out.println("1. 사원정보 입력");
			System.out.println("2. 사원정보 개별 조회");
			System.out.println("3. 프로그램 종료");
			System.out.print(">>> ");
			try {
				selectNum = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
			}
			
			if(selectNum ==1) {
				System.out.print("등록할 직원의 이름을 입력하세요 : ");
				String name = new Scanner(System.in).nextLine();
				System.out.print("등록할 직원의 부서를 입력하세요 : ");
				String part = new Scanner(System.in).nextLine();
				System.out.print("등록할 직원의 주소를 입력하세요 : ");
				String address = new Scanner(System.in).nextLine();
				System.out.print("등록할 직원의 생일을 입력하세요 : ");
				String birthday = new Scanner(System.in).nextLine();
				
				CompanyBasics tempCB = new CompanyBasics(name, part, address, birthday);
				CB.add(tempCB);
				
			} else if(selectNum == 2) {
				System.out.print("찾으려는 직원의 이름을 입력하세요 : ");
				String name = new Scanner(System.in).nextLine();
				
				for(CompanyBasics cb : CB) {
					if(cb.getName().equals(name)) {
						System.out.println("이름 : " + cb.getName());
						System.out.println("부서 : " + cb.getPart());
						System.out.println("주소 : " + cb.getAddress());
						System.out.println("생일 : " + cb.getBirthday());
					}
				}
				
			} else if(selectNum ==3) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}
	
}
