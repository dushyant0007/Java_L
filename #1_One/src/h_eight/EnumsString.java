package h_eight;

enum TSize {
    SMALL {

        // overriding toString() for SMALL
        public String toString() {
            return "The size is small.";
        }
    },

    MEDIUM {

        // overriding toString() for MEDIUM
        public String toString() {
            return "The size is medium.";
        }
    };
}

public class EnumsString {

    public static void main(String[] args) {
        System.out.println(TSize.MEDIUM.toString());
    }

}
