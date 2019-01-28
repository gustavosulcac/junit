package pe.codemy.junit;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.codemy.junit.service.TaxService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaxServiceTest {
	private TaxService service = new TaxService();
	
	@Test
	public void brackets() {
		final String taxBracket = service.getBracket(500);
		assertThat(taxBracket).isEqualTo("LOW");
	}
	
	@Test
	public void AllBrackets() {
		final List<String> allBrackets = service.allBrackets();
		assertThat(allBrackets).isNotEmpty();
		assertThat(allBrackets).contains("LOW","MEDIUM","HIGH");
	}
}
