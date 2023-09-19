import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestScholar {
    Scholarship u = new Scholarship();

    @Test
    public void test1() {
        assertEquals("Input khong hop le", u.calScholar(-1, -0.1));
    }

    @Test
    public void test2() {
        assertEquals("Input khong hop le", u.calScholar(-1, 1.5));
    }

    @Test
    public void test3() {
        assertEquals("Input khong hop le", u.calScholar(-1, 3.0));
    }

    @Test
    public void test4() {
        assertEquals("Input khong hop le", u.calScholar(-1, 3.4));
    }

    @Test
    public void test5() {
        assertEquals("Input khong hop le", u.calScholar(-1, 3.8));
    }

    @Test
    public void test6() {
        assertEquals("Input khong hop le", u.calScholar(-1, 4.1));
    }

    @Test
    public void test7() {
        assertEquals("Input khong hop le", u.calScholar(0, -0.1));
    }

    @Test
    public void test8() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(0, 1.5));
    }

    @Test
    public void test9() {
        assertEquals("Hoc bong loai Kha", u.calScholar(0, 3.0));
    }

    @Test
    public void test10() {
        assertEquals("Hoc bong loai Gioi", u.calScholar(0, 3.4));
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
        assertEquals("Input khong hop le", u.calScholar(15, -0.1));
    }

    @Test
    public void test14() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(15, 1.5));
    }

    @Test
    public void test15() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(15, 3.0));
    }

    @Test
    public void test16() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(15, 3.4));
    }

    @Test
    public void test17() {
        assertEquals("Khong duoc xet hoc bong", u.calScholar(15, 3.8));
    }

    @Test
    public void test18() {
        assertEquals("Input khong hop le", u.calScholar(15, 4.1));
    }

    @Test
    public void test19() {
        assertEquals("Input khong hop le", u.calScholar(31, -0.1));
    }

    @Test
    public void test20() {
        assertEquals("Input khong hop le", u.calScholar(31, 1.5));
    }

    @Test
    public void test21() {
        assertEquals("Input khong hop le", u.calScholar(31, 3.0));
    }

    @Test
    public void test22() {
        assertEquals("Input khong hop le", u.calScholar(31, 3.4));
    }

    @Test
    public void test23() {
        assertEquals("Input khong hop le", u.calScholar(31, 3.8));
    }

    @Test
    public void test24() {
        assertEquals("Input khong hop le", u.calScholar(31, 4.1));
    }
    
} 