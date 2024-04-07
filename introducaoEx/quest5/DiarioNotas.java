// 4. Faça um aplicativo que contenha duas classes DiarioNotas e
// DiarioNotasTest. Na primeira classe, é necessário armazenar o nome do
// curso e as notas do aluno. Crie métodos para verificar a maior e menor
// nota do estudante, a média delas e um gráfico de barras ( ”*” ). Na classe
// DiarioNotasTest, você vai atribuir as notas para o objeto da classe
// DiarioNotas e apresentar um relatório das notas, a maior nota, a menor
// nota e a distribuição num gráfico de barras ( ”*” ).

package quest5;

public class DiarioNotas {
    private String nomeCurso;
    private int[] notas;

    public DiarioNotas(String nomeCurso, int[] notas) {
        this.nomeCurso = nomeCurso;
        this.notas = notas;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int[] getNotas() {
        return notas;
    }
    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public int maiorNota() {
        int maior = this.notas[0];
        for(int i = 1; i < this.notas.length; i++) {
            if(this.notas[i] > maior) {
                maior = this.notas[i];
            }
        }
        return maior;
    }

    public int menorNota() {
        int menor = this.notas[0];
        for(int i = 1; i < this.notas.length; i++) {
            if(this.notas[i] < menor) {
                menor = this.notas[i];
            }
        }
        return menor;
    }
    
    public double mediaNotas() {
        int soma = 0;
        for(int i = 0; i < this.notas.length; i++) {
            soma += this.notas[i];
        }
        return (double) soma/this.notas.length;
    }
    
    public String criaGrafico() {
        String grafico = "";
        for(int i = 0; i < this.notas.length; i++) {
            grafico += (i + 1) + "° Nota: ";
            for(int j = 0; j < this.notas[i]; j++) {
                grafico += "*";
            }
            if(i != this.notas.length) {
                grafico += "\n";
            }
        }
        return grafico;
    }

}
