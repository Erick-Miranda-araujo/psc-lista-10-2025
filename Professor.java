
public class Professor {
private String nome;
private String materias;
private int RP;
private String email;

public Professor(String nome,String materias, int RP, String email){
this.nome = nome;
this.materias = materias;
this.RP = RP;
this.email = email;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getMaterias() {
    return materias;
}

public void setMaterias(String materias) {
    this.materias = materias;
}

public long getRP() {
    return RP;
}

public void setRP(int RP) {
    this.RP = RP;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
public void PrepararProva(){
System.out.println("Prova pronta para aplicação!");
    }
public void PreencherBoletim(String gabarito){
gabarito = "1.A\n 2.A \n 3.B \n 4.C \n 5.E";
System.out.println("O gabarito para prova é: " + gabarito);
}
public void RealizarAulas(){
System.out.println("Lecionar programação");
}
public void CorrigirProvas(){
System.out.println("Prova corrigida!");
}


}