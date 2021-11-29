
package extra.pkg6.pkg5;


public class mesControl {
    public Mes definirMes(String[] meses) {
        Mes mes = new Mes();
        mes.setMeses(meses);
        mes.setMesSecreto(meses[(int)Math.floor(Math.random()*(11-0+1)+0)]);
        return mes;
    }
    
}
