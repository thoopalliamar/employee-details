package com.capgemini.customer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.customer.domain.Customer;
import com.capgemini.customer.repository.CustomerRepository;
import com.capgemini.customer.service.CustomerServiceImpl;

@RunWith(SpringRunner.class)
public class ServiceTest {
	
	@Mock
	private   CustomerRepository customerRepository;
	
	@InjectMocks
	private CustomerServiceImpl customerService;
	
	@Before
	public void setupMock() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testMockCreation() {
		// assertNotNull(movie);
		assertNotNull("jpaRepository creation fails: use @injectMocks on movieServicempl", customerRepository);
	}
	
	@Test
	public void testSaveCustomer() throws Exception{
		Customer customer =new Customer ( 152943L, 109L,  "fresher",  "thoopalli_amarnath",  "visa", "12/22",  "private",  "direct",  "direct",  "helo", 2);
		
		
		when(customerRepository.save(customer)).thenReturn(customer);
		
		Customer customerAtService = customerService.saveEmp(customer);
		
		assertEquals("saving movie failed , the call to movieDAOImpl is returning false ,check this method", customer,
				customerAtService);

	}
	

}