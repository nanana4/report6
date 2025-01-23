package jp.ac.uryukyu.ie.e245724;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcchiMuiteHoiTest {
    @Test
    void testGetComputerDirection() {
        AcchiMuiteHoi acchiMuiteHoi = new AcchiMuiteHoi();
        for (int i = 0; i < 100; i++) {
            int direction = acchiMuiteHoi.getComputerDirection();
            // コンピュータの選択が0〜3の範囲内であることを確認
            assertTrue(direction >= 0 && direction < 4, 
                "Computer direction should be between 0 and 3, but got: " + direction);
        }
    }

    @Test
    void testDirectionToString() {
        AcchiMuiteHoi acchiMuiteHoi = new AcchiMuiteHoi();
        assertEquals("上", acchiMuiteHoi.directionToString(0));
        assertEquals("下", acchiMuiteHoi.directionToString(1));
        assertEquals("左", acchiMuiteHoi.directionToString(2));
        assertEquals("右", acchiMuiteHoi.directionToString(3));
    }

    @Test
    void testDirectionToStringInvalidInput() {
        AcchiMuiteHoi acchiMuiteHoi = new AcchiMuiteHoi();
        try {
            acchiMuiteHoi.directionToString(5);
            fail("Exception was expected for invalid input, but no exception was thrown.");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exception
        }
    }

    @Test
    void testIsMatch() {
        AcchiMuiteHoi acchiMuiteHoi = new AcchiMuiteHoi();
        // プレイヤーとコンピュータの選択が一致する場合
        assertTrue(acchiMuiteHoi.isMatch(0, 0));
        assertTrue(acchiMuiteHoi.isMatch(1, 1));
        assertTrue(acchiMuiteHoi.isMatch(2, 2));
        assertTrue(acchiMuiteHoi.isMatch(3, 3));

        // プレイヤーとコンピュータの選択が一致しない場合
        assertFalse(acchiMuiteHoi.isMatch(0, 1));
        assertFalse(acchiMuiteHoi.isMatch(1, 2));
        assertFalse(acchiMuiteHoi.isMatch(2, 3));
        assertFalse(acchiMuiteHoi.isMatch(3, 0));
    }
}
