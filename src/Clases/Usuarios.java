package Clases;

public class Usuarios
{
	private int usuario_id;
        private String user_name;
	private int password;
	
	public Usuarios()
	{
	}

    public Usuarios(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public Usuarios(int usuario_id, String user_name, int password) {
        this.usuario_id = usuario_id;
        this.user_name = user_name;
        this.password = password;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
	
	
	


	
	
//    @Override
//    public String toString() {
//        return "Usuarios{" + "usuario_id=" + usuario_id + '}';
//    }
	
}
