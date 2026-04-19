package s2;

import android.text.Spannable;
import i2.d;
import i2.u;
import i2.v;
import java.util.List;
import l2.j;
import w2.t;
import w2.v;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private static final int a(long j10) {
        long jG = t.g(j10);
        v.a aVar = v.f22432b;
        if (v.g(jG, aVar.b())) {
            return 0;
        }
        return v.g(jG, aVar.a()) ? 1 : 2;
    }

    private static final int b(int i10) {
        v.a aVar = i2.v.f12416a;
        if (i2.v.i(i10, aVar.a())) {
            return 0;
        }
        if (i2.v.i(i10, aVar.g())) {
            return 1;
        }
        if (i2.v.i(i10, aVar.b())) {
            return 2;
        }
        if (i2.v.i(i10, aVar.c())) {
            return 3;
        }
        if (i2.v.i(i10, aVar.f())) {
            return 4;
        }
        if (i2.v.i(i10, aVar.d())) {
            return 5;
        }
        if (i2.v.i(i10, aVar.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    private static final void c(Spannable spannable, u uVar, int i10, int i11, w2.d dVar) {
        for (Object obj : spannable.getSpans(i10, i11, g4.a.class)) {
            spannable.removeSpan((g4.a) obj);
        }
        d.u(spannable, new j(t.h(uVar.c()), a(uVar.c()), t.h(uVar.a()), a(uVar.a()), dVar.y0() * dVar.getDensity(), b(uVar.b())), i10, i11);
    }

    public static final void d(Spannable spannable, List<d.b<u>> list, w2.d dVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            d.b<u> bVar = list.get(i10);
            c(spannable, bVar.a(), bVar.b(), bVar.c(), dVar);
        }
    }
}
