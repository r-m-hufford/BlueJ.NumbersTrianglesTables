 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 0; i < numberOfStars; i++) {
            stars += "*";
        }
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "";

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }


    public static String getSmallTriangle() {
        String triangle = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String getLargeTriangle()  {
        String triangle = "";

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                triangle += "*";
            }
            triangle += "\n";
        }
        return triangle;
    }
}
