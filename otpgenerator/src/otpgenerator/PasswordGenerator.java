package otpgenerator;

import java.util.Random;

public class PasswordGenerator {
	
	static char[] geekPassword(int len){
		System.out.println("Generating password...");
		System.out.println("The password generated is..");
		String values = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" +
						"0123456789" + "!#$%^&*()_+";
		Random rndm = new Random();
		char[] password = new char[len];
		for (int i = 0; i<len; i++){
			password[i] = values.charAt(rndm.nextInt(values.length()));
		}
		 return password;
	}
	
	public static void main(String...ar){
		int length = 10;
		System.out.println(otpGenerator(length));
	}
	
	
	
	static char[] otpGenerator(int len){
		System.out.println("The OTP generated is...");
		String values = "0123456789";
		Random rndm = new Random();
		char [] password = new char[len];
		for (int i = 0; i < len; i++){
			password[i] = values.charAt(rndm.nextInt(values.length()));
		}
		return password;
	}
}
