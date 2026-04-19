package rf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rf.c;
import rf.i;
import rf.j;
import rf.k;
import rf.l;
import rf.q;
import rf.u;
import uf.b0;
import uf.v;
import uf.x;

/* JADX INFO: loaded from: classes2.dex */
public class h implements wf.h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Set<Class<? extends uf.a>> f19496r = new LinkedHashSet(Arrays.asList(uf.b.class, uf.j.class, uf.h.class, uf.k.class, b0.class, uf.q.class, uf.n.class));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map<Class<? extends uf.a>, wf.e> f19497s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private vf.g f19498a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19502e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19506i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<wf.e> f19507j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final vf.d f19508k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<xf.a> f19509l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final vf.a f19510m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final g f19511n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19499b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f19500c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19501d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19503f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19504g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19505h = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p f19512o = new p();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final List<b> f19513p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<wf.d> f19514q = new ArrayList();

    private static class a implements wf.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wf.d f19515a;

        public a(wf.d dVar) {
            this.f19515a = dVar;
        }

        @Override // wf.g
        public wf.d a() {
            return this.f19515a;
        }

        @Override // wf.g
        public vf.h b() {
            wf.d dVar = this.f19515a;
            return dVar instanceof s ? ((s) dVar).k() : vf.h.b();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final wf.d f19516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f19517b;

        b(wf.d dVar, int i10) {
            this.f19516a = dVar;
            this.f19517b = i10;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(uf.b.class, new c.a());
        map.put(uf.j.class, new j.a());
        map.put(uf.h.class, new i.a());
        map.put(uf.k.class, new k.b());
        map.put(b0.class, new u.a());
        map.put(uf.q.class, new q.a());
        map.put(uf.n.class, new l.a());
        f19497s = Collections.unmodifiableMap(map);
    }

    public h(List<wf.e> list, vf.d dVar, List<xf.a> list2, vf.a aVar) {
        this.f19507j = list;
        this.f19508k = dVar;
        this.f19509l = list2;
        this.f19510m = aVar;
        g gVar = new g();
        this.f19511n = gVar;
        g(new b(gVar, 0));
    }

    private void A(int i10) {
        int i11 = this.f19503f;
        if (i10 >= i11) {
            this.f19500c = i11;
            this.f19501d = this.f19504g;
        }
        int length = this.f19498a.a().length();
        while (true) {
            int i12 = this.f19500c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                l();
            }
        }
        this.f19502e = false;
    }

    private void g(b bVar) {
        this.f19513p.add(bVar);
    }

    private void h(b bVar) {
        while (!f().h(bVar.f19516a.g())) {
            n(1);
        }
        f().g().b(bVar.f19516a.g());
        g(bVar);
    }

    private void i(s sVar) {
        for (uf.p pVar : sVar.j()) {
            sVar.g().i(pVar);
            this.f19512o.a(pVar);
        }
    }

    private void j() {
        CharSequence charSequenceA;
        if (this.f19502e) {
            CharSequence charSequenceSubSequence = this.f19498a.a().subSequence(this.f19500c + 1, this.f19498a.a().length());
            int iA = tf.f.a(this.f19501d);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence.length() + iA);
            for (int i10 = 0; i10 < iA; i10++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence);
            charSequenceA = sb2.toString();
        } else {
            charSequenceA = this.f19500c == 0 ? this.f19498a.a() : this.f19498a.a().subSequence(this.f19500c, this.f19498a.a().length());
        }
        f().i(vf.g.c(charSequenceA, this.f19510m == vf.a.BLOCKS_AND_INLINES ? x.d(this.f19499b, this.f19500c, charSequenceA.length()) : null));
        k();
    }

    private void k() {
        if (this.f19510m != vf.a.NONE) {
            for (int i10 = 1; i10 < this.f19513p.size(); i10++) {
                b bVar = this.f19513p.get(i10);
                int i11 = bVar.f19517b;
                int length = this.f19498a.a().length() - i11;
                if (length != 0) {
                    bVar.f19516a.f(x.d(this.f19499b, i11, length));
                }
            }
        }
    }

    private void l() {
        int iA;
        char cCharAt = this.f19498a.a().charAt(this.f19500c);
        this.f19500c++;
        if (cCharAt == '\t') {
            int i10 = this.f19501d;
            iA = i10 + tf.f.a(i10);
        } else {
            iA = this.f19501d + 1;
        }
        this.f19501d = iA;
    }

    public static List<wf.e> m(List<wf.e> list, Set<Class<? extends uf.a>> set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends uf.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f19497s.get(it.next()));
        }
        return arrayList;
    }

    private void n(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            wf.d dVar = o().f19516a;
            p(dVar);
            this.f19514q.add(dVar);
        }
    }

    private b o() {
        return this.f19513p.remove(r0.size() - 1);
    }

    private void p(wf.d dVar) {
        if (dVar instanceof s) {
            i((s) dVar);
        }
        dVar.b();
    }

    private uf.f q() {
        n(this.f19513p.size());
        x();
        return this.f19511n.g();
    }

    private d r(wf.d dVar) {
        a aVar = new a(dVar);
        Iterator<wf.e> it = this.f19507j.iterator();
        while (it.hasNext()) {
            wf.f fVarA = it.next().a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    private void s() {
        int i10 = this.f19500c;
        int i11 = this.f19501d;
        this.f19506i = true;
        int length = this.f19498a.a().length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = this.f19498a.a().charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f19506i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f19503f = i10;
        this.f19504g = i11;
        this.f19505h = i11 - this.f19501d;
    }

    public static Set<Class<? extends uf.a>> t() {
        return f19496r;
    }

    private void v(CharSequence charSequence) {
        d dVarR;
        y(charSequence);
        int i10 = 1;
        for (int i11 = 1; i11 < this.f19513p.size(); i11++) {
            b bVar = this.f19513p.get(i11);
            wf.d dVar = bVar.f19516a;
            s();
            wf.c cVarE = dVar.e(this);
            if (!(cVarE instanceof rf.b)) {
                break;
            }
            rf.b bVar2 = (rf.b) cVarE;
            bVar.f19517b = getIndex();
            if (bVar2.g()) {
                k();
                n(this.f19513p.size() - i11);
                return;
            }
            if (bVar2.f() != -1) {
                A(bVar2.f());
            } else if (bVar2.e() != -1) {
                z(bVar2.e());
            }
            i10++;
        }
        int size = this.f19513p.size() - i10;
        dVar = this.f19513p.get(i10 - 1).f19516a;
        int i12 = this.f19500c;
        boolean zA = (dVar.g() instanceof v) || dVar.a();
        boolean z10 = false;
        while (zA) {
            i12 = this.f19500c;
            s();
            if (b() || ((this.f19505h < tf.f.f21413a && tf.f.h(this.f19498a.a(), this.f19503f)) || (dVarR = r(dVar)) == null)) {
                A(this.f19503f);
                break;
            }
            int index = getIndex();
            if (size > 0) {
                n(size);
                size = 0;
            }
            if (dVarR.h() != -1) {
                A(dVarR.h());
            } else if (dVarR.g() != -1) {
                z(dVarR.g());
            }
            List<x> listG = dVarR.i() ? w().g() : null;
            for (wf.d dVar2 : dVarR.f()) {
                h(new b(dVar2, index));
                if (listG != null) {
                    dVar2.g().k(listG);
                }
                zA = dVar2.a();
            }
            z10 = true;
        }
        if (z10 || b() || !f().d()) {
            if (size > 0) {
                n(size);
            }
            if (dVar2.a()) {
                if (b()) {
                    k();
                    return;
                }
                h(new b(new s(), i12));
            }
        } else {
            List<b> list = this.f19513p;
            list.get(list.size() - 1).f19517b = i12;
        }
        j();
    }

    private uf.a w() {
        wf.d dVar = o().f19516a;
        if (dVar instanceof s) {
            i((s) dVar);
        }
        dVar.b();
        dVar.g().m();
        return dVar.g();
    }

    private void x() {
        vf.b bVarA = this.f19508k.a(new m(this.f19509l, this.f19512o));
        Iterator<wf.d> it = this.f19514q.iterator();
        while (it.hasNext()) {
            it.next().c(bVarA);
        }
    }

    private void y(CharSequence charSequence) {
        this.f19499b++;
        this.f19500c = 0;
        this.f19501d = 0;
        this.f19502e = false;
        CharSequence charSequenceL = tf.f.l(charSequence);
        this.f19498a = vf.g.c(charSequenceL, this.f19510m != vf.a.NONE ? x.d(this.f19499b, 0, charSequenceL.length()) : null);
    }

    private void z(int i10) {
        int i11;
        int i12 = this.f19504g;
        if (i10 >= i12) {
            this.f19500c = this.f19503f;
            this.f19501d = i12;
        }
        int length = this.f19498a.a().length();
        while (true) {
            i11 = this.f19501d;
            if (i11 >= i10 || this.f19500c == length) {
                break;
            } else {
                l();
            }
        }
        if (i11 <= i10) {
            this.f19502e = false;
            return;
        }
        this.f19500c--;
        this.f19501d = i10;
        this.f19502e = true;
    }

    @Override // wf.h
    public int a() {
        return this.f19501d;
    }

    @Override // wf.h
    public boolean b() {
        return this.f19506i;
    }

    @Override // wf.h
    public int c() {
        return this.f19505h;
    }

    @Override // wf.h
    public vf.g d() {
        return this.f19498a;
    }

    @Override // wf.h
    public int e() {
        return this.f19503f;
    }

    @Override // wf.h
    public wf.d f() {
        return this.f19513p.get(r0.size() - 1).f19516a;
    }

    @Override // wf.h
    public int getIndex() {
        return this.f19500c;
    }

    public uf.f u(String str) {
        int i10 = 0;
        while (true) {
            int iC = tf.f.c(str, i10);
            if (iC == -1) {
                break;
            }
            v(str.substring(i10, iC));
            i10 = iC + 1;
            if (i10 < str.length() && str.charAt(iC) == '\r' && str.charAt(i10) == '\n') {
                i10 = iC + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            v(str.substring(i10));
        }
        return q();
    }
}
