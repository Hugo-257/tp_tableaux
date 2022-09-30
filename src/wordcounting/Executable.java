package wordcounting;
import wordcountingtests.WordCounterTests;

public class Executable {
    public static void main(String[] args) {
        boolean ok = true;
        WordCounterTests tester=new WordCounterTests();
        ok=ok && tester.testWordsCaseSensitive();
         ok=ok && tester.testWordsCaseInsensitive();
        ok=ok && tester.testCountCaseSensitive();
        ok=ok && tester.testCountCaseInsensitive(); 
        System.out.println(ok ? "All tests OK" : "At least one test KO");
       
    }
}
