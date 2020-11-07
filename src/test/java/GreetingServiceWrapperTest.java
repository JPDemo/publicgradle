import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceWrapperTest {

    private final GreetingServiceWrapper classUnderTest = new GreetingServiceWrapper();


    @Test
    void greeting() {

        //given
        String name = "Bob";

        //when
        var result = classUnderTest.greeting(name).block();

        //then
        assertEquals("Hello Bob",result);

    }
}