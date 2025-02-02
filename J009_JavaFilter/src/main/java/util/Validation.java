package util;

import java.util.regex.Pattern;

public class Validation {

	private static final String nameRegx = "^[A-Za-z]+$";
	private static final String emailRegx = "^[a-zA-z0-9_.@]+@[a-z]+\\.[a-z]{3,4}$";
	private static final String passRegx = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@.#$!%*?&])[A-Za-z\\d@.#$!%*?&]{8,15}$";

	public static boolean nameValidation(String name) {
		return Pattern.compile(nameRegx).matcher(name).matches();

	}

	public static boolean emailValidation(String email) {
		return Pattern.compile(emailRegx).matcher(email).matches();

	}

	public static boolean passValidation(String pass) {
		return Pattern.compile(passRegx).matcher(pass).matches();

	}
	 public static void main(String[] args) {
		boolean b=passValidation("Kiran@1727");
		System.out.println(b);
	}
}


