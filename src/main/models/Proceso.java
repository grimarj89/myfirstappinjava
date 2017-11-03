package main.models;

/*
 * Created by grim on 03/11/2017.
 */
public class Proceso {

    private String nombre;
    private int quantum, priority, idProcess;


    public Proceso(String nombre, int quantum, int priority, int idProcess) {
        this.nombre = nombre;
        this.quantum = quantum;
        this.priority = priority;
        this.idProcess = idProcess;
    }

    public int getIdProcess() {
        return idProcess;
    }

    public void setIdProcess(int idProcess) {
        this.idProcess = idProcess;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getQuantum() {
        return quantum;
    }

    public void setQuantum(int quantum) {
        this.quantum = quantum;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    private void startProcess(){

    }
}
