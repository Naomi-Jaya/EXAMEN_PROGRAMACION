package evaluacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class colaProyecto {
    PriorityQueue<Proyecto> cola;

    public colaProyecto(){
        cola.add(new Proyecto(101, "App de telemedicina", "Tecnologico", 15000, 9));
        cola.add(new Proyecto(102, "Comedor comunitario", "Social", 8000, 7));
        cola.add(new Proyecto(103, "Reforestacion", "Ambiental", 12000, 5));
        cola.add(new Proyecto(104, "Wifi", "Tecnologico", 20000, 10));
        cola.add(new Proyecto(105, "Reciclaje", "Ambiental", 5000, 3));
    }
    public boolean isEmpty(){
        return cola.isEmpty();
    }
    public boolean existeCodigo(int Codigo){
        for (Proyecto p: cola){
            if (p.getCodigo()==Codigo){
                return true;
            }
        }
        return false;
    }

    public void agregarProyecto(Proyecto p) throws Exception{
        if (existeCodigo(p.getCodigo())){
            throw new Exception("El codigo "+p.getCodigo()+"Ya existe");
        }
        cola.add(p);
    }

    public String sacarCola()throws Exception{
        if(isEmpty()){
            throw new Exception("No hay proyectos registrados");
        }
        List<Proyecto> lista=new ArrayList<>(cola);
        Collections.sort(lista);
        String texto="";
        for (Proyecto p:lista){
            texto += p.toString()+"\n";
        }
        return texto;
}

    public float costoAjustado()throws Exception{
        if(isEmpty()){
            throw new Exception("No hay proyectos registrados");
        }
        List<Proyecto> lista=new ArrayList<>(cola);
        Collections.sort(lista);
        String texto="";
        for (Proyecto p:lista){
            texto += p.toString()+"Costo ajustado: "+p.calcularCostoAjustado();
        }
        return texto;
    }



}
