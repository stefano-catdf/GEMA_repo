package iceTest;

import org.testng.annotations.Test;

import com.consol.citrus.annotations.CitrusXmlTest;
import com.consol.citrus.testng.AbstractTestNGCitrusTest;

/**
 * This is a sample Citrus integration test using SOAP client and server.
 * @author Citrus
 */
@Test
public class iceStub_Test extends AbstractTestNGCitrusTest {

    @CitrusXmlTest(name = "iceStub_Test")
    public void ice_StubTest() {}
}