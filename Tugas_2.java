package com.tutorial_1;

public class Tugas_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Leftwww = stringABC ("abc" , 5, "left");
		System.out.println(Leftwww);
		
		String Rightwww = stringABC ("abc" , 5, "right");
		System.out.println(Rightwww);

	}
	
	
	
	private static String stringABC(String pattern, int x , String side){
		StringBuilder sb = new StringBuilder();
		if (side.equals("left")){
			for (int i = 0; i < 2; i++){
				sb.append(".");
			}
			sb.append(pattern);
		} else if (side.equals("right")){
			sb.append(pattern);
			for (int i = 0; i < 2; i++){
				sb.append("*");
			}
		}
		
		
		return sb.toString();
	}

}
