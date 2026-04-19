package p2;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public static final Executor d(final Choreographer choreographer) {
        return new Executor() { // from class: p2.i0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                k0.e(choreographer, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Choreographer choreographer, final Runnable runnable) {
        choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: p2.j0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                k0.f(runnable, j10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Runnable runnable, long j10) {
        runnable.run();
    }

    private static final boolean g(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(android.view.inputmethod.EditorInfo r7, p2.k r8, p2.e0 r9) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.k0.h(android.view.inputmethod.EditorInfo, p2.k, p2.e0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(EditorInfo editorInfo) {
        if (androidx.emoji2.text.e.i()) {
            androidx.emoji2.text.e.c().v(editorInfo);
        }
    }
}
