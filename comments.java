public class comments {
    public static void main(String[] args){
        /* Comments in Java
        * We have Three types of comments in java
        * 1. c++ Style comments --> //
        * 2. C Style comments
        * 3. special javadoc comments */

        //1. C++ comments Style
     System.out.println("We use // for C++ comment style");

        /* 2. C comment Style */
        System.out.println("We use /** for C comment style");

        /**
         * 3. Special javadoc comment
         */
        System.out.println("3. We use /** */ for special javadoc comment");


    }

    /**
     *
     * @param x
     * @param y
     * @return
     */

    public static int add(int x, int y) {
        return (x + y);
    }

}
