package projms.library.publisher.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import projms.library.publisher.Publisher;

public class PublisherTest {
	Publisher cut;
	@Before
	public void setUp() throws Exception {
		cut = new Publisher("tcp://localhost:61616", null);
	}

	@After
	public void tearDown() throws Exception {
		cut.close();
		cut = null;
	}

//	@Test
//	public void testPublisher() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testClose() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSendMessage() {
		cut.sendMessage("test", "testType", "testTopic");
	}

}
