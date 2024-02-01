import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
	
    public static void main(String[] args) {
        String FechaAhora = fechaHora();
        System.out.println("La fecha actual con su hora es " + FechaAhora);
    }

    public static String fechaHora() {
        LocalDateTime tiempo = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = tiempo.format(formato);

        return fechaFormateada;
    }
}
