package lab_3c;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Tester {

	@Test
	public void testQuery() {
		Database mockDatabase = Mockito.mock(Database.class);
	    Mockito.when(mockDatabase.isAvailable()).thenReturn(true);
	    
	    Service testService = new Service(mockDatabase);
	    
	    assertTrue(testService.query("QUERY"));
	    Mockito.verify(mockDatabase).isAvailable();
	} 
	
	@Test
	public void testId() {
		Database mockDatabase = Mockito.mock(Database.class);
	    Mockito.when(mockDatabase.getUniqueId()).thenReturn(42);
		
		Service testService = new Service(mockDatabase);
	    
	    assertTrue(testService.getDatabaseID().equals("Using database with id: 42"));
	} 
}
