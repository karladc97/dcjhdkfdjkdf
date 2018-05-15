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
public class Tareas_Usuarios {
    private int id;
        private String tarea_id;
	private int usuario_id;
	
	
	public Tareas_Usuarios()
	{
	}

    public Tareas_Usuarios(int id) {
        this.id = id;
    }

    public Tareas_Usuarios(int id, String tarea_id, int usuario_id) {
        this.id = id;
        this.tarea_id = tarea_id;
        this.usuario_id = usuario_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTarea_id() {
        return tarea_id;
    }

    public void setTarea_id(String tarea_id) {
        this.tarea_id = tarea_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
        
        
}
