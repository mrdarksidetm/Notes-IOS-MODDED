package j2;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
final class p implements w {
    @Override // j2.w
    public StaticLayout a(x xVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(xVar.r(), xVar.q(), xVar.e(), xVar.o(), xVar.u());
        builderObtain.setTextDirection(xVar.s());
        builderObtain.setAlignment(xVar.a());
        builderObtain.setMaxLines(xVar.n());
        builderObtain.setEllipsize(xVar.c());
        builderObtain.setEllipsizedWidth(xVar.d());
        builderObtain.setLineSpacing(xVar.l(), xVar.m());
        builderObtain.setIncludePad(xVar.g());
        builderObtain.setBreakStrategy(xVar.b());
        builderObtain.setHyphenationFrequency(xVar.f());
        builderObtain.setIndents(xVar.i(), xVar.p());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            r.a(builderObtain, xVar.h());
        }
        if (i10 >= 28) {
            t.a(builderObtain, xVar.t());
        }
        if (i10 >= 33) {
            u.b(builderObtain, xVar.j(), xVar.k());
        }
        return builderObtain.build();
    }

    @Override // j2.w
    public boolean b(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return u.a(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
