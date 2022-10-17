import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TriangleClassifierTest {

    @Test
    void testClassifyTriangle0() {
        String expected = "Tam giác đều";
        String result = TriangleClassifier.classifyTriangle(2, 2, 2);

        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle1() {
        String expected = "Tam giác cân";
        String result = TriangleClassifier.classifyTriangle(2, 2, 3);

        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle2() {
        String expected = "Tam giác thường";
        String result = TriangleClassifier.classifyTriangle(3, 4, 5);

        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle3() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(8, 2, 3);

        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle4() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(-1, 2, 1);

        assertEquals(expected, result);
    }

    @Test
    void testClassifyTriangle5() {
        String expected = "Không phải là tam giác";
        String result = TriangleClassifier.classifyTriangle(0, 1, 1);

        assertEquals(expected, result);
    }
}