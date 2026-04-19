package i5;

import ae.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12541a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                jVar = c.f12524a.a();
            }
            if ((i10 & 4) != 0) {
                gVar = i5.a.f12519a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final <T> h<T> a(T t10, String str, j jVar, g gVar) {
            r.f(t10, "<this>");
            r.f(str, "tag");
            r.f(jVar, "verificationMode");
            r.f(gVar, "logger");
            return new i(t10, str, jVar, gVar);
        }
    }

    public abstract T a();

    protected final String b(Object obj, String str) {
        r.f(obj, "value");
        r.f(str, "message");
        return str + " value: " + obj;
    }

    public abstract h<T> c(String str, zd.l<? super T, Boolean> lVar);
}
