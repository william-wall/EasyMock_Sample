package ie.williamwall;

import static org.junit.Assert.assertEquals;

import org.easymock.EasyMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	
	private HelloWorld helloWorld;
	 
	@Before
	public void setUp() throws Exception {
		helloWorld = EasyMock.createMock(HelloWorld.class);
	}
 
	@After
	public void tearDown() throws Exception {
		helloWorld = null;
	}
 
	@Test
	public void testPrintHelloWorld() {
 
		EasyMock.expect(helloWorld.printHelloWorld()).andReturn("Hello World!");
		
		EasyMock.replay(helloWorld);
 
		HelloWorldUser helloWorldUser = new HelloWorldUser();
		
		assertEquals("Hello World!", helloWorldUser.getHelloWorld(helloWorld));
		
		EasyMock.verify(helloWorld);
	}

}
