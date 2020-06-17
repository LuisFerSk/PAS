package Datos;

public class ComiteEvaluador {
    private int id = 0;
    private String user, password;
    
    public void ComiteEvaluador(){
    }
    
    public ComiteEvaluador(String User, String Password){
        this.id += 1;
        this.user = User;
        this.password = Password;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
