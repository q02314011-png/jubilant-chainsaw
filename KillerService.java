package com.rocket.maxkiller;

import android.accessibilityservice.AccessibilityService;
import android.view.accessibility.AccessibilityEvent;

public class KillerService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED) {
            if (event.getPackageName() != null) {
                // Пакет приложения Max
                if (event.getPackageName().toString().equals("ru.oneme.app")) {
                    // Выкидываем на рабочий стол
                    performGlobalAction(GLOBAL_ACTION_HOME);
                }
            }
        }
    }
    @Override
    public void onInterrupt() {}
}