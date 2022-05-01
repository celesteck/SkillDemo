import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class SkillDemoTest {
    
    @Test 
    public void subtract(){

        assertEquals(3, SkillDemo.subtract(4, 2));
    }

}
