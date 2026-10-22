package evaluacion;

public class Proyecto {
    private int Codigo;
    private String Nombre;
    private String TipoProyecto;
    private float CostoEstimado;
    private int Prioridad;

    public Proyecto(int codigo, String nombre, String tipoProyecto, float costoEstimado, int prioridad) {
        Codigo = codigo;
        Nombre = nombre;
        TipoProyecto = tipoProyecto;
        CostoEstimado = costoEstimado;
        Prioridad = prioridad;
    }

    public Proyecto(){
        this.Codigo=0;
        this.Nombre="sin nombre";
        this.TipoProyecto="tecnologico";
        this.CostoEstimado=0f;
        this.Prioridad=1;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoProyecto() {
        return TipoProyecto;
    }

    public void setTipoProyecto(String tipoProyecto) {
        TipoProyecto = tipoProyecto;
    }

    public float getCostoEstimado() {
        return CostoEstimado;
    }

    public void setCostoEstimado(float costoEstimado) {
        CostoEstimado = costoEstimado;
    }

    public int getPrioridad() {
        return Prioridad;
    }

    public void setPrioridad(int prioridad) {
        Prioridad = prioridad;
    }

    public float calcularCostoAjustado(){
        if(TipoProyecto.equals("tecnologico")){
            return CostoEstimado+CostoEstimado*15/100;
        }else if(TipoProyecto.equals("social")){
            return CostoEstimado-CostoEstimado*10/100;
        }else if(TipoProyecto.equals("ambiental")){
            return CostoEstimado-CostoEstimado*5/100;
        }
        return CostoEstimado;
    }

    @Override
    public int compareTo(Proyecto otro){
        return Integer.compare(otro.Prioridad, this.Prioridad);
    }

    @Override
    public String toString(){
        return "Codigo: "+Codigo+"\n"+"Nombre: "+Nombre+"\n"+"Tipo: "+TipoProyecto+"\n"+"Costo Estimado: "+CostoEstimado+"\n"+ "Prioridad: "+Prioridad+"\n";
    }
}
