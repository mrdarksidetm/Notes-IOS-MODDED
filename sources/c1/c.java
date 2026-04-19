package c1;

import ae.r;
import ae.s;
import c1.g;
import java.util.Arrays;
import t0.k2;

/* JADX INFO: loaded from: classes.dex */
final class c<T> implements l, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j<T, Object> f6265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f6266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f6268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f6269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g.a f6270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zd.a<Object> f6271g = new a(this);

    static final class a extends s implements zd.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c<T> f6272a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<T> cVar) {
            super(0);
            this.f6272a = cVar;
        }

        @Override // zd.a
        public final Object invoke() {
            j jVar = ((c) this.f6272a).f6265a;
            c<T> cVar = this.f6272a;
            Object obj = ((c) cVar).f6268d;
            if (obj != null) {
                return jVar.a(cVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized".toString());
        }
    }

    public c(j<T, Object> jVar, g gVar, String str, T t10, Object[] objArr) {
        this.f6265a = jVar;
        this.f6266b = gVar;
        this.f6267c = str;
        this.f6268d = t10;
        this.f6269e = objArr;
    }

    private final void h() {
        g gVar = this.f6266b;
        if (this.f6270f == null) {
            if (gVar != null) {
                b.c(gVar, this.f6271g.invoke());
                this.f6270f = gVar.d(this.f6267c, this.f6271g);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f6270f + ") is not null").toString());
    }

    @Override // c1.l
    public boolean a(Object obj) {
        g gVar = this.f6266b;
        return gVar == null || gVar.a(obj);
    }

    @Override // t0.k2
    public void b() {
        g.a aVar = this.f6270f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // t0.k2
    public void c() {
        g.a aVar = this.f6270f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // t0.k2
    public void d() {
        h();
    }

    public final T g(Object[] objArr) {
        if (Arrays.equals(objArr, this.f6269e)) {
            return this.f6268d;
        }
        return null;
    }

    public final void i(j<T, Object> jVar, g gVar, String str, T t10, Object[] objArr) {
        boolean z10;
        boolean z11 = true;
        if (this.f6266b != gVar) {
            this.f6266b = gVar;
            z10 = true;
        } else {
            z10 = false;
        }
        if (r.b(this.f6267c, str)) {
            z11 = z10;
        } else {
            this.f6267c = str;
        }
        this.f6265a = jVar;
        this.f6268d = t10;
        this.f6269e = objArr;
        g.a aVar = this.f6270f;
        if (aVar == null || !z11) {
            return;
        }
        if (aVar != null) {
            aVar.a();
        }
        this.f6270f = null;
        h();
    }
}
