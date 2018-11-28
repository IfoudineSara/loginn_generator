package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {
    PasswordGeneration pwrd;
    @Before
    public void setUp() throws Exception {
        pwrd = new PasswordGeneration();
    }

    @Test
    public void getRandomPassword() {
      assertTrue(pwrd.getRandomPassword().length()==8);
    }
}