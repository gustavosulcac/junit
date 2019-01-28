package pe.academy.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pe.academy.junit.JunitApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitApplicationTests {

	@Test
	public void contextLoads() {
		JunitApplication.main(new String[] {});
	}

}

