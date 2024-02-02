import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el tamaño de los usuarios: ");
        int tamano = sc.nextInt();
        sc.nextLine();  

        Usuario[] usuarios = arrayUsuario(tamano);
        
        System.out.println();
        System.out.println("Usuario");
        for (Usuario usuario : usuarios) {
            System.out.print("El Nombre: " + usuario.nombre);
            System.out.print(" Los Apellidos: " + usuario.apellidos);
            System.out.print(" El Email: " + usuario.email);
        }

       
        sc.close();
    }

    public static Usuario[] arrayUsuario(int tamano) {
        Scanner sc = new Scanner(System.in);
        
        Usuario[] usuarios = new Usuario[tamano];

        for (int i = 0; i < tamano; i++) {
            System.out.print("Dime el nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Dime el apellidos: ");
            String apellidos = sc.nextLine();

            System.out.print("Dime el email: ");
            String email = sc.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }
}

