package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3064a = new o();

    private o() {
    }

    public final boolean a(View view, h1.h hVar, h1.a aVar) {
        return view.startDragAndDrop(hVar.a(), aVar, hVar.c(), hVar.b());
    }
}
