package ru.netis.bird.yartempcolor;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
//import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;

/**
 * Created by bird on 24.04.2015
 */
public class YarTempColorWidget extends AppWidgetProvider {

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
//        Log.d(Constants.LOG_TAG, "YarTempColor onUpdate");
        UpdateWidget myUpdateWidget = new UpdateWidget(context, appWidgetManager);
        for (int widgetId : appWidgetIds) {
//            Log.d(Constants.LOG_TAG, "YarTempColor onUpdate [" + widgetId + "]");
            myUpdateWidget.updateWidget(widgetId);
        }
    }

    @Override
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        super.onReceive(context, intent);
//        Log.d(Constants.LOG_TAG, "YarTempColor onReceive");
/*
        // Извлекаем ID экземпляра
        int mAppWidgetId = AppWidgetManager.INVALID_APPWIDGET_ID;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            mAppWidgetId = extras.getInt(
                    AppWidgetManager.EXTRA_APPWIDGET_ID,
                    AppWidgetManager.INVALID_APPWIDGET_ID);
        }

        Log.d(Constants.LOG_TAG, "YarTempColor onReceive [" + mAppWidgetId + "]");
        if (mAppWidgetId != AppWidgetManager.INVALID_APPWIDGET_ID) {
            // Проверяем, что это intent от нажатия на третью зону
            if (intent.getAction().equalsIgnoreCase(Constants.ACTION_UPDATE)) {
                Log.d(Constants.LOG_TAG, "YarTempColor onReceive [" + mAppWidgetId + "] ACTION_UPDATE");
                UpdateWidget myUpdateWidget = new UpdateWidget(context, AppWidgetManager.getInstance(context));
                myUpdateWidget.updateWidget(mAppWidgetId);
            }
        }
*/
    }

    @Override
    public void onEnabled(Context context) {
//        Log.d(Constants.LOG_TAG, "YarTempColor onEnable");
        super.onEnabled(context);
    }

    @Override
    public void onDisabled(Context context) {
//        Log.d(Constants.LOG_TAG, "YarTempColor onDisable");
        super.onDisabled(context);
    }
}
