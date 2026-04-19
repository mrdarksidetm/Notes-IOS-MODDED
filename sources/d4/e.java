package d4;

import ae.r;
import d4.d;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final d a() {
        return new a(null, true, 1, null);
    }

    public static final a b(d.b<?>... bVarArr) {
        r.f(bVarArr, "pairs");
        a aVar = new a(null, false, 1, null);
        aVar.h((d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return aVar;
    }
}
