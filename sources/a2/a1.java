package a2;

import androidx.compose.ui.e;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {
    public static final <T extends e.c & z0> void a(T t10, zd.a<md.i0> aVar) {
        b1 b1VarD1 = t10.D1();
        if (b1VarD1 == null) {
            b1VarD1 = new b1(t10);
            t10.V1(b1VarD1);
        }
        k.l(t10).getSnapshotObserver().i(b1VarD1, b1.f38b.a(), aVar);
    }
}
