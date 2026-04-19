package androidx.core.app;

import ae.r;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.c;
import androidx.lifecycle.g;
import androidx.lifecycle.p;
import z.c0;

/* JADX INFO: loaded from: classes.dex */
public class e extends Activity implements o4.e, c.a {
    private final c0<Class<? extends a>, a> extraDataMap = new c0<>();
    private final androidx.lifecycle.j lifecycleRegistry = new androidx.lifecycle.j(this);

    public static class a {
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004f, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0056, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean shouldSkipDump(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            if (r4 == 0) goto Lf
            int r2 = r4.length
            if (r2 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = r1
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r2 != 0) goto L6d
            r4 = r4[r1]
            int r2 = r4.hashCode()
            switch(r2) {
                case -645125871: goto L5b;
                case 100470631: goto L49;
                case 472614934: goto L40;
                case 1159329357: goto L2e;
                case 1455016274: goto L1c;
                default: goto L1b;
            }
        L1b:
            goto L6d
        L1c:
            java.lang.String r2 = "--autofill"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L25
            goto L6d
        L25:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r4 < r2) goto L2c
            goto L2d
        L2c:
            r0 = r1
        L2d:
            return r0
        L2e:
            java.lang.String r2 = "--contentcapture"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L37
            goto L6d
        L37:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 < r2) goto L3e
            goto L3f
        L3e:
            r0 = r1
        L3f:
            return r0
        L40:
            java.lang.String r2 = "--list-dumpables"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L52
            goto L6d
        L49:
            java.lang.String r2 = "--dump-dumpable"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L52
            goto L6d
        L52:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r4 < r2) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            return r0
        L5b:
            java.lang.String r2 = "--translation"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L64
            goto L6d
        L64:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r4 < r2) goto L6b
            goto L6c
        L6b:
            r0 = r1
        L6c:
            return r0
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.e.shouldSkipDump(java.lang.String[]):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        r.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        r.e(decorView, "window.decorView");
        if (androidx.core.view.c.d(decorView, keyEvent)) {
            return true;
        }
        return androidx.core.view.c.e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        r.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        r.e(decorView, "window.decorView");
        if (androidx.core.view.c.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public <T extends a> T getExtraData(Class<T> cls) {
        r.f(cls, "extraDataClass");
        return (T) this.extraDataMap.get(cls);
    }

    public androidx.lifecycle.g getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.f4372b.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        r.f(bundle, "outState");
        this.lifecycleRegistry.m(g.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public void putExtraData(a aVar) {
        r.f(aVar, "extraData");
        this.extraDataMap.put((Class<? extends a>) aVar.getClass(), aVar);
    }

    protected final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    @Override // androidx.core.view.c.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        r.f(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
