package basededatos;
import java.util.List;

public interface MultasDAO {
    public String Buscamultaporclave(String clavemulta);
    public List<Multas> regresatodaslasmultas();
    public List<Multas> buscaUssuariosnombre(String nombre);
    public boolean Cambiaestadomulta(String estadomulta);
    public boolean RegistraMultas(Multas multausuario);
    public float Recargospordia (Multas multausuario);
    public boolean pagomultas (Multas multausuario);
}
