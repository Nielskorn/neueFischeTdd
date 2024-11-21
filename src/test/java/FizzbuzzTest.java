import org.junit.jupiter.api.Test;

public class FizzbuzzTest {
    @Test
    void expectFizz__whenGiven_3(){
    //expecet
        String expectResult = "fizz";
        //given
        int num=3;
        assert expectResult.equals(Fizzbuzz.fizzing(num));

    }
}
