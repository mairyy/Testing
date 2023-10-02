package ControlFlowTesting;

import org.junit.Test;
import main.Scholarship;

import static org.junit.Assert.assertEquals;

public class TestScholar2 {
    Scholarship u = new Scholarship();

    @Test
    public void test1() {
        assertEquals("Input khong hop le", u.calScholar(-1, 0));
    }

    @Test
    public void test2() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(1, 0));
    }

    @Test
    public void test3() {
        assertEquals("Input khong hop le", u.calScholar(0, -0.1));
    }

    @Test
    public void test4() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(0, 2.0));
    }

    @Test
    public void test5() {
        assertEquals("Hoc bong loai Kha", u.calScholar(0, 3.0));
    }

    @Test
    public void test6() {
        assertEquals("Hoc bong loai Gioi", u.calScholar(0, 3.5));
    }

    @Test
    public void test7() {
        assertEquals("Hoc bong loai Xuat sac", u.calScholar(0, 3.7));
    }

    @Test
    public void test8() {
        assertEquals("Input khong hop le", u.calScholar(0, 4.1));
    }
}
