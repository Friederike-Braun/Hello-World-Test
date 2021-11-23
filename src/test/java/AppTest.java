import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void exampleTest_AlwaysSucceeds(){

        // given
        boolean input = true;

        // when
        // then
        assertTrue(input, "This test is an example and should always pass");
    }

    @Test
    public void exampleTest_AlwaysFails(){

        // given
        boolean input = false;

        // when
        // then
        assertTrue(input, "This test is an example and should always fail");
    }

}