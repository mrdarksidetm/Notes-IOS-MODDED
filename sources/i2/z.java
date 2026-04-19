package i2;

import i2.d;
import i2.e0;
import java.util.ArrayList;
import java.util.List;
import k1.f;
import l1.j0;
import l1.s1;
import n2.i0;
import q2.d;
import q2.e;
import u2.a;
import u2.j;
import u2.n;
import u2.o;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c1.j<i2.d, Object> f12429a = c1.k.a(a.f12448a, b.f12450a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c1.j<List<d.b<? extends Object>>, Object> f12430b = c1.k.a(c.f12452a, d.f12454a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c1.j<d.b<? extends Object>, Object> f12431c = c1.k.a(e.f12456a, f.f12459a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c1.j<i2.k0, Object> f12432d = c1.k.a(l0.f12473a, m0.f12475a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c1.j<i2.j0, Object> f12433e = c1.k.a(j0.f12469a, k0.f12471a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c1.j<i2.s, Object> f12434f = c1.k.a(t.f12483a, u.f12484a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final c1.j<i2.a0, Object> f12435g = c1.k.a(x.f12487a, y.f12488a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final c1.j<u2.j, Object> f12436h = c1.k.a(C0298z.f12489a, a0.f12449a);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final c1.j<u2.n, Object> f12437i = c1.k.a(b0.f12451a, c0.f12453a);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final c1.j<u2.o, Object> f12438j = c1.k.a(d0.f12455a, e0.f12458a);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final c1.j<n2.i0, Object> f12439k = c1.k.a(k.f12470a, l.f12472a);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final c1.j<u2.a, Object> f12440l = c1.k.a(g.f12462a, h.f12464a);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final c1.j<i2.e0, Object> f12441m = c1.k.a(f0.f12461a, g0.f12463a);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final c1.j<s1, Object> f12442n = c1.k.a(v.f12485a, w.f12486a);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final i2.l<l1.j0, Object> f12443o = a(i.f12466a, j.f12468a);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final i2.l<w2.t, Object> f12444p = a(h0.f12465a, i0.f12467a);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final i2.l<k1.f, Object> f12445q = a(r.f12481a, s.f12482a);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final c1.j<q2.e, Object> f12446r = c1.k.a(m.f12474a, n.f12476a);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final c1.j<q2.d, Object> f12447s = c1.k.a(o.f12477a, p.f12478a);

    static final class a extends ae.s implements zd.p<c1.l, i2.d, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12448a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, i2.d dVar) {
            return nd.u.g(z.u(dVar.j()), z.v(dVar.f(), z.f12430b, lVar), z.v(dVar.d(), z.f12430b, lVar), z.v(dVar.b(), z.f12430b, lVar));
        }
    }

    static final class a0 extends ae.s implements zd.l<Object, u2.j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a0 f12449a = new a0();

        a0() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u2.j invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.Int");
            return new u2.j(((Integer) obj).intValue());
        }
    }

    static final class b extends ae.s implements zd.l<Object, i2.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12450a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2.d invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(1);
            c1.j jVar = z.f12430b;
            Boolean bool = Boolean.FALSE;
            List list2 = null;
            List list3 = ((!ae.r.b(obj2, bool) || (jVar instanceof i2.l)) && obj2 != null) ? (List) jVar.b(obj2) : null;
            Object obj3 = list.get(2);
            c1.j jVar2 = z.f12430b;
            List list4 = ((!ae.r.b(obj3, bool) || (jVar2 instanceof i2.l)) && obj3 != null) ? (List) jVar2.b(obj3) : null;
            Object obj4 = list.get(0);
            String str = obj4 != null ? (String) obj4 : null;
            ae.r.c(str);
            if (list3 == null || list3.isEmpty()) {
                list3 = null;
            }
            if (list4 == null || list4.isEmpty()) {
                list4 = null;
            }
            Object obj5 = list.get(3);
            c1.j jVar3 = z.f12430b;
            if ((!ae.r.b(obj5, bool) || (jVar3 instanceof i2.l)) && obj5 != null) {
                list2 = (List) jVar3.b(obj5);
            }
            return new i2.d(str, list3, list4, list2);
        }
    }

    static final class b0 extends ae.s implements zd.p<c1.l, u2.n, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b0 f12451a = new b0();

        b0() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, u2.n nVar) {
            return nd.u.g(Float.valueOf(nVar.b()), Float.valueOf(nVar.c()));
        }
    }

    static final class c extends ae.s implements zd.p<c1.l, List<? extends d.b<? extends Object>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f12452a = new c();

        c() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, List<? extends d.b<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(z.v(list.get(i10), z.f12431c, lVar));
            }
            return arrayList;
        }
    }

    static final class c0 extends ae.s implements zd.l<Object, u2.n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c0 f12453a = new c0();

        c0() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u2.n invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new u2.n(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    }

    static final class d extends ae.s implements zd.l<Object, List<? extends d.b<? extends Object>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f12454a = new d();

        d() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<d.b<? extends Object>> invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                c1.j jVar = z.f12431c;
                d.b bVar = null;
                if ((!ae.r.b(obj2, Boolean.FALSE) || (jVar instanceof i2.l)) && obj2 != null) {
                    bVar = (d.b) jVar.b(obj2);
                }
                ae.r.c(bVar);
                arrayList.add(bVar);
            }
            return arrayList;
        }
    }

    static final class d0 extends ae.s implements zd.p<c1.l, u2.o, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d0 f12455a = new d0();

        d0() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, u2.o oVar) {
            w2.t tVarB = w2.t.b(oVar.b());
            t.a aVar = w2.t.f22428b;
            return nd.u.g(z.v(tVarB, z.s(aVar), lVar), z.v(w2.t.b(oVar.c()), z.s(aVar), lVar));
        }
    }

    static final class e extends ae.s implements zd.p<c1.l, d.b<? extends Object>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f12456a = new e();

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12457a;

            static {
                int[] iArr = new int[i2.f.values().length];
                try {
                    iArr[i2.f.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i2.f.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i2.f.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i2.f.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i2.f.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f12457a = iArr;
            }
        }

        e() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, d.b<? extends Object> bVar) {
            Object obj;
            c1.j jVarG;
            Object objV;
            Object objE = bVar.e();
            i2.f fVar = objE instanceof i2.s ? i2.f.Paragraph : objE instanceof i2.a0 ? i2.f.Span : objE instanceof i2.k0 ? i2.f.VerbatimTts : objE instanceof i2.j0 ? i2.f.Url : i2.f.String;
            int i10 = a.f12457a[fVar.ordinal()];
            if (i10 == 1) {
                Object objE2 = bVar.e();
                ae.r.d(objE2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                obj = (i2.s) objE2;
                jVarG = z.g();
            } else if (i10 == 2) {
                Object objE3 = bVar.e();
                ae.r.d(objE3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                obj = (i2.a0) objE3;
                jVarG = z.t();
            } else if (i10 == 3) {
                Object objE4 = bVar.e();
                ae.r.d(objE4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                obj = (i2.k0) objE4;
                jVarG = z.f12432d;
            } else {
                if (i10 != 4) {
                    if (i10 != 5) {
                        throw new md.q();
                    }
                    objV = z.u(bVar.e());
                    return nd.u.g(z.u(fVar), objV, z.u(Integer.valueOf(bVar.f())), z.u(Integer.valueOf(bVar.d())), z.u(bVar.g()));
                }
                Object objE5 = bVar.e();
                ae.r.d(objE5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                obj = (i2.j0) objE5;
                jVarG = z.f12433e;
            }
            objV = z.v(obj, jVarG, lVar);
            return nd.u.g(z.u(fVar), objV, z.u(Integer.valueOf(bVar.f())), z.u(Integer.valueOf(bVar.d())), z.u(bVar.g()));
        }
    }

    static final class e0 extends ae.s implements zd.l<Object, u2.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e0 f12458a = new e0();

        e0() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u2.o invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            t.a aVar = w2.t.f22428b;
            c1.j<w2.t, Object> jVarS = z.s(aVar);
            Boolean bool = Boolean.FALSE;
            w2.t tVarB = null;
            w2.t tVarB2 = ((!ae.r.b(obj2, bool) || (jVarS instanceof i2.l)) && obj2 != null) ? jVarS.b(obj2) : null;
            ae.r.c(tVarB2);
            long jK = tVarB2.k();
            Object obj3 = list.get(1);
            c1.j<w2.t, Object> jVarS2 = z.s(aVar);
            if ((!ae.r.b(obj3, bool) || (jVarS2 instanceof i2.l)) && obj3 != null) {
                tVarB = jVarS2.b(obj3);
            }
            ae.r.c(tVarB);
            return new u2.o(jK, tVarB.k(), null);
        }
    }

    static final class f extends ae.s implements zd.l<Object, d.b<? extends Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f12459a = new f();

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12460a;

            static {
                int[] iArr = new int[i2.f.values().length];
                try {
                    iArr[i2.f.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i2.f.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i2.f.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i2.f.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i2.f.String.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f12460a = iArr;
            }
        }

        f() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d.b<? extends Object> invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            i2.f fVar = obj2 != null ? (i2.f) obj2 : null;
            ae.r.c(fVar);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            ae.r.c(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            ae.r.c(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            ae.r.c(str);
            int i10 = a.f12460a[fVar.ordinal()];
            if (i10 == 1) {
                Object obj6 = list.get(1);
                c1.j<i2.s, Object> jVarG = z.g();
                if ((!ae.r.b(obj6, Boolean.FALSE) || (jVarG instanceof i2.l)) && obj6 != null) {
                    sVarB = jVarG.b(obj6);
                }
                ae.r.c(sVarB);
                return new d.b<>(sVarB, iIntValue, iIntValue2, str);
            }
            if (i10 == 2) {
                Object obj7 = list.get(1);
                c1.j<i2.a0, Object> jVarT = z.t();
                if ((!ae.r.b(obj7, Boolean.FALSE) || (jVarT instanceof i2.l)) && obj7 != null) {
                    sVarB = jVarT.b(obj7);
                }
                ae.r.c(sVarB);
                return new d.b<>(sVarB, iIntValue, iIntValue2, str);
            }
            if (i10 == 3) {
                Object obj8 = list.get(1);
                c1.j jVar = z.f12432d;
                if ((!ae.r.b(obj8, Boolean.FALSE) || (jVar instanceof i2.l)) && obj8 != null) {
                    sVarB = (i2.k0) jVar.b(obj8);
                }
                ae.r.c(sVarB);
                return new d.b<>(sVarB, iIntValue, iIntValue2, str);
            }
            if (i10 != 4) {
                if (i10 != 5) {
                    throw new md.q();
                }
                Object obj9 = list.get(1);
                sVarB = obj9 != null ? (String) obj9 : null;
                ae.r.c(sVarB);
                return new d.b<>(sVarB, iIntValue, iIntValue2, str);
            }
            Object obj10 = list.get(1);
            c1.j jVar2 = z.f12433e;
            if ((!ae.r.b(obj10, Boolean.FALSE) || (jVar2 instanceof i2.l)) && obj10 != null) {
                sVarB = (i2.j0) jVar2.b(obj10);
            }
            ae.r.c(sVarB);
            return new d.b<>(sVarB, iIntValue, iIntValue2, str);
        }
    }

    static final class f0 extends ae.s implements zd.p<c1.l, i2.e0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f0 f12461a = new f0();

        f0() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(c1.l lVar, long j10) {
            return nd.u.g(z.u(Integer.valueOf(i2.e0.k(j10))), z.u(Integer.valueOf(i2.e0.g(j10))));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(c1.l lVar, i2.e0 e0Var) {
            return a(lVar, e0Var.n());
        }
    }

    static final class g extends ae.s implements zd.p<c1.l, u2.a, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f12462a = new g();

        g() {
            super(2);
        }

        public final Object a(c1.l lVar, float f10) {
            return Float.valueOf(f10);
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(c1.l lVar, u2.a aVar) {
            return a(lVar, aVar.h());
        }
    }

    static final class g0 extends ae.s implements zd.l<Object, i2.e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g0 f12463a = new g0();

        g0() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2.e0 invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            ae.r.c(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            ae.r.c(num2);
            return i2.e0.b(i2.f0.b(iIntValue, num2.intValue()));
        }
    }

    static final class h extends ae.s implements zd.l<Object, u2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f12464a = new h();

        h() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u2.a invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.Float");
            return u2.a.b(u2.a.c(((Float) obj).floatValue()));
        }
    }

    static final class h0 extends ae.s implements zd.p<c1.l, w2.t, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h0 f12465a = new h0();

        h0() {
            super(2);
        }

        public final Object a(c1.l lVar, long j10) {
            return w2.t.e(j10, w2.t.f22428b.a()) ? Boolean.FALSE : nd.u.g(z.u(Float.valueOf(w2.t.h(j10))), z.u(w2.v.d(w2.t.g(j10))));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(c1.l lVar, w2.t tVar) {
            return a(lVar, tVar.k());
        }
    }

    static final class i extends ae.s implements zd.p<c1.l, l1.j0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f12466a = new i();

        i() {
            super(2);
        }

        public final Object a(c1.l lVar, long j10) {
            return (j10 > l1.j0.f14524b.j() ? 1 : (j10 == l1.j0.f14524b.j() ? 0 : -1)) == 0 ? Boolean.FALSE : Integer.valueOf(l1.l0.i(j10));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(c1.l lVar, l1.j0 j0Var) {
            return a(lVar, j0Var.E());
        }
    }

    static final class i0 extends ae.s implements zd.l<Object, w2.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i0 f12467a = new i0();

        i0() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w2.t invoke(Object obj) {
            long jA;
            if (ae.r.b(obj, Boolean.FALSE)) {
                jA = w2.t.f22428b.a();
            } else {
                ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f10 = obj2 != null ? (Float) obj2 : null;
                ae.r.c(f10);
                float fFloatValue = f10.floatValue();
                Object obj3 = list.get(1);
                w2.v vVar = obj3 != null ? (w2.v) obj3 : null;
                ae.r.c(vVar);
                jA = w2.u.a(fFloatValue, vVar.j());
            }
            return w2.t.b(jA);
        }
    }

    static final class j extends ae.s implements zd.l<Object, l1.j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f12468a = new j();

        j() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final l1.j0 invoke(Object obj) {
            long jB;
            if (ae.r.b(obj, Boolean.FALSE)) {
                jB = l1.j0.f14524b.j();
            } else {
                ae.r.d(obj, "null cannot be cast to non-null type kotlin.Int");
                jB = l1.l0.b(((Integer) obj).intValue());
            }
            return l1.j0.m(jB);
        }
    }

    static final class j0 extends ae.s implements zd.p<c1.l, i2.j0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j0 f12469a = new j0();

        j0() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, i2.j0 j0Var) {
            return z.u(j0Var.a());
        }
    }

    static final class k extends ae.s implements zd.p<c1.l, n2.i0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f12470a = new k();

        k() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, n2.i0 i0Var) {
            return Integer.valueOf(i0Var.t());
        }
    }

    static final class k0 extends ae.s implements zd.l<Object, i2.j0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k0 f12471a = new k0();

        k0() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2.j0 invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            ae.r.c(str);
            return new i2.j0(str);
        }
    }

    static final class l extends ae.s implements zd.l<Object, n2.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f12472a = new l();

        l() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n2.i0 invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.Int");
            return new n2.i0(((Integer) obj).intValue());
        }
    }

    static final class l0 extends ae.s implements zd.p<c1.l, i2.k0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l0 f12473a = new l0();

        l0() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, i2.k0 k0Var) {
            return z.u(k0Var.a());
        }
    }

    static final class m extends ae.s implements zd.p<c1.l, q2.e, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f12474a = new m();

        m() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, q2.e eVar) {
            List<q2.d> listF = eVar.f();
            ArrayList arrayList = new ArrayList(listF.size());
            int size = listF.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(z.v(listF.get(i10), z.m(q2.d.f18972b), lVar));
            }
            return arrayList;
        }
    }

    static final class m0 extends ae.s implements zd.l<Object, i2.k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m0 f12475a = new m0();

        m0() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2.k0 invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            ae.r.c(str);
            return new i2.k0(str);
        }
    }

    static final class n extends ae.s implements zd.l<Object, q2.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f12476a = new n();

        n() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q2.e invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                c1.j<q2.d, Object> jVarM = z.m(q2.d.f18972b);
                q2.d dVarB = null;
                if ((!ae.r.b(obj2, Boolean.FALSE) || (jVarM instanceof i2.l)) && obj2 != null) {
                    dVarB = jVarM.b(obj2);
                }
                ae.r.c(dVarB);
                arrayList.add(dVarB);
            }
            return new q2.e(arrayList);
        }
    }

    static final class o extends ae.s implements zd.p<c1.l, q2.d, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f12477a = new o();

        o() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, q2.d dVar) {
            return dVar.b();
        }
    }

    static final class p extends ae.s implements zd.l<Object, q2.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f12478a = new p();

        p() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final q2.d invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.String");
            return new q2.d((String) obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    public static final class q<Original, Saveable> implements i2.l<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ zd.p<c1.l, Original, Saveable> f12479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Saveable, Original> f12480b;

        /* JADX WARN: Multi-variable type inference failed */
        q(zd.p<? super c1.l, ? super Original, ? extends Saveable> pVar, zd.l<? super Saveable, ? extends Original> lVar) {
            this.f12479a = pVar;
            this.f12480b = lVar;
        }

        @Override // c1.j
        public Saveable a(c1.l lVar, Original original) {
            return this.f12479a.invoke(lVar, original);
        }

        @Override // c1.j
        public Original b(Saveable saveable) {
            return this.f12480b.invoke(saveable);
        }
    }

    static final class r extends ae.s implements zd.p<c1.l, k1.f, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final r f12481a = new r();

        r() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(c1.l lVar, long j10) {
            return k1.f.l(j10, k1.f.f14338b.b()) ? Boolean.FALSE : nd.u.g(z.u(Float.valueOf(k1.f.o(j10))), z.u(Float.valueOf(k1.f.p(j10))));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Object invoke(c1.l lVar, k1.f fVar) {
            return a(lVar, fVar.x());
        }
    }

    static final class s extends ae.s implements zd.l<Object, k1.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f12482a = new s();

        s() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1.f invoke(Object obj) {
            long jA;
            if (ae.r.b(obj, Boolean.FALSE)) {
                jA = k1.f.f14338b.b();
            } else {
                ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f10 = obj2 != null ? (Float) obj2 : null;
                ae.r.c(f10);
                float fFloatValue = f10.floatValue();
                Object obj3 = list.get(1);
                Float f11 = obj3 != null ? (Float) obj3 : null;
                ae.r.c(f11);
                jA = k1.g.a(fFloatValue, f11.floatValue());
            }
            return k1.f.d(jA);
        }
    }

    static final class t extends ae.s implements zd.p<c1.l, i2.s, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f12483a = new t();

        t() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, i2.s sVar) {
            return nd.u.g(z.u(u2.i.h(sVar.h())), z.u(u2.k.g(sVar.i())), z.v(w2.t.b(sVar.e()), z.s(w2.t.f22428b), lVar), z.v(sVar.j(), z.r(u2.o.f21591c), lVar));
        }
    }

    static final class u extends ae.s implements zd.l<Object, i2.s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u f12484a = new u();

        u() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2.s invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            u2.i iVar = obj2 != null ? (u2.i) obj2 : null;
            ae.r.c(iVar);
            int iN = iVar.n();
            Object obj3 = list.get(1);
            u2.k kVar = obj3 != null ? (u2.k) obj3 : null;
            ae.r.c(kVar);
            int iM = kVar.m();
            Object obj4 = list.get(2);
            c1.j<w2.t, Object> jVarS = z.s(w2.t.f22428b);
            Boolean bool = Boolean.FALSE;
            w2.t tVarB = ((!ae.r.b(obj4, bool) || (jVarS instanceof i2.l)) && obj4 != null) ? jVarS.b(obj4) : null;
            ae.r.c(tVarB);
            long jK = tVarB.k();
            Object obj5 = list.get(3);
            c1.j<u2.o, Object> jVarR = z.r(u2.o.f21591c);
            return new i2.s(iN, iM, jK, ((!ae.r.b(obj5, bool) || (jVarR instanceof i2.l)) && obj5 != null) ? jVarR.b(obj5) : null, null, null, 0, 0, null, 496, null);
        }
    }

    static final class v extends ae.s implements zd.p<c1.l, s1, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f12485a = new v();

        v() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, s1 s1Var) {
            return nd.u.g(z.v(l1.j0.m(s1Var.c()), z.j(l1.j0.f14524b), lVar), z.v(k1.f.d(s1Var.d()), z.i(k1.f.f14338b), lVar), z.u(Float.valueOf(s1Var.b())));
        }
    }

    static final class w extends ae.s implements zd.l<Object, s1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f12486a = new w();

        w() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s1 invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            c1.j<l1.j0, Object> jVarJ = z.j(l1.j0.f14524b);
            Boolean bool = Boolean.FALSE;
            l1.j0 j0VarB = ((!ae.r.b(obj2, bool) || (jVarJ instanceof i2.l)) && obj2 != null) ? jVarJ.b(obj2) : null;
            ae.r.c(j0VarB);
            long jE = j0VarB.E();
            Object obj3 = list.get(1);
            c1.j<k1.f, Object> jVarI = z.i(k1.f.f14338b);
            k1.f fVarB = ((!ae.r.b(obj3, bool) || (jVarI instanceof i2.l)) && obj3 != null) ? jVarI.b(obj3) : null;
            ae.r.c(fVarB);
            long jX = fVarB.x();
            Object obj4 = list.get(2);
            Float f10 = obj4 != null ? (Float) obj4 : null;
            ae.r.c(f10);
            return new s1(jE, jX, f10.floatValue(), null);
        }
    }

    static final class x extends ae.s implements zd.p<c1.l, i2.a0, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f12487a = new x();

        x() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, i2.a0 a0Var) {
            l1.j0 j0VarM = l1.j0.m(a0Var.g());
            j0.a aVar = l1.j0.f14524b;
            w2.t tVarB = w2.t.b(a0Var.k());
            t.a aVar2 = w2.t.f22428b;
            return nd.u.g(z.v(j0VarM, z.j(aVar), lVar), z.v(tVarB, z.s(aVar2), lVar), z.v(a0Var.n(), z.l(n2.i0.f15808b), lVar), z.u(a0Var.l()), z.u(a0Var.m()), z.u(-1), z.u(a0Var.j()), z.v(w2.t.b(a0Var.o()), z.s(aVar2), lVar), z.v(a0Var.e(), z.o(u2.a.f21511b), lVar), z.v(a0Var.u(), z.q(u2.n.f21587c), lVar), z.v(a0Var.p(), z.n(q2.e.f18974c), lVar), z.v(l1.j0.m(a0Var.d()), z.j(aVar), lVar), z.v(a0Var.s(), z.p(u2.j.f21569b), lVar), z.v(a0Var.r(), z.k(s1.f14570d), lVar));
        }
    }

    static final class y extends ae.s implements zd.l<Object, i2.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y f12488a = new y();

        y() {
            super(1);
        }

        @Override // zd.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i2.a0 invoke(Object obj) {
            ae.r.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            j0.a aVar = l1.j0.f14524b;
            c1.j<l1.j0, Object> jVarJ = z.j(aVar);
            Boolean bool = Boolean.FALSE;
            l1.j0 j0VarB = ((!ae.r.b(obj2, bool) || (jVarJ instanceof i2.l)) && obj2 != null) ? jVarJ.b(obj2) : null;
            ae.r.c(j0VarB);
            long jE = j0VarB.E();
            Object obj3 = list.get(1);
            t.a aVar2 = w2.t.f22428b;
            c1.j<w2.t, Object> jVarS = z.s(aVar2);
            w2.t tVarB = ((!ae.r.b(obj3, bool) || (jVarS instanceof i2.l)) && obj3 != null) ? jVarS.b(obj3) : null;
            ae.r.c(tVarB);
            long jK = tVarB.k();
            Object obj4 = list.get(2);
            c1.j<n2.i0, Object> jVarL = z.l(n2.i0.f15808b);
            n2.i0 i0VarB = ((!ae.r.b(obj4, bool) || (jVarL instanceof i2.l)) && obj4 != null) ? jVarL.b(obj4) : null;
            Object obj5 = list.get(3);
            n2.e0 e0Var = obj5 != null ? (n2.e0) obj5 : null;
            Object obj6 = list.get(4);
            n2.f0 f0Var = obj6 != null ? (n2.f0) obj6 : null;
            n2.t tVar = null;
            Object obj7 = list.get(6);
            String str = obj7 != null ? (String) obj7 : null;
            Object obj8 = list.get(7);
            c1.j<w2.t, Object> jVarS2 = z.s(aVar2);
            w2.t tVarB2 = ((!ae.r.b(obj8, bool) || (jVarS2 instanceof i2.l)) && obj8 != null) ? jVarS2.b(obj8) : null;
            ae.r.c(tVarB2);
            long jK2 = tVarB2.k();
            Object obj9 = list.get(8);
            c1.j<u2.a, Object> jVarO = z.o(u2.a.f21511b);
            u2.a aVarB = ((!ae.r.b(obj9, bool) || (jVarO instanceof i2.l)) && obj9 != null) ? jVarO.b(obj9) : null;
            Object obj10 = list.get(9);
            c1.j<u2.n, Object> jVarQ = z.q(u2.n.f21587c);
            u2.n nVarB = ((!ae.r.b(obj10, bool) || (jVarQ instanceof i2.l)) && obj10 != null) ? jVarQ.b(obj10) : null;
            Object obj11 = list.get(10);
            c1.j<q2.e, Object> jVarN = z.n(q2.e.f18974c);
            q2.e eVarB = ((!ae.r.b(obj11, bool) || (jVarN instanceof i2.l)) && obj11 != null) ? jVarN.b(obj11) : null;
            Object obj12 = list.get(11);
            c1.j<l1.j0, Object> jVarJ2 = z.j(aVar);
            l1.j0 j0VarB2 = ((!ae.r.b(obj12, bool) || (jVarJ2 instanceof i2.l)) && obj12 != null) ? jVarJ2.b(obj12) : null;
            ae.r.c(j0VarB2);
            long jE2 = j0VarB2.E();
            Object obj13 = list.get(12);
            c1.j<u2.j, Object> jVarP = z.p(u2.j.f21569b);
            u2.j jVarB = ((!ae.r.b(obj13, bool) || (jVarP instanceof i2.l)) && obj13 != null) ? jVarP.b(obj13) : null;
            Object obj14 = list.get(13);
            c1.j<s1, Object> jVarK = z.k(s1.f14570d);
            return new i2.a0(jE, jK, i0VarB, e0Var, f0Var, tVar, str, jK2, aVarB, nVarB, eVarB, jE2, jVarB, ((!ae.r.b(obj14, bool) || (jVarK instanceof i2.l)) && obj14 != null) ? jVarK.b(obj14) : null, (i2.x) null, (n1.g) null, 49184, (ae.j) null);
        }
    }

    /* JADX INFO: renamed from: i2.z$z, reason: collision with other inner class name */
    static final class C0298z extends ae.s implements zd.p<c1.l, u2.j, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0298z f12489a = new C0298z();

        C0298z() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(c1.l lVar, u2.j jVar) {
            return Integer.valueOf(jVar.e());
        }
    }

    private static final <Original, Saveable> i2.l<Original, Saveable> a(zd.p<? super c1.l, ? super Original, ? extends Saveable> pVar, zd.l<? super Saveable, ? extends Original> lVar) {
        return new q(pVar, lVar);
    }

    public static final c1.j<i2.d, Object> f() {
        return f12429a;
    }

    public static final c1.j<i2.s, Object> g() {
        return f12434f;
    }

    public static final c1.j<i2.e0, Object> h(e0.a aVar) {
        return f12441m;
    }

    public static final c1.j<k1.f, Object> i(f.a aVar) {
        return f12445q;
    }

    public static final c1.j<l1.j0, Object> j(j0.a aVar) {
        return f12443o;
    }

    public static final c1.j<s1, Object> k(s1.a aVar) {
        return f12442n;
    }

    public static final c1.j<n2.i0, Object> l(i0.a aVar) {
        return f12439k;
    }

    public static final c1.j<q2.d, Object> m(d.a aVar) {
        return f12447s;
    }

    public static final c1.j<q2.e, Object> n(e.a aVar) {
        return f12446r;
    }

    public static final c1.j<u2.a, Object> o(a.C0439a c0439a) {
        return f12440l;
    }

    public static final c1.j<u2.j, Object> p(j.a aVar) {
        return f12436h;
    }

    public static final c1.j<u2.n, Object> q(n.a aVar) {
        return f12437i;
    }

    public static final c1.j<u2.o, Object> r(o.a aVar) {
        return f12438j;
    }

    public static final c1.j<w2.t, Object> s(t.a aVar) {
        return f12444p;
    }

    public static final c1.j<i2.a0, Object> t() {
        return f12435g;
    }

    public static final <T> T u(T t10) {
        return t10;
    }

    public static final <T extends c1.j<Original, Saveable>, Original, Saveable> Object v(Original original, T t10, c1.l lVar) {
        Object objA;
        return (original == null || (objA = t10.a(lVar, original)) == null) ? Boolean.FALSE : objA;
    }
}
