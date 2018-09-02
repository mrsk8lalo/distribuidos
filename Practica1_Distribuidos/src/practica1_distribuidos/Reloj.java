package practica1_distribuidos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Reloj {

    private String hora, min, seg;

    private boolean hechoM, hechoH;

    public Reloj() {
    }

    public void Calcula() { //Constructor 
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);

        hora = String.valueOf(calendario.get(Calendar.HOUR_OF_DAY));
        min = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }

    public void Actualiza1(int h, int m, int s) { //Constructor 

        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);

          
        if (s < 59) {
            s++;
        } else if (s == 59) {
            s = 0;
            if (m < 59) {
                m++;
            } else if (m == 59) {
                m = 0;
                if (h < 23) {
                    h++;
                } else if (h == 23) {
                    h = 0;
                }
            }
        }
        hora = h > 9 ? "" + h : "0" + h;

        min = m > 9 ? "" + m : "0" + m;

        seg = s > 9 ? "" + s : "0" + s;

        System.out.println(hora + "---" + min + "---" + seg);

    }
    

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getSeg() {
        return seg;
    }

    public void setSeg(String seg) {
        this.seg = seg;
    }
}
