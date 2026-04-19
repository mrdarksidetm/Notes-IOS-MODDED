package q0;

import l1.m1;
import l1.t1;
import t0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<k0> f18784a = t0.v.e(a.f18785a);

    static final class a extends ae.s implements zd.a<k0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18785a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k0 invoke() {
            return new k0(null, null, null, null, null, 31, null);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18786a;

        static {
            int[] iArr = new int[s0.k.values().length];
            try {
                iArr[s0.k.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.k.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.k.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.k.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.k.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s0.k.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s0.k.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s0.k.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s0.k.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s0.k.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s0.k.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f18786a = iArr;
        }
    }

    public static final l0.a a(l0.a aVar) {
        float f10 = (float) 0.0d;
        return l0.a.b(aVar, l0.c.b(w2.h.m(f10)), null, null, l0.c.b(w2.h.m(f10)), 6, null);
    }

    public static final t1 b(k0 k0Var, s0.k kVar) {
        l0.a aVarA;
        switch (b.f18786a[kVar.ordinal()]) {
            case 1:
                return k0Var.a();
            case 2:
                aVarA = k0Var.a();
                break;
            case 3:
                return k0Var.b();
            case 4:
                aVarA = k0Var.b();
                break;
            case 5:
                return l0.g.f();
            case 6:
                return k0Var.c();
            case 7:
                return a(k0Var.c());
            case 8:
                aVarA = k0Var.c();
                break;
            case 9:
                return k0Var.d();
            case 10:
                return m1.a();
            case 11:
                return k0Var.e();
            default:
                throw new md.q();
        }
        return e(aVarA);
    }

    public static final a2<k0> c() {
        return f18784a;
    }

    public static final t1 d(s0.k kVar, t0.l lVar, int i10) {
        if (t0.o.I()) {
            t0.o.U(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:192)");
        }
        t1 t1VarB = b(y.f18928a.b(lVar, 6), kVar);
        if (t0.o.I()) {
            t0.o.T();
        }
        return t1VarB;
    }

    public static final l0.a e(l0.a aVar) {
        float f10 = (float) 0.0d;
        return l0.a.b(aVar, null, null, l0.c.b(w2.h.m(f10)), l0.c.b(w2.h.m(f10)), 3, null);
    }
}
