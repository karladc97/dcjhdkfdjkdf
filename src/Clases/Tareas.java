/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author SISTEMAS
 */
public class Tareas {
    
	private int tarea_id;
        private String descripcion;
	private int fecha_inicio;
	private int fecha_fin;
	private int progreso;
	
	public Tareas()
	{
	}

    public Tareas(int tarea_id) {
        this.tarea_id = tarea_id;
    }

    public Tareas(int tarea_id, String descripcion, int fecha_inicio, int fecha_fin, int progreso) {
        this.tarea_id = tarea_id;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.progreso = progreso;
    }

    public int getTarea_id() {
        return tarea_id;
    }

    public void setTarea_id(int tarea_id) {
        this.tarea_id = tarea_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(int fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(int fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }
        
    
}
