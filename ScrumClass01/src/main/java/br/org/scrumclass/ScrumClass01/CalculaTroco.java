package br.org.scrumclass.ScrumClass01;
public class CalculaTroco {

    float notas[] = new float[] {100, 50, 10, 5, 1};
    float moedas[] = new float[] {0.50f, 0.10f, 0.05f, 0.01f};
    boolean somenteMoedas = false;

    public Troco calcularTroco(float valorTotal, float valorPago)
    {
    	float valorTroco = valorPago - valorTotal;
    	float resultadoTrocoNotas[] = new float[] {0, 0, 0, 0, 0};
    	float resultadoTrocoMoedas[] = new float[] {0, 0, 0, 0};
    	
    	if(valorTroco > 0){
    		if(!somenteMoedas)
    		{
	        	for(int i=0; i< notas.length; i++)
	        	{
	        		if(valorTroco >= notas[i])
	        		{
	        			float divisao = valorTroco/notas[i];
	        			float resto = valorTroco % notas[i];
	        			
	        			if(resto == 0)
	        			{
	        			    resultadoTrocoNotas[i] = divisao;
	        			    return new Troco(resultadoTrocoNotas,resultadoTrocoMoedas);
	        			}
	        			else
	        			{
	        			    resultadoTrocoNotas[i] = (int)divisao;
	        				valorTroco = valorTroco - ((int)(divisao))*notas[i];         				
	        			}
	        		}
	        	}
        	}
        	
        	for(int j=0;j< moedas.length;j++) {
				float divisao = valorTroco/moedas[j];
				float resto = valorTroco%moedas[j];
				
				if(resto == 0) {
					resultadoTrocoMoedas[j] = divisao;
    			    return new Troco(resultadoTrocoNotas,resultadoTrocoMoedas);
				}
				else {
					resultadoTrocoMoedas[j] = (int)divisao;
    				valorTroco = valorTroco - ((int)(divisao))*moedas[j]; 
				}
			}
    	}
    	
    	return new Troco(resultadoTrocoNotas,resultadoTrocoMoedas);
    }
}
