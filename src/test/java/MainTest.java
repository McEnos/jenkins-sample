import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMain {

    @Test
    public void testInputIsEven(){
        assertTrue(Main.checkIfInputIsAnEvenNumber(22));
    }
}