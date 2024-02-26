public class Variables {
    /**
     * Variable in java
     * <p>
     * A variable is named memory location in the computer's memory for storing different type of data type
     * A variable is sn item for storing the state of objects
     * A variable is container/ box for holding data
     * <p>
     * Avariable has;-
     * data type -> specifies the type of data that the variable can hold
     * name -> used to reference the variable (must follow the identifier rules)
     */
    public static void main(String[] args) {
        //Declaring and intializing variable
        // in java, we declare variables as follows:

        //syntax:
        // <data_type> <variable_name>[= initial_value];
        //declare and initialize 8 variables of 8 data types
        String userName = "Brenda";
        // integer
        int useAge = 18;

        //Byte
        byte userId = 100;

        //Short
        short userStaffNumber = 12345;

        //Long
        long userAccountBalance = 15243663738L;

        //Float
        float userApprovedLoanAmount;

        //Double
        double userTransferredAccountAmount;

        //Character
        char favLetter = 'b';

        // variable declared on one line(Not recommended)
        double quiz = 10, exam = 0, grade = 0;

        //Recommended(declare a single variable on a single line)
        double studentQuiz = 10;
        double studentExam = 0;
        double studentGrade = 0;

        String firstName="Brenda";
        String lastName = "Karimi";

        //outputting variables data
        // System.out.println()-> appends a line break
        //system.out.print() -> append data on the same line

        System.out.println(firstName);
        System.out.print(lastName);

        String userGreeting = "Hello";
        String userTarget = "world";

        System.out.print(userGreeting);
        System.out.print(userTarget);

        // In java programming we have two types of variables mainly:
        // -> primitive variables stores data in the actual memory location of where the variable is e.g int,long..
        int number =10;


        // -> Reference variables stores the address in the memory location point to another memory location where the actual data is e.g String data type
        String favLanguage ="java";

    }
}
