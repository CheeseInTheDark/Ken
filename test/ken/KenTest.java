package ken;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import org.junit.Test;

public class KenTest {

	@Test
	public void shouldExist() {
		Ken underTest = new Ken();
		
		assertThat(underTest, is(notNullValue(Ken.class)));
	}
	
	@Test
	public void shouldHaveStringCheese() {
		Ken underTest = new Ken();
		
		assertThat(underTest.hasStringCheese(), is(true));
	}
}
