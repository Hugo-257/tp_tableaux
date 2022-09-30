package judges;

import judgestests.MarksTests;

public class Executable {
  public static void main(String[] args) {

    try {
      /*
       * Marks m1=new Marks(5, 5, 20);
       * m1.setMark(0, 0, 6);
       * m1.setMark(1, 0, 15);
       * m1.setMark(2, 0, 7);
       * m1.setMark(3, 0, 15);
       * m1.setMark(4, 0, 4);
       * 
       * System.out.println(m1.average(0));
       */
      boolean ok = true;
      MarksTests marksTester = new MarksTests();
      ok = ok && marksTester.testGetMarkSetMark();
      ok = ok && marksTester.testAverage();
      ok = ok && marksTester.testGlobalAverage();
      System.out.println(ok ? "All tests OK" : "At least one test KO");
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println(e.toString());
    }
  }
}
