package qe;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import le.m2;

/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f19108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f19109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m2 f19110c;

    static {
        w wVar = new w();
        f19108a = wVar;
        f19109b = i0.f("kotlinx.coroutines.fast.service.loader", true);
        f19110c = wVar.a();
    }

    private w() {
    }

    private final m2 a() {
        Object next;
        m2 m2VarE;
        try {
            List<v> listC = f19109b ? l.f19069a.c() : ie.o.v(ie.m.c(ServiceLoader.load(v.class, v.class.getClassLoader()).iterator()));
            Iterator<T> it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((v) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((v) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            v vVar = (v) next;
            return (vVar == null || (m2VarE = x.e(vVar, listC)) == null) ? x.b(null, null, 3, null) : m2VarE;
        } catch (Throwable th) {
            return x.b(th, null, 2, null);
        }
    }
}
