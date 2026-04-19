package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {
    protected final v8.f mLifecycleFragment;

    protected LifecycleCallback(v8.f fVar) {
        this.mLifecycleFragment = fVar;
    }

    private static v8.f getChimeraLifecycleFragmentImpl(v8.e eVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static v8.f getFragment(Activity activity) {
        return getFragment(new v8.e(activity));
    }

    public static v8.f getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    protected static v8.f getFragment(v8.e eVar) {
        if (eVar.d()) {
            return v8.n0.I(eVar.b());
        }
        if (eVar.c()) {
            return v8.l0.c(eVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityS = this.mLifecycleFragment.s();
        w8.m.k(activityS);
        return activityS;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }
}
