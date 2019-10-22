package com.radhsyn83;

public class Hukum {
    private float kuatArus;
    private float hambatan;

    public Hukum() {}

    public Hukum(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }

    public float hitungHambatan() {
        return hambatan*kuatArus;
    }
}
