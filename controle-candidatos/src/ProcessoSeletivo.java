public class ProcessoSeletivo {
    public static void main(String[] args) {

    }
    static void analisarCandidatura(double salarioPretendido){
        double  salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println(" LIGAR PARA CANDIDATO ");
        }else if ( salarioBase == salarioPretendido){
            System.out.println(" LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println(" AGUARDADO O RESULTADO DOS DEMAIS CANDIDATOS ");
        }
    }
}
