import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class SkillDemoTest {
    
    @Test 
    public void subtract(){

        assertEquals(2, SkillDemo.subtract(4, 2));
    }

}
