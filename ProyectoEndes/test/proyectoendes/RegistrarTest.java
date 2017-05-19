/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoendes;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RegistrarTest {
    
    private int num1,num2,num3;
    private String mensaje;
    
    public RegistrarTest(int num1, int num2, int num3, String mensaje) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.mensaje = mensaje;
    }
    
    @Parameters
     public static Collection<Object[]> numeros(){
         return Arrays.asList(new Object[][]{
          {6,6,6,""},
          {5,6,6,"En el login ha introducido menos de 6 caracteres\n"},
          {0,1,1,"El login es obligatorio\n"+"En la contraseña ha introducido menos de 6 caracteres\n"}
          
         });
     }
   
   @Test
    public void testCalculaLetra() {
        System.out.println("CalculaLetra");
        Registrar instance = new Registrar();
        
        String result = instance.calcularMensaje(num1,num2,num3);
        assertEquals(mensaje, result);
       
    }
    
}
