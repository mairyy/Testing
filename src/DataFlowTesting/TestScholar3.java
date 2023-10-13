package DataFlowTesting;

import org.junit.Test;
import main.Scholarship;

import static org.junit.Assert.assertEquals;
public class TestScholar3 {
    Scholarship u = new Scholarship();

    @Test
    public void test1() {
        assertEquals("Input khong hop le", u.calScholar(-1, 0));
    }

    @Test
    public void test2() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(2, 0));
    }

    @Test
    public void test3() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(3, 0));
    }

    @Test
    public void test4() {
        assertEquals("Input khong hop le", u.calScholar(0, -0.1));
    }

    @Test
    public void test5() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(0, 2.0));
    }

    @Test
    public void test6() {
        assertEquals("Hoc bong loai Kha", u.calScholar(0, 3.0));
    }

    @Test
    public void test7() {
        assertEquals("Hoc bong loai Kha", u.calScholar(0, 2.8));
    }

    @Test
    public void test8() {
        assertEquals("Hoc bong loai Gioi", u.calScholar(0, 3.3));
    }

    @Test
    public void test9() {
        assertEquals("Hoc bong loai Gioi", u.calScholar(0, 3.5));
    }

    @Test
    public void test10() {
        assertEquals("Hoc bong loai Xuat sac", u.calScholar(0, 3.7));
    }

    @Test
    public void test11() {
        assertEquals("Hoc bong loai Xuat sac", u.calScholar(0, 3.8));
    }

    @Test
    public void test12() {
        assertEquals("Input khong hop le", u.calScholar(0, 4.1));
    }

    @Test
    public void test13() {
        assertEquals("Input khong hop le", u.calScholar(0, -0.2));
    }

    @Test
    public void test14() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(0, 2.1));
    }
}
