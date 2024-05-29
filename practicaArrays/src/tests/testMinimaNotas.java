package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMinimaNotas {

	private static ArrayList<Float> notasValidas;
    private static ArrayList<Float> notasInvalidas;

    @BeforeAll
    static void setUp() {
        notasValidas = new ArrayList<>(Arrays.asList(5.0f, 7.5f, 8.0f));
        notasInvalidas = new ArrayList<>(Arrays.asList(-5.0f, 12.0f, 18.0f));
    }

    @Test
    void testMinimaNotaValidas() {
        assertEquals(5.0f, MisArrays.minimaNota(notasValidas));
    }

    @Test
    void testMinimaNotaInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.minimaNota(notasInvalidas);
        });
    }

}
