package entities;
        
import java.util.Scanner;

public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
        // Constructor por defecto
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno,
            double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = new String[5];
    }

    // Getters y setters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void cargarAlumnos() {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = sc.nextLine();
        }
    }

    public void crearCurso() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del curso: ");
        nombreCurso = sc.nextLine();
        
        System.out.print("Ingrese la cantidad de horas por día: ");
        cantidadHorasPorDia = sc.nextInt();
        
        System.out.print("Ingrese la cantidad de días por semana: ");
        cantidadDiasPorSemana = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        
        System.out.print("Ingrese el turno (mañana o tarde): ");
        turno = sc.nextLine();
        
        System.out.print("Ingrese el precio por hora: ");
        precioPorHora = sc.nextDouble();
        
        cargarAlumnos();
    }

    public double calcularGananciaSemanal() {
        int cantidadAlumnos = alumnos.length;
        double gananciaSemanal = cantidadHorasPorDia * precioPorHora * cantidadAlumnos * cantidadDiasPorSemana;
        return gananciaSemanal;
    }
}