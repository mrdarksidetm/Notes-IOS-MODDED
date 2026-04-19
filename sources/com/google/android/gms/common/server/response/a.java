package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.util.Log;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import w8.k;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.google.android.gms.common.server.response.a$a, reason: collision with other inner class name */
    public static class C0179a<I, O> extends x8.a {
        public static final d CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final int f8633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final boolean f8634c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final int f8635d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final boolean f8636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected final String f8637f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected final int f8638g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected final Class f8639h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected final String f8640i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private h f8641j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final b f8642k;

        C0179a(int i10, int i11, boolean z10, int i12, boolean z11, String str, int i13, String str2, c9.b bVar) {
            this.f8632a = i10;
            this.f8633b = i11;
            this.f8634c = z10;
            this.f8635d = i12;
            this.f8636e = z11;
            this.f8637f = str;
            this.f8638g = i13;
            if (str2 == null) {
                this.f8639h = null;
                this.f8640i = null;
            } else {
                this.f8639h = c.class;
                this.f8640i = str2;
            }
            if (bVar == null) {
                this.f8642k = null;
            } else {
                this.f8642k = bVar.x();
            }
        }

        protected C0179a(int i10, boolean z10, int i11, boolean z11, String str, int i12, Class cls, b bVar) {
            this.f8632a = 1;
            this.f8633b = i10;
            this.f8634c = z10;
            this.f8635d = i11;
            this.f8636e = z11;
            this.f8637f = str;
            this.f8638g = i12;
            this.f8639h = cls;
            this.f8640i = cls == null ? null : cls.getCanonicalName();
            this.f8642k = bVar;
        }

        public static C0179a<Integer, Integer> A(String str, int i10) {
            return new C0179a<>(0, false, 0, false, str, i10, null, null);
        }

        public static C0179a<String, String> B(String str, int i10) {
            return new C0179a<>(7, false, 7, false, str, i10, null, null);
        }

        public static C0179a<ArrayList<String>, ArrayList<String>> C(String str, int i10) {
            return new C0179a<>(7, true, 7, true, str, i10, null, null);
        }

        public static C0179a<byte[], byte[]> u(String str, int i10) {
            return new C0179a<>(8, false, 8, false, str, i10, null, null);
        }

        public static <T extends a> C0179a<T, T> x(String str, int i10, Class<T> cls) {
            return new C0179a<>(11, false, 11, false, str, i10, cls, null);
        }

        public static <T extends a> C0179a<ArrayList<T>, ArrayList<T>> z(String str, int i10, Class<T> cls) {
            return new C0179a<>(11, true, 11, true, str, i10, cls, null);
        }

        public int D() {
            return this.f8638g;
        }

        final c9.b E() {
            b bVar = this.f8642k;
            if (bVar == null) {
                return null;
            }
            return c9.b.u(bVar);
        }

        public final Object G(Object obj) {
            m.k(this.f8642k);
            return m.k(this.f8642k.h(obj));
        }

        public final Object H(Object obj) {
            m.k(this.f8642k);
            return this.f8642k.f(obj);
        }

        final String I() {
            String str = this.f8640i;
            if (str == null) {
                return null;
            }
            return str;
        }

        public final Map J() {
            m.k(this.f8640i);
            m.k(this.f8641j);
            return (Map) m.k(this.f8641j.x(this.f8640i));
        }

        public final void K(h hVar) {
            this.f8641j = hVar;
        }

        public final boolean L() {
            return this.f8642k != null;
        }

        public final String toString() {
            k.a aVarA = w8.k.d(this).a("versionCode", Integer.valueOf(this.f8632a)).a("typeIn", Integer.valueOf(this.f8633b)).a("typeInArray", Boolean.valueOf(this.f8634c)).a("typeOut", Integer.valueOf(this.f8635d)).a("typeOutArray", Boolean.valueOf(this.f8636e)).a("outputFieldName", this.f8637f).a("safeParcelFieldId", Integer.valueOf(this.f8638g)).a("concreteTypeName", I());
            Class cls = this.f8639h;
            if (cls != null) {
                aVarA.a("concreteType.class", cls.getCanonicalName());
            }
            b bVar = this.f8642k;
            if (bVar != null) {
                aVarA.a("converterName", bVar.getClass().getCanonicalName());
            }
            return aVarA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            int i11 = this.f8632a;
            int iA = x8.c.a(parcel);
            x8.c.s(parcel, 1, i11);
            x8.c.s(parcel, 2, this.f8633b);
            x8.c.g(parcel, 3, this.f8634c);
            x8.c.s(parcel, 4, this.f8635d);
            x8.c.g(parcel, 5, this.f8636e);
            x8.c.C(parcel, 6, this.f8637f, false);
            x8.c.s(parcel, 7, D());
            x8.c.C(parcel, 8, I(), false);
            x8.c.A(parcel, 9, E(), i10, false);
            x8.c.b(parcel, iA);
        }
    }

    public interface b<I, O> {
        Object f(Object obj);

        Object h(Object obj);
    }

    protected static final Object zaD(C0179a c0179a, Object obj) {
        return c0179a.f8642k != null ? c0179a.H(obj) : obj;
    }

    private final void zaE(C0179a c0179a, Object obj) {
        int i10 = c0179a.f8635d;
        Object objG = c0179a.G(obj);
        String str = c0179a.f8637f;
        switch (i10) {
            case 0:
                if (objG != null) {
                    setIntegerInternal(c0179a, str, ((Integer) objG).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(c0179a, str, (BigInteger) objG);
                return;
            case 2:
                if (objG != null) {
                    setLongInternal(c0179a, str, ((Long) objG).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException("Unsupported type for conversion: " + i10);
            case 4:
                if (objG != null) {
                    zan(c0179a, str, ((Double) objG).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(c0179a, str, (BigDecimal) objG);
                return;
            case 6:
                if (objG != null) {
                    setBooleanInternal(c0179a, str, ((Boolean) objG).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(c0179a, str, (String) objG);
                return;
            case 8:
            case 9:
                if (objG != null) {
                    setDecodedBytesInternal(c0179a, str, (byte[]) objG);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb2, C0179a c0179a, Object obj) {
        String string;
        int i10 = c0179a.f8633b;
        if (i10 == 11) {
            Class cls = c0179a.f8639h;
            m.k(cls);
            string = ((a) cls.cast(obj)).toString();
        } else if (i10 != 7) {
            sb2.append(obj);
            return;
        } else {
            string = "\"";
            sb2.append("\"");
            sb2.append(e9.j.a((String) obj));
        }
        sb2.append(string);
    }

    private static final void zaG(String str) {
        if (Log.isLoggable("FastJsonResponse", 6)) {
            Log.e("FastJsonResponse", "Output field (" + str + ") has a null value, but expected a primitive");
        }
    }

    public <T extends a> void addConcreteTypeArrayInternal(C0179a c0179a, String str, ArrayList<T> arrayList) {
        throw new UnsupportedOperationException("Concrete type array not supported");
    }

    public <T extends a> void addConcreteTypeInternal(C0179a c0179a, String str, T t10) {
        throw new UnsupportedOperationException("Concrete type not supported");
    }

    public abstract Map<String, C0179a<?, ?>> getFieldMappings();

    protected Object getFieldValue(C0179a c0179a) {
        String str = c0179a.f8637f;
        if (c0179a.f8639h == null) {
            return getValueObject(str);
        }
        m.p(getValueObject(str) == null, "Concrete field shouldn't be value object: %s", c0179a.f8637f);
        try {
            return getClass().getMethod(com.amazon.a.a.o.b.au + Character.toUpperCase(str.charAt(0)) + str.substring(1), new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    protected abstract Object getValueObject(String str);

    protected boolean isFieldSet(C0179a c0179a) {
        if (c0179a.f8635d != 11) {
            return isPrimitiveFieldSet(c0179a.f8637f);
        }
        if (c0179a.f8636e) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    protected abstract boolean isPrimitiveFieldSet(String str);

    protected void setBooleanInternal(C0179a<?, ?> c0179a, String str, boolean z10) {
        throw new UnsupportedOperationException("Boolean not supported");
    }

    protected void setDecodedBytesInternal(C0179a<?, ?> c0179a, String str, byte[] bArr) {
        throw new UnsupportedOperationException("byte[] not supported");
    }

    protected void setIntegerInternal(C0179a<?, ?> c0179a, String str, int i10) {
        throw new UnsupportedOperationException("Integer not supported");
    }

    protected void setLongInternal(C0179a<?, ?> c0179a, String str, long j10) {
        throw new UnsupportedOperationException("Long not supported");
    }

    protected void setStringInternal(C0179a<?, ?> c0179a, String str, String str2) {
        throw new UnsupportedOperationException("String not supported");
    }

    protected void setStringMapInternal(C0179a<?, ?> c0179a, String str, Map<String, String> map) {
        throw new UnsupportedOperationException("String map not supported");
    }

    protected void setStringsInternal(C0179a<?, ?> c0179a, String str, ArrayList<String> arrayList) {
        throw new UnsupportedOperationException("String list not supported");
    }

    public String toString() {
        String str;
        String strC;
        Map<String, C0179a<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb2 = new StringBuilder(100);
        for (String str2 : fieldMappings.keySet()) {
            C0179a<?, ?> c0179a = fieldMappings.get(str2);
            if (isFieldSet(c0179a)) {
                Object objZaD = zaD(c0179a, getFieldValue(c0179a));
                if (sb2.length() == 0) {
                    sb2.append("{");
                } else {
                    sb2.append(com.amazon.a.a.o.b.f.f7478a);
                }
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (objZaD != null) {
                    switch (c0179a.f8635d) {
                        case 8:
                            sb2.append("\"");
                            strC = e9.c.c((byte[]) objZaD);
                            sb2.append(strC);
                            sb2.append("\"");
                            break;
                        case 9:
                            sb2.append("\"");
                            strC = e9.c.d((byte[]) objZaD);
                            sb2.append(strC);
                            sb2.append("\"");
                            break;
                        case 10:
                            e9.k.a(sb2, (HashMap) objZaD);
                            break;
                        default:
                            if (c0179a.f8634c) {
                                ArrayList arrayList = (ArrayList) objZaD;
                                sb2.append("[");
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    if (i10 > 0) {
                                        sb2.append(com.amazon.a.a.o.b.f.f7478a);
                                    }
                                    Object obj = arrayList.get(i10);
                                    if (obj != null) {
                                        zaF(sb2, c0179a, obj);
                                    }
                                }
                                str = "]";
                            } else {
                                zaF(sb2, c0179a, objZaD);
                            }
                            break;
                    }
                } else {
                    str = "null";
                }
                sb2.append(str);
            }
        }
        sb2.append(sb2.length() > 0 ? "}" : "{}");
        return sb2.toString();
    }

    public final void zaA(C0179a c0179a, String str) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, str);
        } else {
            setStringInternal(c0179a, c0179a.f8637f, str);
        }
    }

    public final void zaB(C0179a c0179a, Map map) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, map);
        } else {
            setStringMapInternal(c0179a, c0179a.f8637f, map);
        }
    }

    public final void zaC(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            setStringsInternal(c0179a, c0179a.f8637f, arrayList);
        }
    }

    public final void zaa(C0179a c0179a, BigDecimal bigDecimal) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, bigDecimal);
        } else {
            zab(c0179a, c0179a.f8637f, bigDecimal);
        }
    }

    protected void zab(C0179a c0179a, String str, BigDecimal bigDecimal) {
        throw new UnsupportedOperationException("BigDecimal not supported");
    }

    public final void zac(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            zad(c0179a, c0179a.f8637f, arrayList);
        }
    }

    protected void zad(C0179a c0179a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigDecimal list not supported");
    }

    public final void zae(C0179a c0179a, BigInteger bigInteger) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, bigInteger);
        } else {
            zaf(c0179a, c0179a.f8637f, bigInteger);
        }
    }

    protected void zaf(C0179a c0179a, String str, BigInteger bigInteger) {
        throw new UnsupportedOperationException("BigInteger not supported");
    }

    public final void zag(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            zah(c0179a, c0179a.f8637f, arrayList);
        }
    }

    protected void zah(C0179a c0179a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("BigInteger list not supported");
    }

    public final void zai(C0179a c0179a, boolean z10) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, Boolean.valueOf(z10));
        } else {
            setBooleanInternal(c0179a, c0179a.f8637f, z10);
        }
    }

    public final void zaj(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            zak(c0179a, c0179a.f8637f, arrayList);
        }
    }

    protected void zak(C0179a c0179a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Boolean list not supported");
    }

    public final void zal(C0179a c0179a, byte[] bArr) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, bArr);
        } else {
            setDecodedBytesInternal(c0179a, c0179a.f8637f, bArr);
        }
    }

    public final void zam(C0179a c0179a, double d10) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, Double.valueOf(d10));
        } else {
            zan(c0179a, c0179a.f8637f, d10);
        }
    }

    protected void zan(C0179a c0179a, String str, double d10) {
        throw new UnsupportedOperationException("Double not supported");
    }

    public final void zao(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            zap(c0179a, c0179a.f8637f, arrayList);
        }
    }

    protected void zap(C0179a c0179a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Double list not supported");
    }

    public final void zaq(C0179a c0179a, float f10) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, Float.valueOf(f10));
        } else {
            zar(c0179a, c0179a.f8637f, f10);
        }
    }

    protected void zar(C0179a c0179a, String str, float f10) {
        throw new UnsupportedOperationException("Float not supported");
    }

    public final void zas(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            zat(c0179a, c0179a.f8637f, arrayList);
        }
    }

    protected void zat(C0179a c0179a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Float list not supported");
    }

    public final void zau(C0179a c0179a, int i10) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, Integer.valueOf(i10));
        } else {
            setIntegerInternal(c0179a, c0179a.f8637f, i10);
        }
    }

    public final void zav(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            zaw(c0179a, c0179a.f8637f, arrayList);
        }
    }

    protected void zaw(C0179a c0179a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Integer list not supported");
    }

    public final void zax(C0179a c0179a, long j10) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, Long.valueOf(j10));
        } else {
            setLongInternal(c0179a, c0179a.f8637f, j10);
        }
    }

    public final void zay(C0179a c0179a, ArrayList arrayList) {
        if (c0179a.f8642k != null) {
            zaE(c0179a, arrayList);
        } else {
            zaz(c0179a, c0179a.f8637f, arrayList);
        }
    }

    protected void zaz(C0179a c0179a, String str, ArrayList arrayList) {
        throw new UnsupportedOperationException("Long list not supported");
    }
}
