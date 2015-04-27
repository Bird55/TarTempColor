package ru.netis.bird.yartempcolor;

import android.graphics.Color;
import android.util.Log;

/**
 * Created by bird on 25.04.2015
 */
class Constants {
    final static String LOG_TAG = "myLogs";
    final static boolean DEBUG = true;
    final static String ACTION_UPDATE = "ru.netis.bird.yartempcolor.update";

    //Массив цветов фона:
    static final String[] colors = {
            "#0000FF", "#0006FF", "#000CFF", "#0012FF", "#0018FF", "#001EFF",
            "#0024FF", "#002AFF", "#0030FF", "#0036FF", "#003CFF", "#0042FF",
            "#0048FF", "#004EFF", "#0054FF", "#005AFF", "#0060FF", "#0066FF",
            "#006CFF", "#0072FF", "#0078FF", "#007EFF", "#0084FF", "#008AFF",
            "#0090FF", "#0096FF", "#009CFF", "#00A2FF", "#00A8FF", "#00AEFF",
            "#00B4FF", "#00BAFF", "#00C0FF", "#00C6FF", "#00CCFF", "#00D2FF",
            "#00D8FF", "#00DEFF", "#00E4FF", "#00EAFF", "#FFF000", "#FFEA00",
            "#FFE400", "#FFDE00", "#FFD800", "#FFD200", "#FFCC00", "#FFC600",
            "#FFC000", "#FFBA00", "#FFB400", "#FFAE00", "#FFA800", "#FFA200",
            "#FF9C00", "#FF9600", "#FF9000", "#FF8A00", "#FF8400", "#FF7E00",
            "#FF7800", "#FF7200", "#FF6C00", "#FF6600", "#FF6000", "#FF5A00",
            "#FF5400", "#FF4E00", "#FF4800", "#FF4200", "#FF3C00", "#FF3600",
            "#FF3000", "#FF2A00", "#FF2400", "#FF1E00", "#FF1800", "#FF1200",
            "#FF0C00", "#FF0600", "#FF0000"};

    /**
     * Преобразуем данные в число, для определения цвета фона
     *
     * @param tempr текущая температура
     * @return Число сооветствующее цвету фона
     */
    static int getColor(String tempr) {
        int col;
        int n = tempr.indexOf(".");

//        Log.d(LOG_TAG, "getColor tempt=" + tempr + " n=" + n);
        if (n == 0)
            col = 0;
        else if (n == -1)
            col = Integer.parseInt(tempr);
        else
            col = Integer.parseInt(tempr.substring(0, n));

        return (Color.parseColor(colors[40 + (col)]));
    }

}
