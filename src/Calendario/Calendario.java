
package Calendario;

import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Calendario {
    /*
       Esta clase  contiene la configuración del calendario
       esta a su vez retorna la fecha que se guardará en la base de datos
    */
    private  String año;
    private  String mes;
    private  String dia;
    
    /*
        La configuración inicial es usada al crear un JFrame para que este a su vez
        cargue el calendario y se le asigne unas propiedades
    */
    
    public JCalendar configuracion_inicial(JCalendar calendar){
        calendar.setTodayButtonVisible(true);
        calendar.setTodayButtonText("Día de hoy");
        calendar.setNullDateButtonVisible(true);
        calendar.setWeekOfYearVisible(false);
        calendar.setMaxDayCharacters(1);

        calendar.setForeground(Color.BLACK);
        calendar.setSundayForeground(Color.RED);
        calendar.setWeekdayForeground(Color.BLUE);
        
        Calendar calendario = new GregorianCalendar();
//        calendar.setDate(calendario.getTime());
        
        calendar.setMinSelectableDate(new Date(calendario.getTime().getYear(), calendario.getTime().getDay(), calendario.getTime().getDay()));
        calendar.setMaxSelectableDate(new Date(calendario.getTime().getYear()+2 , calendario.getTime().getDay(), calendario.getTime().getDay()));
        
        String año = Integer.toString(calendar.getCalendar().get(java.util.Calendar.YEAR));
        String mes = Integer.toString(calendar.getCalendar().get(java.util.Calendar.MONTH));
        String dia = Integer.toString(calendar.getCalendar().get(java.util.Calendar.DATE));
        
        setFechaToDataBase(año, mes, dia);
        return calendar;
    }
    
    private void setFechaToDataBase(String año,String mes,String dia){
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    
    public String getFechaToDataBase(){
        return dia+"/"+mes+"/"+año;
    }
    
}
