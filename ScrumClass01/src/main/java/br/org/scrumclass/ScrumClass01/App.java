package br.org.scrumclass.ScrumClass01;

public class App {

    public static void main(String[] args) {	
		CalculaTroco calcula = new CalculaTroco();
		
		float valorTotal = 100f;
		float valorPago = 150.5f;
		
		Troco troco = calcula.calcularTroco(valorTotal, valorPago);
		
		System.out.println("Notas: ");
    	for (float f : troco.getNotas()) {
			System.out.print(f + " ");
		}
    	
    	System.out.println("\nMoedas: ");
    	for (float f : troco.getMoeda()) {
			System.out.print(f + " ");
		}
    }
}
