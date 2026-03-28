package com.practise.mockito;



import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SomeBeanServiceIMPLTest {

	@Mock
	private DateService service;
	
	@InjectMocks
	private SomeBeanServiceIMPL somebean;
	
	@Test
	public void threeMemberDataReturn() {
		when(service.retrieveData()).thenReturn(new int[] {1,2,3});
		assertEquals(3, somebean.findGreatestValueFromArray());
	}
	
	@Test
	public void OneMemberDataReturn() {
		when(service.retrieveData()).thenReturn(new int[] {35});
		assertEquals(35, somebean.findGreatestValueFromArray());
	}
}
