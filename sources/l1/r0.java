package l1;

import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r0 f14564a = new r0();

    private r0() {
    }

    public static final ColorSpace e(m1.c cVar) {
        ColorSpace.Rgb rgb;
        ColorSpace.Named named;
        m1.g gVar = m1.g.f15198a;
        if (ae.r.b(cVar, gVar.w())) {
            named = ColorSpace.Named.SRGB;
        } else if (ae.r.b(cVar, gVar.e())) {
            named = ColorSpace.Named.ACES;
        } else if (ae.r.b(cVar, gVar.f())) {
            named = ColorSpace.Named.ACESCG;
        } else if (ae.r.b(cVar, gVar.g())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (ae.r.b(cVar, gVar.h())) {
            named = ColorSpace.Named.BT2020;
        } else if (ae.r.b(cVar, gVar.i())) {
            named = ColorSpace.Named.BT709;
        } else if (ae.r.b(cVar, gVar.j())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (ae.r.b(cVar, gVar.k())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (ae.r.b(cVar, gVar.m())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (ae.r.b(cVar, gVar.n())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (ae.r.b(cVar, gVar.o())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (ae.r.b(cVar, gVar.p())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (ae.r.b(cVar, gVar.q())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (ae.r.b(cVar, gVar.r())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (ae.r.b(cVar, gVar.u())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (ae.r.b(cVar, gVar.v())) {
            named = ColorSpace.Named.SMPTE_C;
        } else {
            if (cVar instanceof m1.w) {
                m1.w wVar = (m1.w) cVar;
                float[] fArrC = wVar.R().c();
                m1.x xVarP = wVar.P();
                ColorSpace.Rgb.TransferParameters transferParameters = xVarP != null ? new Object(xVarP.a(), xVarP.b(), xVarP.c(), xVarP.d(), xVarP.e(), xVarP.f(), xVarP.g()) { // from class: android.graphics.ColorSpace.Rgb.TransferParameters
                    static {
                        throw new NoClassDefFoundError();
                    }

                    public /* synthetic */ TransferParameters(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
                    }
                } : null;
                if (transferParameters != null) {
                    rgb = new ColorSpace.Rgb(cVar.h(), ((m1.w) cVar).O(), fArrC, transferParameters);
                } else {
                    String strH = cVar.h();
                    m1.w wVar2 = (m1.w) cVar;
                    float[] fArrO = wVar2.O();
                    final zd.l<Double, Double> lVarL = wVar2.L();
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: l1.n0
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d10) {
                            return r0.f(lVarL, d10);
                        }
                    };
                    final zd.l<Double, Double> lVarH = wVar2.H();
                    rgb = new ColorSpace.Rgb(strH, fArrO, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: l1.o0
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d10) {
                            return r0.g(lVarH, d10);
                        }
                    }, cVar.f(0), cVar.e(0));
                }
                return rgb;
            }
            named = ColorSpace.Named.SRGB;
        }
        return ColorSpace.get(named);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(zd.l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(zd.l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    public static final m1.c h(final ColorSpace colorSpace) {
        m1.y yVar;
        m1.x xVar;
        int id2 = colorSpace.getId();
        if (id2 != ColorSpace.Named.SRGB.ordinal()) {
            if (id2 == ColorSpace.Named.ACES.ordinal()) {
                return m1.g.f15198a.e();
            }
            if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
                return m1.g.f15198a.f();
            }
            if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
                return m1.g.f15198a.g();
            }
            if (id2 == ColorSpace.Named.BT2020.ordinal()) {
                return m1.g.f15198a.h();
            }
            if (id2 == ColorSpace.Named.BT709.ordinal()) {
                return m1.g.f15198a.i();
            }
            if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
                return m1.g.f15198a.j();
            }
            if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
                return m1.g.f15198a.k();
            }
            if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
                return m1.g.f15198a.m();
            }
            if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
                return m1.g.f15198a.n();
            }
            if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
                return m1.g.f15198a.o();
            }
            if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
                return m1.g.f15198a.p();
            }
            if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
                return m1.g.f15198a.q();
            }
            if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
                return m1.g.f15198a.r();
            }
            if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
                return m1.g.f15198a.u();
            }
            if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
                return m1.g.f15198a.v();
            }
            if (colorSpace instanceof ColorSpace.Rgb) {
                ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
                ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
                m1.y yVar2 = rgb.getWhitePoint().length == 3 ? new m1.y(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new m1.y(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
                if (transferParameters != null) {
                    yVar = yVar2;
                    xVar = new m1.x(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f);
                } else {
                    yVar = yVar2;
                    xVar = null;
                }
                return new m1.w(rgb.getName(), rgb.getPrimaries(), yVar, rgb.getTransform(), new m1.i() { // from class: l1.p0
                    @Override // m1.i
                    public final double a(double d10) {
                        return r0.i(colorSpace, d10);
                    }
                }, new m1.i() { // from class: l1.q0
                    @Override // m1.i
                    public final double a(double d10) {
                        return r0.j(colorSpace, d10);
                    }
                }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), xVar, rgb.getId());
            }
        }
        return m1.g.f15198a.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d10);
    }
}
