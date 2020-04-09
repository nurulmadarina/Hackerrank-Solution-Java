public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    String[] str = s.split(":");
        int hour = Integer.parseInt(str[0]);

        String min = str[1];
        String secPeriod = str[2];
        String sec = str[2].substring(0, secPeriod.length() - 2);
        String period = str[2].substring(secPeriod.length() - 2, secPeriod.length());

        String newTimeINString = "";

        if ((0 <= hour && hour < 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = String.format("%02d", hour) + ":" + min + ":" + sec;
        } else if ((0 <= hour && hour < 12) && period.equalsIgnoreCase("PM")) {
            newTimeINString = (12 + hour) + ":" + min + ":" + sec;

        } else if ((hour == 12) && (period.equalsIgnoreCase("AM"))) {
            newTimeINString = "00" + ":" + min + ":" + sec;
        } else if ((hour == 12) && (period.equalsIgnoreCase("PM"))) {
            newTimeINString = hour + ":" + min + ":" + sec;
        }
        return newTimeINString;/*
         * Write your code here.
         */

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
// referesi : https://www.youtube.com/redirect?redir_token=LpDD9wDKWxP0E-ndI57YgkZgf0Z8MTU4NjUyMDQwNkAxNTg2NDM0MDA2&event=video_description&v=MFvX3sLsHNY&q=https%3A%2F%2Fgithub.com%2FJava-aid%2FHackerrank-Solutions%2Fblob%2Fmaster%2FHackerRankDashboard%2FCoreCS%2FGeneralProgramming%2Fsrc%2Fmain%2Fjava%2Fcom%2Fjavaaid%2Fhackerrank%2Fsolutions%2Fgeneralprogramming%2Fbasicprogramming%2FTimeConversion.java

