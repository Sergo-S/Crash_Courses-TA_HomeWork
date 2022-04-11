package Task6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTask6 {

    Furniture testObject1 = new Furniture("Object",2004,Color.GREEN);
    Furniture testObject2 = new Furniture();

    @Test
    public void testGetCode1(){
        Color expected = Color.GREEN;
        Color actual = testObject1.getObjcolor();
        Assert.assertEquals(expected.getCode(), actual.getCode());
    }

    @Test
    public void testGetCode2(){
        Color expected = Color.UNDEFINED;
        Color actual = testObject2.getObjcolor();
        Assert.assertEquals(expected.getCode(), actual.getCode());
    }

    @Test
    public void testCalculateAge1(){
        String expected = "(Age = 18)";
        String actual = testObject1.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateAge2(){
        String expected = "(Age can't be calculated)";
        String actual = testObject2.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPrint1(){
        String expected = "Name: Object"+
                "\nYear of manufacture: 2004 (Age = 18)"+
                "\nColor: GREEN"+" (Code: #00FF00"+")\n";;
        String actual = testObject1.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPrint2(){
        String expected = "Name: undefined"+
                "\nYear of manufacture: undefined (Age can't be calculated)"+
                "\nColor: UNDEFINED"+" (Code: ??????"+")\n";
        String actual = testObject2.toString();
        Assert.assertEquals(expected, actual);
    }

}
