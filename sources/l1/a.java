package l1;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import l1.v;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: l1.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0339a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14487a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            try {
                iArr[BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            f14487a = iArr;
        }
    }

    public static final BlendMode a(int i10) {
        v.a aVar = v.f14592a;
        if (v.E(i10, aVar.a())) {
            return BlendMode.CLEAR;
        }
        if (v.E(i10, aVar.x())) {
            return BlendMode.SRC;
        }
        if (v.E(i10, aVar.g())) {
            return BlendMode.DST;
        }
        if (!v.E(i10, aVar.B())) {
            if (v.E(i10, aVar.k())) {
                return BlendMode.DST_OVER;
            }
            if (v.E(i10, aVar.z())) {
                return BlendMode.SRC_IN;
            }
            if (v.E(i10, aVar.i())) {
                return BlendMode.DST_IN;
            }
            if (v.E(i10, aVar.A())) {
                return BlendMode.SRC_OUT;
            }
            if (v.E(i10, aVar.j())) {
                return BlendMode.DST_OUT;
            }
            if (v.E(i10, aVar.y())) {
                return BlendMode.SRC_ATOP;
            }
            if (v.E(i10, aVar.h())) {
                return BlendMode.DST_ATOP;
            }
            if (v.E(i10, aVar.C())) {
                return BlendMode.XOR;
            }
            if (v.E(i10, aVar.t())) {
                return BlendMode.PLUS;
            }
            if (v.E(i10, aVar.q())) {
                return BlendMode.MODULATE;
            }
            if (v.E(i10, aVar.v())) {
                return BlendMode.SCREEN;
            }
            if (v.E(i10, aVar.s())) {
                return BlendMode.OVERLAY;
            }
            if (v.E(i10, aVar.e())) {
                return BlendMode.DARKEN;
            }
            if (v.E(i10, aVar.o())) {
                return BlendMode.LIGHTEN;
            }
            if (v.E(i10, aVar.d())) {
                return BlendMode.COLOR_DODGE;
            }
            if (v.E(i10, aVar.c())) {
                return BlendMode.COLOR_BURN;
            }
            if (v.E(i10, aVar.m())) {
                return BlendMode.HARD_LIGHT;
            }
            if (v.E(i10, aVar.w())) {
                return BlendMode.SOFT_LIGHT;
            }
            if (v.E(i10, aVar.f())) {
                return BlendMode.DIFFERENCE;
            }
            if (v.E(i10, aVar.l())) {
                return BlendMode.EXCLUSION;
            }
            if (v.E(i10, aVar.r())) {
                return BlendMode.MULTIPLY;
            }
            if (v.E(i10, aVar.n())) {
                return BlendMode.HUE;
            }
            if (v.E(i10, aVar.u())) {
                return BlendMode.SATURATION;
            }
            if (v.E(i10, aVar.b())) {
                return BlendMode.COLOR;
            }
            if (v.E(i10, aVar.p())) {
                return BlendMode.LUMINOSITY;
            }
        }
        return BlendMode.SRC_OVER;
    }

    public static final int b(BlendMode blendMode) {
        switch (C0339a.f14487a[blendMode.ordinal()]) {
            case 1:
                return v.f14592a.a();
            case 2:
                return v.f14592a.x();
            case 3:
                return v.f14592a.g();
            case 4:
            default:
                return v.f14592a.B();
            case 5:
                return v.f14592a.k();
            case 6:
                return v.f14592a.z();
            case 7:
                return v.f14592a.i();
            case 8:
                return v.f14592a.A();
            case 9:
                return v.f14592a.j();
            case 10:
                return v.f14592a.y();
            case 11:
                return v.f14592a.h();
            case 12:
                return v.f14592a.C();
            case 13:
                return v.f14592a.t();
            case 14:
                return v.f14592a.q();
            case 15:
                return v.f14592a.v();
            case 16:
                return v.f14592a.s();
            case 17:
                return v.f14592a.e();
            case 18:
                return v.f14592a.o();
            case 19:
                return v.f14592a.d();
            case 20:
                return v.f14592a.c();
            case 21:
                return v.f14592a.m();
            case 22:
                return v.f14592a.w();
            case 23:
                return v.f14592a.f();
            case 24:
                return v.f14592a.l();
            case 25:
                return v.f14592a.r();
            case 26:
                return v.f14592a.n();
            case 27:
                return v.f14592a.u();
            case 28:
                return v.f14592a.b();
            case 29:
                return v.f14592a.p();
        }
    }

    public static final PorterDuff.Mode c(int i10) {
        v.a aVar = v.f14592a;
        if (v.E(i10, aVar.a())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (v.E(i10, aVar.x())) {
            return PorterDuff.Mode.SRC;
        }
        if (v.E(i10, aVar.g())) {
            return PorterDuff.Mode.DST;
        }
        if (!v.E(i10, aVar.B())) {
            if (v.E(i10, aVar.k())) {
                return PorterDuff.Mode.DST_OVER;
            }
            if (v.E(i10, aVar.z())) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (v.E(i10, aVar.i())) {
                return PorterDuff.Mode.DST_IN;
            }
            if (v.E(i10, aVar.A())) {
                return PorterDuff.Mode.SRC_OUT;
            }
            if (v.E(i10, aVar.j())) {
                return PorterDuff.Mode.DST_OUT;
            }
            if (v.E(i10, aVar.y())) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            if (v.E(i10, aVar.h())) {
                return PorterDuff.Mode.DST_ATOP;
            }
            if (v.E(i10, aVar.C())) {
                return PorterDuff.Mode.XOR;
            }
            if (v.E(i10, aVar.t())) {
                return PorterDuff.Mode.ADD;
            }
            if (v.E(i10, aVar.v())) {
                return PorterDuff.Mode.SCREEN;
            }
            if (v.E(i10, aVar.s())) {
                return PorterDuff.Mode.OVERLAY;
            }
            if (v.E(i10, aVar.e())) {
                return PorterDuff.Mode.DARKEN;
            }
            if (v.E(i10, aVar.o())) {
                return PorterDuff.Mode.LIGHTEN;
            }
            if (v.E(i10, aVar.q())) {
                return PorterDuff.Mode.MULTIPLY;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
