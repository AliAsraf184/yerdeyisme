package Examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class bhhh {

    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        String date1= sc.next();
        Date date2= new SimpleDateFormat("dd/MM/yyyy").parse(date1);
        ZoneId defaultZoneId = ZoneId.systemDefault();
        Instant instant = date2.toInstant();
        LocalDate localDate = instant.atZone(defaultZoneId).toLocalDate();
        System.out.println(localDate.getDayOfWeek());

    }
}