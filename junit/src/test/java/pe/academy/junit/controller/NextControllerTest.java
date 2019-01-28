package pe.academy.junit.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import pe.academy.junit.controller.NextController;

@RunWith(SpringRunner.class)
public class NextControllerTest {
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
 
        mockMvc = MockMvcBuilders.standaloneSetup(new NextController())
                                 .setViewResolvers(viewResolver)
                                 .build();
	}
	
	@Test
	public void testIndex() throws Exception {
		this.mockMvc.perform(get("/next"))
			.andExpect(status().isOk())
			.andExpect(view().name("next"))
			.andDo(print());
	}
}
