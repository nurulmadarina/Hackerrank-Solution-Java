class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance(); 
        c.set(year, (month)-1,day);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dayOfWeek);

    String hari = "";
    switch(dayOfWeek){
    case 1:
        hari="SUNDAY";
        break;
    case 2:
        hari="MONDAY";
        break;
    case 3:
        hari="TUESDAY";
        break;
    case 4:
        hari="WEDNESDAY";
        break;
    case 5:
        hari="THURSDAY";
        break;
    case 6:
        hari="FRIDAY";
        break;
    case 7:
        hari="SATURDAY";
        break;
    }
    return hari;
    }    

}
