package q0;

import t0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a2<r0> f18897a = t0.v.e(a.f18898a);

    static final class a extends ae.s implements zd.a<r0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18898a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r0 invoke() {
            return new r0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18899a;

        static {
            int[] iArr = new int[s0.p.values().length];
            try {
                iArr[s0.p.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.p.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s0.p.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s0.p.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s0.p.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s0.p.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s0.p.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s0.p.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s0.p.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s0.p.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s0.p.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[s0.p.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[s0.p.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[s0.p.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[s0.p.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            f18899a = iArr;
        }
    }

    public static final i2.g0 a(r0 r0Var, s0.p pVar) {
        switch (b.f18899a[pVar.ordinal()]) {
            case 1:
                return r0Var.e();
            case 2:
                return r0Var.f();
            case 3:
                return r0Var.g();
            case 4:
                return r0Var.h();
            case 5:
                return r0Var.i();
            case 6:
                return r0Var.j();
            case 7:
                return r0Var.n();
            case 8:
                return r0Var.o();
            case 9:
                return r0Var.p();
            case 10:
                return r0Var.b();
            case 11:
                return r0Var.c();
            case 12:
                return r0Var.d();
            case 13:
                return r0Var.k();
            case 14:
                return r0Var.l();
            case 15:
                return r0Var.m();
            default:
                throw new md.q();
        }
    }

    public static final a2<r0> b() {
        return f18897a;
    }
}
