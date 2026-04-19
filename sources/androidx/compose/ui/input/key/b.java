package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class b extends e.c implements t1.e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l<? super t1.b, Boolean> f2811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l<? super t1.b, Boolean> f2812o;

    public b(l<? super t1.b, Boolean> lVar, l<? super t1.b, Boolean> lVar2) {
        this.f2811n = lVar;
        this.f2812o = lVar2;
    }

    @Override // t1.e
    public boolean E(KeyEvent keyEvent) {
        l<? super t1.b, Boolean> lVar = this.f2812o;
        if (lVar != null) {
            return lVar.invoke(t1.b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // t1.e
    public boolean V(KeyEvent keyEvent) {
        l<? super t1.b, Boolean> lVar = this.f2811n;
        if (lVar != null) {
            return lVar.invoke(t1.b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void a2(l<? super t1.b, Boolean> lVar) {
        this.f2811n = lVar;
    }

    public final void b2(l<? super t1.b, Boolean> lVar) {
        this.f2812o = lVar;
    }
}
