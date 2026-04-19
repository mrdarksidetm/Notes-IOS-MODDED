package androidx.compose.ui.input.rotary;

import androidx.compose.ui.e;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
final class b extends e.c implements x1.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l<? super x1.b, Boolean> f2821n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private l<? super x1.b, Boolean> f2822o;

    public b(l<? super x1.b, Boolean> lVar, l<? super x1.b, Boolean> lVar2) {
        this.f2821n = lVar;
        this.f2822o = lVar2;
    }

    @Override // x1.a
    public boolean N0(x1.b bVar) {
        l<? super x1.b, Boolean> lVar = this.f2821n;
        if (lVar != null) {
            return lVar.invoke(bVar).booleanValue();
        }
        return false;
    }

    public final void a2(l<? super x1.b, Boolean> lVar) {
        this.f2821n = lVar;
    }

    public final void b2(l<? super x1.b, Boolean> lVar) {
        this.f2822o = lVar;
    }

    @Override // x1.a
    public boolean q0(x1.b bVar) {
        l<? super x1.b, Boolean> lVar = this.f2822o;
        if (lVar != null) {
            return lVar.invoke(bVar).booleanValue();
        }
        return false;
    }
}
