package pe.academy.junit.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.academy.junit.service.TaxService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxServiceTest {
	private TaxService service = new TaxService();
	
	@Test
	public void bracketLow() {
		final String taxBracket = service.getBracket(500);
		assertThat(taxBracket).isEqualTo("LOW");
	}
	
	@Test
	public void bracketMediun() {
		final String taxBracket = service.getBracket(1250);
		assertThat(taxBracket).isEqualTo("MEDIUM");
	}
	
	@Test
	public void bracketHigh() {
		final String taxBracket = service.getBracket(7500);
		assertThat(taxBracket).isEqualTo("HIGH");
	}
	
	@Test
	public void AllBrackets() {
		final List<String> allBrackets = service.allBrackets();
		assertThat(allBrackets).isNotEmpty();
		assertThat(allBrackets).contains("LOW","MEDIUM","HIGH");
	}
}
