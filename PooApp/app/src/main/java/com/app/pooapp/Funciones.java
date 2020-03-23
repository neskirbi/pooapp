package com.app.pooapp;

import android.content.Context;
import android.os.Vibrator;

public class Funciones {
    Context context;

    public Funciones(Context context) {
        this.context = context;
    }

    public void Vibrar(long[] pattern) {
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        // Vibrate for 500 milisegundos
        //pattern = { 0, milli};
        v.vibrate(pattern, -1);
    }

    public long[] VibrarPush() {
        long[] pattern = {0, 70};
        return pattern;
    }

}
