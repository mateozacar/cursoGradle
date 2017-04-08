package co.ceiba.service;

import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Person;
import co.ceiba.testdatabuilder.PersonTestDataBuilder;
import junit.framework.Assert;

public class NotifyPersonServiceTest {

	private NotifyPersonService notifyPersonService;
	private EmailService emailService;
	
	@Before
	public void setup(){
		emailService = new EmailService();
		notifyPersonService = new NotifyPersonService(emailService);
	}
	
	@Test
	public void notifyTest(){
		
		//Arrage
		Person person = new PersonTestDataBuilder().build();
		
		//Act
		String message = notifyPersonService.notify(person);
		
		//Assert
		Assert.assertNotNull(message);
	
	}
}
