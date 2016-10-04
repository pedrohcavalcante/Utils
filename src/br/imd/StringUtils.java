/**
 * Classe que recebe string e retorna boolean
 * @author Pedro Henrique
 * @version 1.0
 */
package br.imd;

public class StringUtils {
	
	public static boolean isEmpty(String s) {

		if (s == null) {
			return true;
		}

		return s.trim().length() == 0;
	}
}
