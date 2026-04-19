package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.server.response.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import w8.m;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public class c extends b {
    public static final Parcelable.Creator<c> CREATOR = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Parcel f8644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8645c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f8646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f8647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f8648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f8649g;

    c(int i10, Parcel parcel, h hVar) {
        this.f8643a = i10;
        this.f8644b = (Parcel) m.k(parcel);
        this.f8646d = hVar;
        this.f8647e = hVar == null ? null : hVar.u();
        this.f8648f = 2;
    }

    private final void b(a.C0179a c0179a) {
        if (c0179a.f8638g == -1) {
            throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        Parcel parcel = this.f8644b;
        if (parcel == null) {
            throw new IllegalStateException("Internal Parcel object is null.");
        }
        int i10 = this.f8648f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.f8649g = x8.c.a(parcel);
            this.f8648f = 1;
        }
    }

    private final void d(StringBuilder sb2, Map map, Parcel parcel) {
        Object objC;
        String strA;
        String str;
        Object objValueOf;
        Object objZaD;
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((a.C0179a) entry.getValue()).D(), entry);
        }
        sb2.append('{');
        int iK = x8.b.K(parcel);
        boolean z10 = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(x8.b.v(iB));
            if (entry2 != null) {
                if (z10) {
                    sb2.append(com.amazon.a.a.o.b.f.f7478a);
                }
                String str2 = (String) entry2.getKey();
                a.C0179a c0179a = (a.C0179a) entry2.getValue();
                sb2.append("\"");
                sb2.append(str2);
                sb2.append("\":");
                if (c0179a.L()) {
                    int i10 = c0179a.f8635d;
                    switch (i10) {
                        case 0:
                            objValueOf = Integer.valueOf(x8.b.D(parcel, iB));
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 1:
                            objValueOf = x8.b.c(parcel, iB);
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 2:
                            objValueOf = Long.valueOf(x8.b.F(parcel, iB));
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 3:
                            objValueOf = Float.valueOf(x8.b.A(parcel, iB));
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 4:
                            objValueOf = Double.valueOf(x8.b.y(parcel, iB));
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 5:
                            objValueOf = x8.b.a(parcel, iB);
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 6:
                            objValueOf = Boolean.valueOf(x8.b.w(parcel, iB));
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 7:
                            objValueOf = x8.b.p(parcel, iB);
                            objZaD = a.zaD(c0179a, objValueOf);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 8:
                        case 9:
                            objZaD = a.zaD(c0179a, x8.b.g(parcel, iB));
                            f(sb2, c0179a, objZaD);
                            break;
                        case 10:
                            Bundle bundleF = x8.b.f(parcel, iB);
                            HashMap map2 = new HashMap();
                            for (String str3 : bundleF.keySet()) {
                                map2.put(str3, (String) m.k(bundleF.getString(str3)));
                            }
                            objZaD = a.zaD(c0179a, map2);
                            f(sb2, c0179a, objZaD);
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i10);
                    }
                } else {
                    if (c0179a.f8636e) {
                        sb2.append("[");
                        switch (c0179a.f8635d) {
                            case 0:
                                e9.b.e(sb2, x8.b.k(parcel, iB));
                                break;
                            case 1:
                                e9.b.g(sb2, x8.b.d(parcel, iB));
                                break;
                            case 2:
                                e9.b.f(sb2, x8.b.l(parcel, iB));
                                break;
                            case 3:
                                e9.b.d(sb2, x8.b.j(parcel, iB));
                                break;
                            case 4:
                                e9.b.c(sb2, x8.b.i(parcel, iB));
                                break;
                            case 5:
                                e9.b.g(sb2, x8.b.b(parcel, iB));
                                break;
                            case 6:
                                e9.b.h(sb2, x8.b.e(parcel, iB));
                                break;
                            case 7:
                                e9.b.i(sb2, x8.b.q(parcel, iB));
                                break;
                            case 8:
                            case 9:
                            case 10:
                                throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                            case 11:
                                Parcel[] parcelArrN = x8.b.n(parcel, iB);
                                int length = parcelArrN.length;
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (i11 > 0) {
                                        sb2.append(com.amazon.a.a.o.b.f.f7478a);
                                    }
                                    parcelArrN[i11].setDataPosition(0);
                                    d(sb2, c0179a.J(), parcelArrN[i11]);
                                }
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out.");
                        }
                        str = "]";
                    } else {
                        switch (c0179a.f8635d) {
                            case 0:
                                sb2.append(x8.b.D(parcel, iB));
                                break;
                            case 1:
                                objC = x8.b.c(parcel, iB);
                                sb2.append(objC);
                                break;
                            case 2:
                                sb2.append(x8.b.F(parcel, iB));
                                break;
                            case 3:
                                sb2.append(x8.b.A(parcel, iB));
                                break;
                            case 4:
                                sb2.append(x8.b.y(parcel, iB));
                                break;
                            case 5:
                                objC = x8.b.a(parcel, iB);
                                sb2.append(objC);
                                break;
                            case 6:
                                sb2.append(x8.b.w(parcel, iB));
                                break;
                            case 7:
                                String strP = x8.b.p(parcel, iB);
                                sb2.append("\"");
                                strA = e9.j.a(strP);
                                sb2.append(strA);
                                sb2.append("\"");
                                break;
                            case 8:
                                byte[] bArrG = x8.b.g(parcel, iB);
                                sb2.append("\"");
                                strA = e9.c.c(bArrG);
                                sb2.append(strA);
                                sb2.append("\"");
                                break;
                            case 9:
                                byte[] bArrG2 = x8.b.g(parcel, iB);
                                sb2.append("\"");
                                strA = e9.c.d(bArrG2);
                                sb2.append(strA);
                                sb2.append("\"");
                                break;
                            case 10:
                                Bundle bundleF2 = x8.b.f(parcel, iB);
                                Set<String> setKeySet = bundleF2.keySet();
                                sb2.append("{");
                                boolean z11 = true;
                                for (String str4 : setKeySet) {
                                    if (!z11) {
                                        sb2.append(com.amazon.a.a.o.b.f.f7478a);
                                    }
                                    sb2.append("\"");
                                    sb2.append(str4);
                                    sb2.append("\":\"");
                                    sb2.append(e9.j.a(bundleF2.getString(str4)));
                                    sb2.append("\"");
                                    z11 = false;
                                }
                                str = "}";
                                break;
                            case 11:
                                Parcel parcelM = x8.b.m(parcel, iB);
                                parcelM.setDataPosition(0);
                                d(sb2, c0179a.J(), parcelM);
                                break;
                            default:
                                throw new IllegalStateException("Unknown field type out");
                        }
                    }
                    sb2.append(str);
                }
                z10 = true;
            }
        }
        if (parcel.dataPosition() == iK) {
            sb2.append('}');
            return;
        }
        throw new b.a("Overread allowed size end=" + iK, parcel);
    }

    private static final void e(StringBuilder sb2, int i10, Object obj) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                sb2.append(e9.j.a(m.k(obj).toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                sb2.append(e9.c.c((byte[]) obj));
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                sb2.append(e9.c.d((byte[]) obj));
                sb2.append("\"");
                return;
            case 10:
                e9.k.a(sb2, (HashMap) m.k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i10);
        }
    }

    private static final void f(StringBuilder sb2, a.C0179a c0179a, Object obj) {
        if (!c0179a.f8634c) {
            e(sb2, c0179a.f8633b, obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        sb2.append("[");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                sb2.append(com.amazon.a.a.o.b.f.f7478a);
            }
            e(sb2, c0179a.f8633b, arrayList.get(i10));
        }
        sb2.append("]");
    }

    public final Parcel a() {
        int i10 = this.f8648f;
        if (i10 != 0) {
            if (i10 == 1) {
                x8.c.b(this.f8644b, this.f8649g);
            }
            return this.f8644b;
        }
        int iA = x8.c.a(this.f8644b);
        this.f8649g = iA;
        x8.c.b(this.f8644b, iA);
        this.f8648f = 2;
        return this.f8644b;
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void addConcreteTypeArrayInternal(a.C0179a c0179a, String str, ArrayList<T> arrayList) {
        b(c0179a);
        ArrayList arrayList2 = new ArrayList();
        ((ArrayList) m.k(arrayList)).size();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((c) arrayList.get(i10)).a());
        }
        x8.c.z(this.f8644b, c0179a.D(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final <T extends a> void addConcreteTypeInternal(a.C0179a c0179a, String str, T t10) {
        b(c0179a);
        x8.c.y(this.f8644b, c0179a.D(), ((c) t10).a(), true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final Map<String, a.C0179a<?, ?>> getFieldMappings() {
        h hVar = this.f8646d;
        if (hVar == null) {
            return null;
        }
        return hVar.x((String) m.k(this.f8647e));
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final Object getValueObject(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.b, com.google.android.gms.common.server.response.a
    public final boolean isPrimitiveFieldSet(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setBooleanInternal(a.C0179a<?, ?> c0179a, String str, boolean z10) {
        b(c0179a);
        x8.c.g(this.f8644b, c0179a.D(), z10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setDecodedBytesInternal(a.C0179a<?, ?> c0179a, String str, byte[] bArr) {
        b(c0179a);
        x8.c.k(this.f8644b, c0179a.D(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setIntegerInternal(a.C0179a<?, ?> c0179a, String str, int i10) {
        b(c0179a);
        x8.c.s(this.f8644b, c0179a.D(), i10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setLongInternal(a.C0179a<?, ?> c0179a, String str, long j10) {
        b(c0179a);
        x8.c.v(this.f8644b, c0179a.D(), j10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringInternal(a.C0179a<?, ?> c0179a, String str, String str2) {
        b(c0179a);
        x8.c.C(this.f8644b, c0179a.D(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringMapInternal(a.C0179a<?, ?> c0179a, String str, Map<String, String> map) {
        b(c0179a);
        Bundle bundle = new Bundle();
        for (String str2 : ((Map) m.k(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        x8.c.j(this.f8644b, c0179a.D(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void setStringsInternal(a.C0179a<?, ?> c0179a, String str, ArrayList<String> arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = arrayList.get(i10);
        }
        x8.c.D(this.f8644b, c0179a.D(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    public final String toString() {
        m.l(this.f8646d, "Cannot convert to JSON on client side.");
        Parcel parcelA = a();
        parcelA.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        d(sb2, (Map) m.k(this.f8646d.x((String) m.k(this.f8647e))), parcelA);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8643a;
        int iA = x8.c.a(parcel);
        x8.c.s(parcel, 1, i11);
        x8.c.y(parcel, 2, a(), false);
        x8.c.A(parcel, 3, this.f8645c != 0 ? this.f8646d : null, i10, false);
        x8.c.b(parcel, iA);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zab(a.C0179a c0179a, String str, BigDecimal bigDecimal) {
        b(c0179a);
        x8.c.c(this.f8644b, c0179a.D(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zad(a.C0179a c0179a, String str, ArrayList arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        BigDecimal[] bigDecimalArr = new BigDecimal[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigDecimalArr[i10] = (BigDecimal) arrayList.get(i10);
        }
        x8.c.d(this.f8644b, c0179a.D(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaf(a.C0179a c0179a, String str, BigInteger bigInteger) {
        b(c0179a);
        x8.c.e(this.f8644b, c0179a.D(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zah(a.C0179a c0179a, String str, ArrayList arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        BigInteger[] bigIntegerArr = new BigInteger[size];
        for (int i10 = 0; i10 < size; i10++) {
            bigIntegerArr[i10] = (BigInteger) arrayList.get(i10);
        }
        x8.c.f(this.f8644b, c0179a.D(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zak(a.C0179a c0179a, String str, ArrayList arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i10 = 0; i10 < size; i10++) {
            zArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue();
        }
        x8.c.h(this.f8644b, c0179a.D(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zan(a.C0179a c0179a, String str, double d10) {
        b(c0179a);
        x8.c.m(this.f8644b, c0179a.D(), d10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zap(a.C0179a c0179a, String str, ArrayList arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) arrayList.get(i10)).doubleValue();
        }
        x8.c.n(this.f8644b, c0179a.D(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zar(a.C0179a c0179a, String str, float f10) {
        b(c0179a);
        x8.c.p(this.f8644b, c0179a.D(), f10);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zat(a.C0179a c0179a, String str, ArrayList arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        float[] fArr = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            fArr[i10] = ((Float) arrayList.get(i10)).floatValue();
        }
        x8.c.q(this.f8644b, c0179a.D(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaw(a.C0179a c0179a, String str, ArrayList arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        x8.c.t(this.f8644b, c0179a.D(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.a
    protected final void zaz(a.C0179a c0179a, String str, ArrayList arrayList) {
        b(c0179a);
        int size = ((ArrayList) m.k(arrayList)).size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = ((Long) arrayList.get(i10)).longValue();
        }
        x8.c.w(this.f8644b, c0179a.D(), jArr, true);
    }
}
