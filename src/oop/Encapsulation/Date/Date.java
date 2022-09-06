package oop.Encapsulation.Date;

public class Date{
    private int days;
    private int month;
    private int year;
    private Day day;

    public Date()
    {
        this.days  = 01;
        this.month = 01;
        this.year = 1972;
        System.out.println("Default Constructor");
    }
    public Date(int d, int m, int y)
    {
        setMonth(m);
        setDay(d);
        setYear(y);
        System.out.println("Overloaded Constructor");
    }
    int getMonth()
    {
        return month;
    }
    int getDay()
    {
        return days;
    }
    int getYear()
    {
        return year;
    }
    public void setMonth(int m)
    {
        month = m;
    }
    public void setDay(int d)
    {
        days = d;
    }
    public void setYear(int y)
    {
        year = y;
    }
    public void nextDay()
    {
        if( ! isValidDay(++days))
        {
            days = 1;
            if(++month > 12)
            {
                month = 1;
                year++;
            }
        }
    }
    private boolean isValidDay(int newDay)
    {
        int [] daysInMonth = {0,31,28,31,
                30,31,30,
                31,31,30,
                31,30,31};
        if(newDay > daysInMonth[month])
        {
            if(month == 2 && isLeapYear() && newDay == 29)
            {
                return true;
            }
            else{
                return false;
            }
        }
        else
        {
            return true;
        }
    }

    private boolean isLeapYear()
    {
        return (!(year % 4 != 0 ||( year % 100 ==0 && year % 400 !=0)));
    }

    public void setDate(int d, int m, int y)
    {
        setMonth(m);
        setDay(d);
        setYear(y);
    }
    public String toString()
    {
        if(days < 10)
        {
            return "0"+days + "/"+ "0"+ month +"/" + year;

        }
        return days + "/" +"0"+ month +"/" + year;
    }

    enum Day
    {
        MON,TUE,WED,THU,FRI,SAT,SUN;
    }

    public Day dayOfTheWeek()
    {
        if(month == 1 || month == 2)
        {
            year  = year - 1;
            month = month + 12;

        }
        int a = year/100;
        int b = a/4;
        int c = 2-a+b;
        int e = (int) 365.25 * (year + 4716);
        int f = (int)30.5001 *(month +1);
        int jd = c + days+ e + f-(int)1524.5;

        if(jd%7 == 1)
        {
            day = Day.MON;
        }
        else if(jd%7==2)
        {
            day = Day.FRI;
        }
        else if(jd%7==3)
        {
            day = Day.WED;
        }
        else if(jd%7 ==4)
        {
            day = Day.THU;
        }
        else if(jd%7==5)
        {
            day = Day.FRI;
        }
        else if(jd%7==6)
        {
            day = Day.SAT;
        }
        else if(jd%7 ==7)
        {
            day = Day.SUN;
        }
        return day;


    }
}
