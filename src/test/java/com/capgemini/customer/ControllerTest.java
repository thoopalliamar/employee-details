package com.capgemini.customer;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.capgemini.customer.controller.CustomerController;
import com.capgemini.customer.domain.Customer;
import com.capgemini.customer.service.CustomerService;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class ControllerTest {

	private MockMvc customerMockMvc;

	@MockBean
	private CustomerService customerService;

	@InjectMocks
	private CustomerController customerController;

	@Before
	public void setUp() throws Exception {

		MockitoAnnotations.initMocks(this);
		customerMockMvc = MockMvcBuilders.standaloneSetup(customerController).build();
	}

	@Test
	public void testViewEmp() throws Exception {

		Customer customer = new Customer(152943L, 109L, "fresher", "thoopalli_amarnath", "visa", "12/22", "private",
				"direct", "direct", "helo", 2);

//		when(customerService.saveEmp(customer)).thenReturn(customer);
		
		customerMockMvc.perform(get("/v1/view/152943")).andExpect(status().isFound());
		verify(customerService, times(1)).viewEmp(152943L);
		verifyNoMoreInteractions(customerService);

	}

}