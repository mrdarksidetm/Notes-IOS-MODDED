package af;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<he.c<? extends Object>, we.b<? extends Object>> f767a = nd.r0.h(md.x.a(ae.i0.b(String.class), xe.a.y(ae.m0.f720a)), md.x.a(ae.i0.b(Character.TYPE), xe.a.s(ae.f.f702a)), md.x.a(ae.i0.b(char[].class), xe.a.c()), md.x.a(ae.i0.b(Double.TYPE), xe.a.t(ae.k.f716a)), md.x.a(ae.i0.b(double[].class), xe.a.d()), md.x.a(ae.i0.b(Float.TYPE), xe.a.u(ae.l.f718a)), md.x.a(ae.i0.b(float[].class), xe.a.e()), md.x.a(ae.i0.b(Long.TYPE), xe.a.w(ae.t.f722a)), md.x.a(ae.i0.b(long[].class), xe.a.h()), md.x.a(ae.i0.b(md.c0.class), xe.a.C(md.c0.f15542b)), md.x.a(ae.i0.b(md.d0.class), xe.a.n()), md.x.a(ae.i0.b(Integer.TYPE), xe.a.v(ae.q.f721a)), md.x.a(ae.i0.b(int[].class), xe.a.f()), md.x.a(ae.i0.b(md.a0.class), xe.a.B(md.a0.f15536b)), md.x.a(ae.i0.b(md.b0.class), xe.a.m()), md.x.a(ae.i0.b(Short.TYPE), xe.a.x(ae.k0.f717a)), md.x.a(ae.i0.b(short[].class), xe.a.k()), md.x.a(ae.i0.b(md.f0.class), xe.a.D(md.f0.f15552b)), md.x.a(ae.i0.b(md.g0.class), xe.a.o()), md.x.a(ae.i0.b(Byte.TYPE), xe.a.r(ae.e.f700a)), md.x.a(ae.i0.b(byte[].class), xe.a.b()), md.x.a(ae.i0.b(md.y.class), xe.a.A(md.y.f15587b)), md.x.a(ae.i0.b(md.z.class), xe.a.l()), md.x.a(ae.i0.b(Boolean.TYPE), xe.a.q(ae.d.f698a)), md.x.a(ae.i0.b(boolean[].class), xe.a.a()), md.x.a(ae.i0.b(md.i0.class), xe.a.E(md.i0.f15558a)), md.x.a(ae.i0.b(Void.class), xe.a.j()), md.x.a(ae.i0.b(ke.a.class), xe.a.z(ke.a.f14459b)));

    public static final ye.f a(String str, ye.e eVar) {
        ae.r.f(str, "serialName");
        ae.r.f(eVar, "kind");
        c(str);
        return new g1(str, eVar);
    }

    private static final String b(String str) {
        if (!(str.length() > 0)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb2.append((Object) (Character.isLowerCase(cCharAt) ? je.c.e(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        ae.r.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb2.append(strSubstring);
        return sb2.toString();
    }

    private static final void c(String str) {
        Iterator<he.c<? extends Object>> it = f767a.keySet().iterator();
        while (it.hasNext()) {
            String strB = it.next().b();
            ae.r.c(strB);
            String strB2 = b(strB);
            if (je.v.t(str, "kotlin." + strB2, true) || je.v.t(str, strB2, true)) {
                throw new IllegalArgumentException(je.o.f("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + b(strB2) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
