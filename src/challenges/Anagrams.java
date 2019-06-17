package challenges;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {

		if (checkAnagrams("alert", "later") == true) {
			System.out.println("alert" + " and " + "later" + " are anagrams");
		} else {
			System.out.println("alert" + " and " + "later" + " are not anagrams");
		}
		if (checkAnagrams("art", "rat") == true) {
			System.out.println("art" + " and " + "rat" + " are anagrams");
		} else {
			System.out.println("art" + " and " + "rat" + " are not anagrams");
		}
		if (checkAnagrams("ark", "rat") == true) {
			System.out.println("ark" + " and " + "rat" + " are anagrams");
		} else {
			System.out.println("ark" + " and " + "rat" + " are not anagrams");
		}
		if (checkAnagrams("fexd", "fex") == true) {
			System.out.println("fexd" + " and " + "fex" + " are anagrams");
		} else {
			System.out.println("fexd" + " and " + "fex" + " are not anagrams");
		}

		checkAnagrams("fexd", "fex");

	}

	public static boolean checkAnagrams(String anagram1, String anagram2) {

		int anagram1Length = anagram1.length();
		int anagram2Length = anagram2.length();
		char[] anagram1array = anagram1.toCharArray();
		char[] anagram2array = anagram2.toCharArray();
		Arrays.sort(anagram1array);
		Arrays.sort(anagram2array);

		if (anagram1Length != anagram2Length) {

			return false;

		}
		for (int i = 0; i < anagram1Length; i++) {
			if (anagram1array[i] != anagram2array[i]) {
				return false;

			}

		}
		return true;

	}
}