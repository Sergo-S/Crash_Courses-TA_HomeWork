package task9;

public class NumberReader {
    static void readNumber(int start, int end,double x) throws Exception {
        if (end<=x||x<=start) {
            throw new Exception("Exception: "+x+" is out of the range"+"["+start+","+end+"]");
        }
        System.out.println(x+" is in the range"+"["+start+","+end+"]");
    }
}
