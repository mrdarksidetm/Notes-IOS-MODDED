package i6;

import ae.s;
import md.l;
import md.n;
import md.p;
import o6.j;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f12561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f12562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Headers f12566f;

    /* JADX INFO: renamed from: i6.a$a, reason: collision with other inner class name */
    static final class C0300a extends s implements zd.a<CacheControl> {
        C0300a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CacheControl invoke() {
            return CacheControl.f16659n.b(a.this.d());
        }
    }

    static final class b extends s implements zd.a<MediaType> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaType invoke() {
            String strA = a.this.d().a("Content-Type");
            if (strA != null) {
                return MediaType.f16856e.b(strA);
            }
            return null;
        }
    }

    public a(hf.e eVar) {
        p pVar = p.f15571c;
        this.f12561a = n.a(pVar, new C0300a());
        this.f12562b = n.a(pVar, new b());
        this.f12563c = Long.parseLong(eVar.J());
        this.f12564d = Long.parseLong(eVar.J());
        this.f12565e = Integer.parseInt(eVar.J()) > 0;
        int i10 = Integer.parseInt(eVar.J());
        Headers.Builder builder = new Headers.Builder();
        for (int i11 = 0; i11 < i10; i11++) {
            j.b(builder, eVar.J());
        }
        this.f12566f = builder.e();
    }

    public a(Response response) {
        p pVar = p.f15571c;
        this.f12561a = n.a(pVar, new C0300a());
        this.f12562b = n.a(pVar, new b());
        this.f12563c = response.Z();
        this.f12564d = response.U();
        this.f12565e = response.A() != null;
        this.f12566f = response.G();
    }

    public final CacheControl a() {
        return (CacheControl) this.f12561a.getValue();
    }

    public final MediaType b() {
        return (MediaType) this.f12562b.getValue();
    }

    public final long c() {
        return this.f12564d;
    }

    public final Headers d() {
        return this.f12566f;
    }

    public final long e() {
        return this.f12563c;
    }

    public final boolean f() {
        return this.f12565e;
    }

    public final void g(hf.d dVar) {
        dVar.c0(this.f12563c).writeByte(10);
        dVar.c0(this.f12564d).writeByte(10);
        dVar.c0(this.f12565e ? 1L : 0L).writeByte(10);
        dVar.c0(this.f12566f.size()).writeByte(10);
        int size = this.f12566f.size();
        for (int i10 = 0; i10 < size; i10++) {
            dVar.z(this.f12566f.f(i10)).z(": ").z(this.f12566f.n(i10)).writeByte(10);
        }
    }
}
