package br.org.scrumclass.ScrumClass01;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CalculaTrocoTest {
	    
    @Test
    public  void calcularTroco_NegativoTest(){
	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1000f).getNotas();
    	
    	float[] resultadoEsperado = new float[] {0, 0, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_PositivoTest()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1200f).getNotas();
    	
    	float[] resultadoEsperado = new float[] {2, 0, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_Positivo2Test()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1550f).getNotas();
    	
    	float[] resultadoEsperado = new float[] {5, 1, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_Positivo3Test()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1566f).getNotas();
    	
    	float[] resultadoEsperado = new float[] {5, 1, 1, 1, 1};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTroco_IgualTest()
    {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] troco = calculaTroco.calcularTroco(1000f, 1000f).getNotas();
    	
    	float[] resultadoEsperado = new float[] {0, 0, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperado, troco));
    }
    
    @Test
    public void calcularTrocoComNotaEMoeda() {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	float[] trocoNota = calculaTroco.calcularTroco(100f, 150.5f).getNotas();
    	float[] trocoMoeda = calculaTroco.calcularTroco(100f, 150.5f).getMoeda();
    	
    	float[] resultadoEsperadoNota = new float[] {0, 1, 0, 0, 0};
    	
    	float[] resultadoEsperadoMoeda = new float[] {1, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperadoNota, trocoNota));
    	assertTrue(Arrays.equals(resultadoEsperadoMoeda, trocoMoeda));
    }
    
    @Test
    public void calcularTrocoComMoeda() {
    	CalculaTroco calculaTroco = new CalculaTroco();
    	calculaTroco.somenteMoedas=true;
    	float[] trocoMoeda = calculaTroco.calcularTroco(5f, 10f).getMoeda();
 	
    	float[] resultadoEsperadoMoeda = new float[] {10, 0, 0, 0};
    	
    	assertTrue(Arrays.equals(resultadoEsperadoMoeda, trocoMoeda));
    }
}
