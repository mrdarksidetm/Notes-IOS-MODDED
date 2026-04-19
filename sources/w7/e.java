package w7;

import android.content.Context;
import d8.w;
import d8.x;
import e8.m0;
import e8.n0;
import e8.u0;
import java.util.concurrent.Executor;
import w7.u;

/* JADX INFO: loaded from: classes.dex */
final class e extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ld.a<Executor> f22554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ld.a<Context> f22555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ld.a f22556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ld.a f22557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ld.a f22558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ld.a<String> f22559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ld.a<m0> f22560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ld.a<d8.f> f22561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ld.a<x> f22562i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ld.a<c8.c> f22563j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ld.a<d8.r> f22564k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ld.a<d8.v> f22565l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ld.a<t> f22566m;

    private static final class b implements u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f22567a;

        private b() {
        }

        @Override // w7.u.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(Context context) {
            this.f22567a = (Context) y7.d.b(context);
            return this;
        }

        @Override // w7.u.a
        public u build() {
            y7.d.a(this.f22567a, Context.class);
            return new e(this.f22567a);
        }
    }

    private e(Context context) {
        o(context);
    }

    public static u.a l() {
        return new b();
    }

    private void o(Context context) {
        this.f22554a = y7.a.a(k.a());
        y7.b bVarA = y7.c.a(context);
        this.f22555b = bVarA;
        x7.j jVarA = x7.j.a(bVarA, g8.c.a(), g8.d.a());
        this.f22556c = jVarA;
        this.f22557d = y7.a.a(x7.l.a(this.f22555b, jVarA));
        this.f22558e = u0.a(this.f22555b, e8.g.a(), e8.i.a());
        this.f22559f = y7.a.a(e8.h.a(this.f22555b));
        this.f22560g = y7.a.a(n0.a(g8.c.a(), g8.d.a(), e8.j.a(), this.f22558e, this.f22559f));
        c8.g gVarB = c8.g.b(g8.c.a());
        this.f22561h = gVarB;
        c8.i iVarA = c8.i.a(this.f22555b, this.f22560g, gVarB, g8.d.a());
        this.f22562i = iVarA;
        ld.a<Executor> aVar = this.f22554a;
        ld.a aVar2 = this.f22557d;
        ld.a<m0> aVar3 = this.f22560g;
        this.f22563j = c8.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        ld.a<Context> aVar4 = this.f22555b;
        ld.a aVar5 = this.f22557d;
        ld.a<m0> aVar6 = this.f22560g;
        this.f22564k = d8.s.a(aVar4, aVar5, aVar6, this.f22562i, this.f22554a, aVar6, g8.c.a(), g8.d.a(), this.f22560g);
        ld.a<Executor> aVar7 = this.f22554a;
        ld.a<m0> aVar8 = this.f22560g;
        this.f22565l = w.a(aVar7, aVar8, this.f22562i, aVar8);
        this.f22566m = y7.a.a(v.a(g8.c.a(), g8.d.a(), this.f22563j, this.f22564k, this.f22565l));
    }

    @Override // w7.u
    e8.d a() {
        return this.f22560g.get();
    }

    @Override // w7.u
    t b() {
        return this.f22566m.get();
    }
}
