import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class DictionaryTest {


	@Test
	public void notnull() {
		String input = "homework";
		Assert.assertTrue(input != null && !input.isEmpty());
	}

	@Test
	public void allchar() {
		String input = "homework";
		for (int i = 0; i < input.length(); i++) {
			Assert.assertTrue(Character.isLetter(input.charAt(i)));
		}
	}
	
	@Test
	public void output() {
		String input = "homework";
		Dictionary d1 = Dictionary.get();
		List<String> output = d1.matchWord(input);
		Assert.assertTrue(!output.isEmpty() && output != null);

	}

	@Test
	public void isEnglishword() {
		Dictionary d1 = Dictionary.get();
		Assert.assertTrue(d1.isEnglishWord("working", "work"));
		Assert.assertTrue(d1.isEnglishWord("working", "row"));
		Assert.assertTrue(d1.isEnglishWord("working", "ring"));
		Assert.assertTrue(d1.isEnglishWord("working", "king"));
	}
	

	@Test
	public void wordsearch() {
		String input = "homework";
		Dictionary d1 = Dictionary.get();
		List<String> output = d1.matchWord(input);
		Assert.assertEquals(true, output.contains("home"));
		Assert.assertEquals(203, output.size());
	}

}