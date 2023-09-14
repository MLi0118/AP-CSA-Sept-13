
/**
 * Write a description of class MySolution here.
 *
 * @Melanie
 * @Sept 12, 2023
 */
public class MySolution
{
    public void celsuisToFahrenheit(){
        double a = 127;
        double fahrenheit  = a*9/5 +32;
        System.out.println(a+" ℃  = " + fahrenheit + " ℉");
    }
    
    public void elaspedTime(){
        int h = 10;
        int m = 3;
        int s = 18;
        int sec = 10*3600 + 3*60 +18;
        int secremain= 86400 - sec;
        double percentage = (double)sec/86400 *100;
        System.out.println("The current time is " + h+":"+m+":"+18 +". It has been " + sec + " seconds since the day began.");
        System.out.println("There are " + secremain + " seconds left in the day.");
        System.out.println("The day is "+ percentage + "% done.");

    }
    public void scondsToHMS(){
        int numsec = 18008;
        int H = numsec/3600;
        int M = (numsec - H *3600)/60;
        int S = numsec - H *3600 - M*60;
        System.out.println(numsec + " seconds = " + H +" hours, " + M + " seconds, " + S + "seconds.");

    }
}
