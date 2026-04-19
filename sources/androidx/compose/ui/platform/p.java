package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f3065a = new p();

    private p() {
    }

    public final void a(View view, v1.w wVar) {
        PointerIcon pointerIconA = wVar instanceof v1.a ? ((v1.a) wVar).a() : wVar instanceof v1.b ? PointerIcon.getSystemIcon(view.getContext(), ((v1.b) wVar).a()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (ae.r.b(view.getPointerIcon(), pointerIconA)) {
            return;
        }
        view.setPointerIcon(pointerIconA);
    }
}
