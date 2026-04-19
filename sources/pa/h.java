package pa;

import android.content.Context;
import da.q;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    public interface a<T> {
        String a(T t10);
    }

    public static da.c<?> b(String str, String str2) {
        return da.c.l(f.a(str, str2), f.class);
    }

    public static da.c<?> c(final String str, final a<Context> aVar) {
        return da.c.m(f.class).b(q.i(Context.class)).d(new da.g() { // from class: pa.g
            @Override // da.g
            public final Object a(da.d dVar) {
                return h.d(str, aVar, dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, da.d dVar) {
        return f.a(str, aVar.a((Context) dVar.a(Context.class)));
    }
}
