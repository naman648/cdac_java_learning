package Day1;

public class Date1 {
    private int day;
    private String month;
    private int year;

    public Date1(){
        day=1;
        month="Jan";
        year=1960;
    }

    public Date1(int day, String month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public void SetDay(int day){
        if(day>0)
            this.day=day;
    }

    public int getDay(){
        return day;
    }

    public void setDate(int d, String m, int y){
        day=d;
        month=m;
        year=y;
    }

    public void displayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }

    public String toString(){
        return day+"/"+month+"/"+year;
    }

    public static void main(String[] args){
        int i=10;
        Date1 d1=new Date1();
        d1.setDate(10, "Jul", 1990);

        Date1 d2=d1;
        d1.displayDate();
        d2.displayDate();

        Date1 d3=new Date1(23, "Jan", 1990);
        System.out.println(i);
        System.out.println(d3);
        d3.SetDay(-1);
        System.out.println(d3);


    }
}
