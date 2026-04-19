package bf;

import ae.i0;
import ae.m0;
import af.e0;
import cf.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ye.f f5829a = e0.a("kotlinx.serialization.json.JsonUnquotedLiteral", xe.a.y(m0.f720a));

    public static final w a(Boolean bool) {
        return bool == null ? s.INSTANCE : new o(bool, false, null, 4, null);
    }

    public static final w b(Number number) {
        return number == null ? s.INSTANCE : new o(number, false, null, 4, null);
    }

    public static final w c(String str) {
        return str == null ? s.INSTANCE : new o(str, true, null, 4, null);
    }

    private static final Void d(h hVar, String str) {
        throw new IllegalArgumentException("Element " + i0.b(hVar.getClass()) + " is not a " + str);
    }

    public static final Boolean e(w wVar) {
        ae.r.f(wVar, "<this>");
        return z0.d(wVar.a());
    }

    public static final String f(w wVar) {
        ae.r.f(wVar, "<this>");
        if (wVar instanceof s) {
            return null;
        }
        return wVar.a();
    }

    public static final double g(w wVar) {
        ae.r.f(wVar, "<this>");
        return Double.parseDouble(wVar.a());
    }

    public static final Double h(w wVar) {
        ae.r.f(wVar, "<this>");
        return je.t.i(wVar.a());
    }

    public static final float i(w wVar) {
        ae.r.f(wVar, "<this>");
        return Float.parseFloat(wVar.a());
    }

    public static final Float j(w wVar) {
        ae.r.f(wVar, "<this>");
        return je.t.j(wVar.a());
    }

    public static final int k(w wVar) {
        ae.r.f(wVar, "<this>");
        return Integer.parseInt(wVar.a());
    }

    public static final Integer l(w wVar) {
        ae.r.f(wVar, "<this>");
        return je.u.l(wVar.a());
    }

    public static final b m(h hVar) {
        ae.r.f(hVar, "<this>");
        b bVar = hVar instanceof b ? (b) hVar : null;
        if (bVar != null) {
            return bVar;
        }
        d(hVar, "JsonArray");
        throw new md.i();
    }

    public static final u n(h hVar) {
        ae.r.f(hVar, "<this>");
        u uVar = hVar instanceof u ? (u) hVar : null;
        if (uVar != null) {
            return uVar;
        }
        d(hVar, "JsonObject");
        throw new md.i();
    }

    public static final w o(h hVar) {
        ae.r.f(hVar, "<this>");
        w wVar = hVar instanceof w ? (w) hVar : null;
        if (wVar != null) {
            return wVar;
        }
        d(hVar, "JsonPrimitive");
        throw new md.i();
    }

    public static final ye.f p() {
        return f5829a;
    }

    public static final long q(w wVar) {
        ae.r.f(wVar, "<this>");
        return Long.parseLong(wVar.a());
    }

    public static final Long r(w wVar) {
        ae.r.f(wVar, "<this>");
        return je.u.n(wVar.a());
    }
}
