import org.example.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class EmployeeTests {

    @Test
    public void testGetSound() {
        var employee = new Employee("Kevin");


        var expected = "FAN!";
        var actual = employee.getSound();

        assertEquals(expected, actual);
    }
}
