package w7;

import w7.c;

/* JADX INFO: loaded from: classes.dex */
abstract class n {

    public static abstract class a {
        public abstract n a();

        abstract a b(u7.b bVar);

        abstract a c(u7.c<?> cVar);

        abstract a d(u7.e<?, byte[]> eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract u7.b b();

    abstract u7.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    abstract u7.e<?, byte[]> e();

    public abstract o f();

    public abstract String g();
}
