package com.javaex.oop.goods.v3;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Goods camera = new Goods();
		Goods camera = new Goods("nikon", 400_000);
		
//		camera.setName("nikon"); 
//		camera.setPrice(400_000);
		
//		Goods pc = new Goods();
		Goods pc = new Goods("lg그램", 900_000);
//		pc.setName("lg그램"); 
//		pc.setPrice(900_000);
		
		
//		Goods mug = new Goods();
		Goods mug = new Goods("머그컵",2_000);
//		mug.setName("머그컵");
//		mug.setPrice(2_000);
		
		
		//상품 정보 출력(getter활용)
//		System.out.printf("%s,%,d원%n",
//				camera.getName(),
//				camera.getPrice());
//		
//		System.out.printf("%s,%,d원%n",
//				pc.getName(),
//				pc.getPrice());
//		
//		System.out.printf("%s,%,d원%n",
//				mug.getName(),
//				mug.getPrice());
		
		//상품 정보 출력( 메서드 활용)
		camera.showInfo();
		pc.showInfo();
		mug.showInfo();
	}

}
