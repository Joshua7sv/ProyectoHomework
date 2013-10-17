package com.creativa.dummy.data.generator;
//comentario de prueba
import com.softabar.lipsum.LoremIpsum4J;

public class StringDummyGenerator {
	/**
	 * Metodo para generar un dato aleatorio. 
	 * @param size
	 * @return
	 */
	public static String getWords(int size) {
		String s = null;
		LoremIpsum4J loremIpsum = new LoremIpsum4J();
		String[] paragraphs = null;
		loremIpsum.setStartWithLoremIpsum(false);
		paragraphs = loremIpsum.getWords(size);
		s = "";
		for (String string : paragraphs) {
			s += string;
		}
		// esto es un comentario de prueba
		return s.trim();
	}
}
