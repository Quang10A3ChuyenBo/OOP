import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ExpressionTest {
    @Test
    void testEvaluate(){
        Expression p1 = new Numeral(1);
        Expression p2 = new Numeral(2);
        assertEquals(p1.evaluate(),1);
        assertEquals(p2.evaluate(),1);
    }
}