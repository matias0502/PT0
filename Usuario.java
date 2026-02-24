/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.vib.Usuario;

public class UsuarioTest {
    
    // 1 Test: crear usuario
    @Test
    void crearUsuarioValido() {
        Usuario u = new Usuario("Ana", 25);

        assertEquals("Ana", u.getNombre());
        assertEquals(25, u.getEdad());
        assertTrue(u.isActivo());
    }

    // 2 Test: usuario activo por defecto
    @Test
    void usuarioNuevoEstaActivo() {
        
    }

    // 3 ️Test: desactivar usuario
    @Test
    void desactivarUsuarioCambiaEstado() {
        
    }

    // 4 mayor de edad
    @Test
    void usuarioMayorDeEdad() {
        
    }

    // 5 menor de edad
    @Test
    void usuarioMenorDeEdad() {
        
    }

    // 6 nombre vacío lanza excepción
    // assertThrows -> Este código debe lanzar esta excepción. Si no la lanza, el test falla.”
    @Test
    void nombreVacioLanzaExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Usuario("", 20);
        });
    }

    // 7 nombre null lanza excepción
    @Test
    void nombreNullLanzaExcepcion() {
        
    }

    // 8 edad negativa lanza excepción
    @Test
    void edadNegativaLanzaExcepcion() {
        
    }
    
    
}
