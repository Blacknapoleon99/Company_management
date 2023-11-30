import org.example.Developer;
import org.example.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTests {

    @Test
    public void testGetSound() {
        var developer = new Developer("Kevin", "Java");


        var expected = "Woop woop!";
        var actual = developer.getSound();

        assertEquals(expected, actual);
    }

}
