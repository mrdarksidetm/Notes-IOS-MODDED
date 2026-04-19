package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.flutter.view.c f13048a;

    a() {
    }

    public boolean a(MotionEvent motionEvent, boolean z10) {
        io.flutter.view.c cVar = this.f13048a;
        if (cVar == null) {
            return false;
        }
        return cVar.M(motionEvent, z10);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.c cVar = this.f13048a;
        if (cVar == null) {
            return false;
        }
        return cVar.w(view, view2, accessibilityEvent);
    }

    void c(io.flutter.view.c cVar) {
        this.f13048a = cVar;
    }
}
