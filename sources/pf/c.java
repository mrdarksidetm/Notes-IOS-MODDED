package pf;

import vf.e;

/* JADX INFO: loaded from: classes2.dex */
public class c implements e.c, of.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f18377a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f18378a = false;

        public of.a b() {
            return new c(this, null);
        }
    }

    private c(a aVar) {
        this.f18377a = aVar.f18378a;
    }

    /* synthetic */ c(a aVar, b bVar) {
        this(aVar);
    }

    public static a b() {
        return new a();
    }

    public static of.a c() {
        return b().b();
    }

    @Override // vf.e.c
    public void a(e.b bVar) {
        bVar.h(new qf.a(this.f18377a));
    }
}
