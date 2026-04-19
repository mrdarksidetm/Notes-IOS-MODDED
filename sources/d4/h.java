package d4;

import a4.k;
import ae.r;
import c4.f;
import c4.h;
import d4.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.i0;
import md.q;
import nd.c0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements k<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f9494a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f9495b = "preferences_pb";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9496a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f9496a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, c4.h hVar, d4.a aVar) throws a4.a {
        Object objA;
        Object objValueOf;
        h.b bVarA0 = hVar.a0();
        switch (bVarA0 == null ? -1 : a.f9496a[bVarA0.ordinal()]) {
            case -1:
                throw new a4.a("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new q();
            case 1:
                objA = f.a(str);
                objValueOf = Boolean.valueOf(hVar.S());
                break;
            case 2:
                objA = f.c(str);
                objValueOf = Float.valueOf(hVar.V());
                break;
            case 3:
                objA = f.b(str);
                objValueOf = Double.valueOf(hVar.U());
                break;
            case 4:
                objA = f.d(str);
                objValueOf = Integer.valueOf(hVar.W());
                break;
            case 5:
                objA = f.e(str);
                objValueOf = Long.valueOf(hVar.X());
                break;
            case 6:
                objA = f.f(str);
                objValueOf = hVar.Y();
                r.e(objValueOf, "value.string");
                break;
            case 7:
                objA = f.g(str);
                List<String> listP = hVar.Z().P();
                r.e(listP, "value.stringSet.stringsList");
                objValueOf = c0.H0(listP);
                break;
            case 8:
                throw new a4.a("Value not set.", null, 2, null);
        }
        aVar.j(objA, objValueOf);
    }

    private final c4.h g(Object obj) {
        c4.h hVarBuild;
        String str;
        if (obj instanceof Boolean) {
            hVarBuild = c4.h.b0().A(((Boolean) obj).booleanValue()).build();
            str = "newBuilder().setBoolean(value).build()";
        } else if (obj instanceof Float) {
            hVarBuild = c4.h.b0().C(((Number) obj).floatValue()).build();
            str = "newBuilder().setFloat(value).build()";
        } else if (obj instanceof Double) {
            hVarBuild = c4.h.b0().B(((Number) obj).doubleValue()).build();
            str = "newBuilder().setDouble(value).build()";
        } else if (obj instanceof Integer) {
            hVarBuild = c4.h.b0().D(((Number) obj).intValue()).build();
            str = "newBuilder().setInteger(value).build()";
        } else if (obj instanceof Long) {
            hVarBuild = c4.h.b0().E(((Number) obj).longValue()).build();
            str = "newBuilder().setLong(value).build()";
        } else if (obj instanceof String) {
            hVarBuild = c4.h.b0().F((String) obj).build();
            str = "newBuilder().setString(value).build()";
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(r.m("PreferencesSerializer does not support type: ", obj.getClass().getName()));
            }
            hVarBuild = c4.h.b0().G(c4.g.Q().A((Set) obj)).build();
            str = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
        }
        r.e(hVarBuild, str);
        return hVarBuild;
    }

    @Override // a4.k
    public Object c(InputStream inputStream, qd.d<? super d> dVar) throws a4.a {
        c4.f fVarA = c4.d.f6386a.a(inputStream);
        d4.a aVarB = e.b(new d.b[0]);
        Map<String, c4.h> mapN = fVarA.N();
        r.e(mapN, "preferencesProto.preferencesMap");
        for (Map.Entry<String, c4.h> entry : mapN.entrySet()) {
            String key = entry.getKey();
            c4.h value = entry.getValue();
            h hVar = f9494a;
            r.e(key, "name");
            r.e(value, "value");
            hVar.d(key, value, aVarB);
        }
        return aVarB.d();
    }

    @Override // a4.k
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public d a() {
        return e.a();
    }

    public final String f() {
        return f9495b;
    }

    @Override // a4.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object b(d dVar, OutputStream outputStream, qd.d<? super i0> dVar2) {
        Map<d.a<?>, Object> mapA = dVar.a();
        f.a aVarQ = c4.f.Q();
        for (Map.Entry<d.a<?>, Object> entry : mapA.entrySet()) {
            aVarQ.A(entry.getKey().a(), g(entry.getValue()));
        }
        aVarQ.build().p(outputStream);
        return i0.f15558a;
    }
}
