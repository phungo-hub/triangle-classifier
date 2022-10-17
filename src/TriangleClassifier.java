public class TriangleClassifier {
    public static String classifyTriangle(double sideA, double sideB, double sideC) {
        if (sideA != 0 && sideB != 0 && sideC != 0) {
            if (sideA == sideB && sideB == sideC && sideA == sideC)
                return "Tam giác đều";
            else if (sideA == sideB || sideB == sideC || sideA == sideC)
                return "Tam giác cân";
            else if(sideA + sideB > sideC && sideB + sideC > sideA &&
                    sideA + sideC > sideB)
                return "Tam giác thường";
        }
        return "Không phải là tam giác";
    }
}
