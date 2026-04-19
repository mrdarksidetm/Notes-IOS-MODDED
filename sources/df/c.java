package df;

import ae.j;
import java.util.List;
import nd.u;
import we.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    private c() {
    }

    public /* synthetic */ c(j jVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ we.b c(c cVar, he.c cVar2, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = u.m();
        }
        return cVar.b(cVar2, list);
    }

    public abstract void a(e eVar);

    public abstract <T> we.b<T> b(he.c<T> cVar, List<? extends we.b<?>> list);

    public abstract <T> we.a<T> d(he.c<? super T> cVar, String str);

    public abstract <T> h<T> e(he.c<? super T> cVar, T t10);
}
