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
            "#15ADFF", "#01BAFF", "#21B1FF", "#27B3FF", "#2DB5FF", "#33B7FF",
            "#39B9FF", "#3FBBFF", "#45BDFF", "#4BBFFF", "#51C1FF", "#57C3FF",
            "#5DC5FF", "#63C7FF", "#69C9FF", "#6FCBFF", "#75CDFF", "#07BCFF",
            "#81D1FF", "#87D3FF", "#8DD5FE", "#93D7FE", "#99D9FE", "#9FDBFE",
            "#A5DDFE", "#ABDFFE", "#B1E1FE", "#B7F3FE", "#BDF5FE", "#C3E7FE",
            "#C9E9FE", "#CFEBFE", "#D5EDFE", "#DBEFFE", "#E1F1FE", "#E7F3FE",
            "#EDF5FE", "#F3F7FE", "#F9F9FE", "#FFFBFE", "#FFFBFE", "#FFF8F7",
            "#FFF4F1", "#FFF1EA", "#FFEEE4", "#FFEADD", "#FFE7D7", "#FFE4D0",
            "#FFE0CA", "#FFDDC3", "#FFDABD", "#FFD6B6", "#FFD3B0", "#FFD0A9",
            "#FFCCA3", "#FFC99C", "#FFC696", "#FFC28F", "#FFBF89", "#FFBC82",
            "#FFB87C", "#FFB575", "#FFB26F", "#FFAE68", "#FFAB62", "#FFA85B",
            "#FFA455", "#FFA14E", "#FF9E48", "#FF9A41", "#FF973B", "#FF9434",
            "#FF902E", "#FF8D27", "#FF8A21", "#FF861A", "#FF8314", "#FF800D",
            "#FF7C07", "#FF7900", "#FF7900"};

    /**
     * Преобразуем данные в число, для определения цвета фона
     *
     * @param tempr текущая температура
     * @return Число сооветствующее цвету фона
     */
    static int getColor(String tempr) {
        int col;
        int n = tempr.indexOf(".");

        Log.d(LOG_TAG, "getColor tempt=" + tempr + " n=" + n);
        if (tempr.substring(0, 1).equals("+") || tempr.substring(0, 1).equals("-")) {
            col = Integer.parseInt(tempr.substring(1, n-1));
        } else {
            col = Integer.parseInt(tempr.substring(0, n));
        }

        return (Color.parseColor(colors[40 + (col)]));
    }

}
