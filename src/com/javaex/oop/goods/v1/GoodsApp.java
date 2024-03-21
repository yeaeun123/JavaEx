package com.javaex.oop.goods.v1;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Goods pc = new Goods();
		
		pc.name = "lg그램";
		pc.price = 900_000;
		
		
		Goods mug = new Goods();
		mug.name = "머그컵";
		mug.price = 2_000;
		
		
		//상품 정보 출력
		System.out.printf("%s,%,d원%n",
				pc.name,
				pc.price);
		
		System.out.printf("%s,%,d원%n",
				mug.name,
				mug.price);
	}

}
