package ru.itis.lab09;

public class TestHex {
    public static void main(String[] args) {
        byte[] inp = new byte[] {0x12, 0x19, 0x1F, 0x4A, 0x77};

        System.out.println(Hex.encode(inp));
    }
}
