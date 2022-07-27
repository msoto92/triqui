/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Miguel
 */
public class Triqui {

    private int[][] triqui = new int[3][3];

    public Triqui() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                triqui[i][j] = -1;
            }
        }
    }
    // 1 == X
    // 0 == O

    public void agregarSimbolo(int i, int j, int simbolo) {
        triqui[i][j] = simbolo;
    }

    /*
       0 1 0
       0 1 0
       0 1 0
     */
    public int validarGanador() {
        int v = validarFila(0);

        if (v != -1) {
            return v;
        }

        v = validarFila(1);
        
        if (v != -1) {
            return v;
        }
        
        v = validarFila(2);
        if (v != -1) {
            return v;
        }
        
        v = validarColumna(0);
        if (v != -1) {
            return v;
        }
        
        v = validarColumna(1);
        if (v != -1) {
            return v;
        }
        
        v = validarColumna(2);
        if (v != -1) {
            return v;
        }
        
        v = validarDiagonalPrincipal();
        if (v != -1) {
            return v;
        }
        
        v = validarSegundaDiagonal();

        return v;
    }

    private int validarFila(int i) {
        int v = -1;

        int validador0 = 0;
        int validadorx = 0;

        for (int j = 0; j < 3; j++) {
            if (triqui[i][j] == 0) {
                validador0++;
            }

            if (triqui[i][j] == 1) {
                validadorx++;
            }
        }

        if (validador0 == 3) {
            v = 0;
        } else if (validadorx == 3) {
            v = 1;
        }

        return v;
    }

    private int validarColumna(int j) {
        int v = -1;

        int validador0 = 0;
        int validadorx = 0;

        for (int i = 0; i < 3; i++) {
            if (triqui[i][j] == 0) {
                validador0 = validador0 + 1;
            }
            if (triqui[i][j] == 1) {
                validadorx = validadorx + 1;
            }
        }

        if (validador0 == 3) {
            v = 0;
        } else if (validadorx == 3) {
            v = 1;
        }

        return v;
    }

    private int validarDiagonalPrincipal() {
        int v = -1;

        int validador0 = 0;
        int validador1 = 0;

        for (int i = 0; i < 3; i++) {
            if (triqui[i][i] == 0) {
                validador0 = validador0 + 1;
            }
            if (triqui[i][i] == 1) {
                validador1 = validador1 + 1;
            }
        }

        if (validador0 == 3) {
            v = 0;
        } else if (validador1 == 3) {
            v = 1;
        }

        return v;
    }

    /*
       0 1 0
       0 1 0
       0 1 0
     */
    private int validarSegundaDiagonal() {
        int validador0 = 0;
        int validador1 = 0;

        if (triqui[0][2] == 0) {
            validador0 = validador0 + 1;
        }

        if (triqui[2][0] == 0) {
            validador0 = validador0 + 1;
        }

        if (triqui[1][1] == 0) {
            validador0 = validador0 + 1;
        }

        if (triqui[0][2] == 1) {
            validador1 = validador1 + 1;
        }

        if (triqui[2][0] == 1) {
            validador1 = validador1 + 1;
        }

        if (triqui[1][1] == 1) {
            validador1 = validador1 + 1;
        }

        int v = -1;

        if (validador0 == 3) {
            v = 0;
        } else if (validador1 == 3) {
            v = 1;
        }

        return v;
    }
}
