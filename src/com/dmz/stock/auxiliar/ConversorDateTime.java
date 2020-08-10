package com.dmz.stock.auxiliar;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kennedy
 */
public class ConversorDateTime {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd - MM - yyyy ");

    /**
     * @param data Recebe data no formato dd/MM/yyyy (20/08/1999)
     * @return java.sql.Date Retorna data no formato yyyy/MM/dd (1999/08/20)
     * @throws ParseException Se o formato da data não estiver correto
     * (20-08-1999)
     */
    public static java.sql.Date stringToDateSQL(String data) throws ParseException {
        if (data == null || data.equals("")) {
            return null;
        }

        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(data)).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    /**
     *
     * @param data Recebe data no formato dd-MM-yyyy (20-08-1999)
     * @return java.sql.Date Retorna data no formato yyyy-MM-dd (1999-08-20)
     * @throws ParseException Se o formato da data não estiver correto
     * (20/08/1999)
     */
    public static java.sql.Date stringToDateSQLDataBase(String data) throws ParseException {
        if (data == null || data.equals("")) {
            return null;
        }

        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(data.replaceAll(" ", ""))).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    /**
     *
     * @param pDate data no formato dd-MM-yyyy (20-08-1999)
     * @return java.sql.Date Retorna data no formato yyyy-MM-dd (1999-08-20)
     * @throws ParseException Se o formato da data não estiver correto
     * (20/08/1999)
     */
    public static java.sql.Date utilDateToSQLDate(Date pDate) throws ParseException {
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd-MM-yyy");
        String dataString = formatarDate.format(pDate);
        if (pDate == null) {
            return null;
        }

        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd-MM-yyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(dataString)).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    /**
     *
     * @param pData qualquer formato no tipo util.Date
     * @return Uma String no formato dd-MM-yyy (20-08-1999)
     * @throws NullPointerException Se não conter nenhuma data
     * @throws NumberFormatException Se conter um simbolo não passivel de
     * conversao
     */
    public static String utilToString(Date pData) throws NullPointerException, NumberFormatException {

        SimpleDateFormat formatarDate = new SimpleDateFormat("dd - MM - yyyy");
        return formatarDate.format(pData);

    }

    /**
     *
     * @param data Recebe uma String no formato yyyy-MM-dd (1999-08-20)
     * @return Retorna uma String no formato dd-MM-yyyy (20-08-1999)
     */
    public static String stringSQLToString(String data) {
        try {
            if (data == null || data.equals("")) {
                return null;
            }

            SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
            Date d = df.parse(data);
            df = new SimpleDateFormat("dd-MM-yyy");
            String datas = df.format(d);
            return datas;
        } catch (ParseException ex) {
            System.err.println(ex.getMessage());
            return null;
        }
    }

    /**
     *
     * @param calendar Recebe um util.Calendar
     * @return
     */
    public static String calendarToString(Calendar calendar) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String data = df.format(calendar.getTime());
        return data;
    }

    /**
     *
     * @param time Recebe uma hora String 12:00
     * @return Retorna um sql.Time no formato 12:00:00
     * @throws java.text.ParseException
     */
    public static Time stringToTime(String time) throws ParseException {
        try {
            DateFormat format = new SimpleDateFormat("HH:mm");
            Date date = format.parse(time.replaceAll(" ", ""));
            return new Time(date.getTime());
        } catch (ParseException ex) {
            throw ex;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param time sql.Time no formato 12:00
     * @return uma String no formato 12:00
     */
    public static String timeToString(Time time) {
        try {
            DateFormat sdf = new SimpleDateFormat("HH:mm");
            return sdf.format(time);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param calendar Recebe um util.Calendar
     * @return
     */
    public static LocalDate calendarToLocalDate(Calendar calendar) {
        try {
            return LocalDateTime.ofInstant(
                    calendar.toInstant(),
                    calendar.getTimeZone()
                            .toZoneId())
                    .toLocalDate();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param localDate Recebe um java.time.LocalDate
     * @return retorna uma String no formato dd - MM - yyyy (20 - 08 - 1999)
     */
    public static String localDateToString(LocalDate localDate) {
        try {
            return localDate.format(DATE_TIME_FORMATTER);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param localDateTime
     * @return
     */
    public static String localDateTimeToString(LocalDateTime localDateTime) {
        try {
            DateTimeFormatter DATE_TIME_FORMATTER_LOCAL = DateTimeFormatter.ofPattern("dd - MM - yyyy HH : mm");
            return localDateTime.format(DATE_TIME_FORMATTER_LOCAL);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param localDateTime
     * @return
     */
    public static String localDateTimeToStringTime(LocalDateTime localDateTime) {
        try {
            DateTimeFormatter TIME_FORMATTER_LOCAL = DateTimeFormatter.ofPattern("HH : mm");
            return localDateTime.format(TIME_FORMATTER_LOCAL);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param localDateTime
     * @return
     */
    public static String localDateTimeToStringDate(LocalDateTime localDateTime) {
        try {
            DateTimeFormatter TIME_FORMATTER_LOCAL = DateTimeFormatter.ofPattern("dd - MM - yyy");
            return localDateTime.format(TIME_FORMATTER_LOCAL);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param dataHora Recebe data e hora do tipo String no formato (dd - MM -
     * yyy HH:mm). Se receber noutro formato vai retornar null
     * @return
     */
    public static LocalDateTime stringToLocalDateTime(String dataHora) {
        try {

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd - MM - yyyy HH:mm");
            return LocalDateTime.parse(dataHora, dateTimeFormatter);

        } catch (Exception e) {
            return null;
        }

    }

    /**
     *
     * @param date
     * @return
     */
    public static LocalDate utilDateToLocalDate(Date date) {
        try {
            return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param date
     * @return
     */
    public static LocalDate sqlDateToLocalDate(java.sql.Date date) {
        try {
            return new java.sql.Date(date.getTime()).toLocalDate();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param date
     * @return
     */
    public static LocalDateTime sqlTimestampToLocalDateTime(Date date) {
        try {
            return new java.sql.Timestamp(date.getTime()).toLocalDateTime();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param localDate
     * @return
     */
    public static java.sql.Date localDateToSqlDate(LocalDate localDate) {
        try {
            return java.sql.Date.valueOf(localDate);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     *
     * @param localDateTime
     * @return
     */
    public static Date localDateTimeToUtilDate(LocalDateTime localDateTime) {
        try {
            return java.util.Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        } catch (Exception e) {
            return null;
        }
    }

}
