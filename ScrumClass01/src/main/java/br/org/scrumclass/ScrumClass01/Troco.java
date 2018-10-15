package br.org.scrumclass.ScrumClass01;

public class Troco {
    float notas[];
    float moeda[];
    
    public Troco(float[] resultadoTrocoNotas, float[] resultadoTrocoMoedas) {
	this.notas = resultadoTrocoNotas;
	this.moeda = resultadoTrocoMoedas;
    }
    public float[] getNotas() {
        return notas;
    }
    public void setNotas(float[] notas) {
        this.notas = notas;
    }
    public float[] getMoeda() {
        return moeda;
    }
    public void setMoeda(float[] moeda) {
        this.moeda = moeda;
    }
}
