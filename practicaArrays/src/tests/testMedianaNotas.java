package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMedianaNotas {

	private static ArrayList<Float> notasValidas;
    private static ArrayList<Float> notasInvalidas;

    @BeforeAll
    static void setUp() {
        notasValidas = new ArrayList<>(Arrays.asList(5.0f, 7.5f, 8.0f));
        notasInvalidas = new ArrayList<>(Arrays.asList(-5.0f, 12.0f, 20.0f));
    }

    @Test
    void testMedianaNotasValidas() {
        assertEquals(7.5f, MisArrays.medianaNotas(notasValidas));
    }

    @Test
    void testMedianaNotasInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> {
            MisArrays.medianaNotas(notasInvalidas);
        });
    }

}
