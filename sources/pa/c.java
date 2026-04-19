package pa;

import da.q;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f18302b;

    c(Set<f> set, d dVar) {
        this.f18301a = e(set);
        this.f18302b = dVar;
    }

    public static da.c<i> c() {
        return da.c.e(i.class).b(q.k(f.class)).d(new da.g() { // from class: pa.b
            @Override // da.g
            public final Object a(da.d dVar) {
                return c.d(dVar);
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(da.d dVar) {
        return new c(dVar.d(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // pa.i
    public String a() {
        if (this.f18302b.b().isEmpty()) {
            return this.f18301a;
        }
        return this.f18301a + ' ' + e(this.f18302b.b());
    }
}
