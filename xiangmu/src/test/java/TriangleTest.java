import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by DuanJiangtao on 2018/5/2.
 */
public class TriangleTest {
    Triangle t=new Triangle(2,2,3);
    Triangle t1=new Triangle(2,2,2);
    Triangle t2=new Triangle(10,5,4);
    Triangle t3=new Triangle(10,5,6);

    @Test
    public void testIsTriangle() throws Exception {
          assertEquals(t.isTriangle(t),true);
    }
    @Test
    public void testGetType() throws Exception {

        assertEquals(t.getType(t),"Isosceles");
        assertEquals(t1.getType(t1),"Regular");
        assertEquals(t2.getType(t2),"Illegal");
        assertEquals(t3.getType(t3),"Scalene");
    }
    @Test
    public void testDiffOfBorders() throws Exception {
        assertEquals(t.diffOfBorders(2, 3), 1);
    }
}