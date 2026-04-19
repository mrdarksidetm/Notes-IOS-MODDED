package n2;

import android.content.res.AssetManager;
import n2.h0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final s a(String str, AssetManager assetManager, i0 i0Var, int i10, h0.d dVar) {
        return new a(assetManager, str, i0Var, i10, dVar, null);
    }

    public static /* synthetic */ s b(String str, AssetManager assetManager, i0 i0Var, int i10, h0.d dVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i0Var = i0.f15808b.g();
        }
        if ((i11 & 8) != 0) {
            i10 = e0.f15784b.b();
        }
        if ((i11 & 16) != 0) {
            dVar = h0.f15795a.a(i0Var, i10, new h0.a[0]);
        }
        return a(str, assetManager, i0Var, i10, dVar);
    }
}
