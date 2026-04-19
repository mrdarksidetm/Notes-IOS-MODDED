package j0;

import j0.d;
import j0.n.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n<Interval extends a> {

    public interface a {

        /* JADX INFO: renamed from: j0.n$a$a, reason: collision with other inner class name */
        static final class C0321a extends ae.s implements zd.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0321a f13740a = new C0321a();

            C0321a() {
                super(1);
            }

            public final Void a(int i10) {
                return null;
            }

            @Override // zd.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        default zd.l<Integer, Object> getKey() {
            return null;
        }

        default zd.l<Integer, Object> getType() {
            return C0321a.f13740a;
        }
    }

    public final Object c(int i10) {
        d.a<Interval> aVar = d().get(i10);
        return aVar.c().getType().invoke(Integer.valueOf(i10 - aVar.b()));
    }

    public abstract d<Interval> d();

    public final int e() {
        return d().a();
    }

    public final Object f(int i10) {
        Object objInvoke;
        d.a<Interval> aVar = d().get(i10);
        int iB = i10 - aVar.b();
        zd.l<Integer, Object> key = aVar.c().getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(iB))) == null) ? i0.a(i10) : objInvoke;
    }
}
