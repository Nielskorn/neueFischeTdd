import org.junit.jupiter.api.Test;
import org.neuefische.Fizzbuzz;

public class FizzbuzzTest {
    @Test
    void testFizbuss() {
        String expected = "1";
        int num=1;
        assert expected.equals(Fizzbuzz.fizbus(num));
    }
    @Test
    void expectFizz__whenGiven_3(){
    //expecet
        String expectResult = "Fizz";
        //given
        int num=3;
        assert expectResult.equals(Fizzbuzz.fizbus(num));

    }
    @Test void expectBuzz__whenGiven_5(){
        String expectResult = "Buzz";
        int num=5;
        assert expectResult.equals(Fizzbuzz.fizbus(num));
    }
    @Test void expectFizzbuzz__whenGiven_15(){
        String expectResult = "FizzBuzz";
        int num=15;
        assert expectResult.equals(Fizzbuzz.fizbus(num));
    }
}
