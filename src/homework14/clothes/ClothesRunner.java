package homework14.clothes;

import homework14.clothes.model.Size;

import java.util.Arrays;
import java.util.Scanner;

import static homework14.clothes.model.ClothesSize.*;

public class ClothesRunner {
    public static void main(String[] args) {
        Size size = new Size(32);
        Size size1 = new Size(34);
        Size size2 = new Size(36);
        Size size3 = new Size(38);
        Size size4 = new Size(40);

        Size size32 = new Size(XXS, 32);
        Size size34 = new Size(XS, 34);
        Size size36 = new Size(S, 36);
        Size size38 = new Size(M, 38);
        Size size40 = new Size(L, 40);

        Scanner scanner = new Scanner(System.in);
        String sizeScan = scanner.nextLine().toUpperCase();
        switch (sizeScan) {
            case "XXS" ->
                    System.out.println("XXS, " + "Порядковый номер: " + Arrays.toString(new int[]{XXS.ordinal()}) + size);
            case "XS" ->
                    System.out.println("XS, " + "Порядковый номер: " + Arrays.toString(new int[]{XS.ordinal()}) + size1);
            case "S" ->
                    System.out.println("S, " + "Порядковый номер: " + Arrays.toString(new int[]{S.ordinal()}) + size2);
            case "M" ->
                    System.out.println("M, " + "Порядковый номер: " + Arrays.toString(new int[]{M.ordinal()}) + size3);
            case "L" ->
                    System.out.println("L, " + "Порядковый номер: " + Arrays.toString(new int[]{L.ordinal()}) + size4);
        }

    }
}
