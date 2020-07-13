import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest extends HelloWorld
	{

	@Test
	public void test()
		{
		fail("Not yet implemented");
		}

	@Test
	public void TrueResponse()
		{
		assertEquals("Hello World!");
		}
	
	@Test
	public void CloseResponse()
		{
		assertEquals("Say it more forcefully, please!", false, "Hello World");
		}

	}
