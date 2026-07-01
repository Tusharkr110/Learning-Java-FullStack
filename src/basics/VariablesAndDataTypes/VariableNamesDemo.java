package basics.VariablesAndDataTypes;

public class VariableNamesDemo {
    public static void main(String[] args) {
//============================================================
    //  Rules:
    //· Case-sensitive (age # Age)
    //. Must begin with a letter, '_' or '$' (but prefer letters)
    //. Cannot start with a digit
    //· No spaces or special symbols (%, #, @, etc.)
    //· cannot be a Java keyword (e.g., int, class, for)
    //. Can contain letters, digits, '_' or '$' after the first character
    //· Use meaningful names (avoid x1, a2)
    //· Use lowerCamelCase for normal variables (totalMarks)
    //· Use UPPER_CASE_WITH_UNDERSCORES for constants (MAX_SPEED)


//-----------------------------------------------------------------
        // ✅ VALID variable names
        int age =2;
        int studentCount = 100;
        int _score = 95;            // legal but not recommended
        int $total = 500;           // legal but not recommended
        int gearRatio = 6;
        final int MAX_SPEED  = 120; // constant naming convention


    }
}
