package androidx.profileinstaller;

import com.revenuecat.purchases.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final byte[] f4517a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final byte[] f4518b = {112, 114, 109, 0};

    private static void A(InputStream inputStream) {
        d.h(inputStream);
        int iJ = d.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            d.j(inputStream);
            for (int iJ2 = d.j(inputStream); iJ2 > 0; iJ2--) {
                d.h(inputStream);
            }
            iJ--;
        }
    }

    static boolean B(OutputStream outputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (Arrays.equals(bArr, j.f4529a)) {
            N(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f4530b)) {
            M(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f4532d)) {
            K(outputStream, cVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f4531c)) {
            L(outputStream, cVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, j.f4533e)) {
            return false;
        }
        J(outputStream, cVarArr);
        return true;
    }

    private static void C(OutputStream outputStream, c cVar) throws IOException {
        int iIntValue = 0;
        for (int i10 : cVar.f4505h) {
            Integer numValueOf = Integer.valueOf(i10);
            d.p(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    private static k D(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            d.p(byteArrayOutputStream, cVarArr.length);
            int i10 = 2;
            for (c cVar : cVarArr) {
                d.q(byteArrayOutputStream, cVar.f4500c);
                d.q(byteArrayOutputStream, cVar.f4501d);
                d.q(byteArrayOutputStream, cVar.f4504g);
                String strJ = j(cVar.f4498a, cVar.f4499b, j.f4529a);
                int iK = d.k(strJ);
                d.p(byteArrayOutputStream, iK);
                i10 = i10 + 4 + 4 + 4 + 2 + (iK * 1);
                d.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                k kVar = new k(e.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return kVar;
            }
            throw d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f4517a);
        outputStream.write(bArr);
    }

    private static void F(OutputStream outputStream, c cVar) throws IOException {
        I(outputStream, cVar);
        C(outputStream, cVar);
        H(outputStream, cVar);
    }

    private static void G(OutputStream outputStream, c cVar, String str) throws IOException {
        d.p(outputStream, d.k(str));
        d.p(outputStream, cVar.f4502e);
        d.q(outputStream, cVar.f4503f);
        d.q(outputStream, cVar.f4500c);
        d.q(outputStream, cVar.f4504g);
        d.n(outputStream, str);
    }

    private static void H(OutputStream outputStream, c cVar) throws IOException {
        byte[] bArr = new byte[k(cVar.f4504g)];
        for (Map.Entry<Integer, Integer> entry : cVar.f4506i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, cVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, cVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void I(OutputStream outputStream, c cVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : cVar.f4506i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                d.p(outputStream, iIntValue - i10);
                d.p(outputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    private static void J(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.p(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            String strJ = j(cVar.f4498a, cVar.f4499b, j.f4533e);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f4506i.size());
            d.p(outputStream, cVar.f4505h.length);
            d.q(outputStream, cVar.f4500c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f4506i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
            }
            for (int i10 : cVar.f4505h) {
                d.p(outputStream, i10);
            }
        }
    }

    private static void K(OutputStream outputStream, c[] cVarArr) throws IOException {
        d.r(outputStream, cVarArr.length);
        for (c cVar : cVarArr) {
            int size = cVar.f4506i.size() * 4;
            String strJ = j(cVar.f4498a, cVar.f4499b, j.f4532d);
            d.p(outputStream, d.k(strJ));
            d.p(outputStream, cVar.f4505h.length);
            d.q(outputStream, size);
            d.q(outputStream, cVar.f4500c);
            d.n(outputStream, strJ);
            Iterator<Integer> it = cVar.f4506i.keySet().iterator();
            while (it.hasNext()) {
                d.p(outputStream, it.next().intValue());
                d.p(outputStream, 0);
            }
            for (int i10 : cVar.f4505h) {
                d.p(outputStream, i10);
            }
        }
    }

    private static void L(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, j.f4531c);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void M(OutputStream outputStream, c[] cVarArr) throws IOException {
        byte[] bArrB = b(cVarArr, j.f4530b);
        d.r(outputStream, cVarArr.length);
        d.m(outputStream, bArrB);
    }

    private static void N(OutputStream outputStream, c[] cVarArr) throws IOException {
        O(outputStream, cVarArr);
    }

    private static void O(OutputStream outputStream, c[] cVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(cVarArr));
        arrayList.add(c(cVarArr));
        arrayList.add(d(cVarArr));
        long length2 = ((long) j.f4529a.length) + ((long) f4517a.length) + 4 + ((long) (arrayList.size() * 16));
        d.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k kVar = (k) arrayList.get(i10);
            d.q(outputStream, kVar.f4536a.b());
            d.q(outputStream, length2);
            if (kVar.f4539d) {
                byte[] bArr = kVar.f4538c;
                long length3 = bArr.length;
                byte[] bArrB = d.b(bArr);
                arrayList2.add(bArrB);
                d.q(outputStream, bArrB.length);
                d.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(kVar.f4538c);
                d.q(outputStream, kVar.f4538c.length);
                d.q(outputStream, 0L);
                length = kVar.f4538c.length;
            }
            length2 += (long) length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    private static int a(c cVar) {
        Iterator<Map.Entry<Integer, Integer>> it = cVar.f4506i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    private static byte[] b(c[] cVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int iK = 0;
        for (c cVar : cVarArr) {
            iK += d.k(j(cVar.f4498a, cVar.f4499b, bArr)) + 16 + (cVar.f4502e * 2) + cVar.f4503f + k(cVar.f4504g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, j.f4531c)) {
            int length = cVarArr.length;
            while (i10 < length) {
                c cVar2 = cVarArr[i10];
                G(byteArrayOutputStream, cVar2, j(cVar2.f4498a, cVar2.f4499b, bArr));
                F(byteArrayOutputStream, cVar2);
                i10++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                G(byteArrayOutputStream, cVar3, j(cVar3.f4498a, cVar3.f4499b, bArr));
            }
            int length2 = cVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, cVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw d.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    private static k c(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            try {
                c cVar = cVarArr[i11];
                d.p(byteArrayOutputStream, i11);
                d.p(byteArrayOutputStream, cVar.f4502e);
                i10 = i10 + 2 + 2 + (cVar.f4502e * 2);
                C(byteArrayOutputStream, cVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            k kVar = new k(e.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static k d(c[] cVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            try {
                c cVar = cVarArr[i11];
                int iA = a(cVar);
                byte[] bArrE = e(cVar);
                byte[] bArrF = f(cVar);
                d.p(byteArrayOutputStream, i11);
                int length = bArrE.length + 2 + bArrF.length;
                d.q(byteArrayOutputStream, length);
                d.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i10 = i10 + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            k kVar = new k(e.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw d.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    private static byte[] e(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static byte[] f(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, cVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, "!") : Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR.equals(str2) ? str.replace("!", Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR) : str;
    }

    private static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    private static c i(c[] cVarArr, String str) {
        if (cVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10].f4499b.equals(strH)) {
                return cVarArr[i10];
            }
        }
        return null;
    }

    private static String j(String str, String str2, byte[] bArr) {
        String strA = j.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR)) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + j.a(bArr) + str2;
    }

    private static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    private static int l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw d.c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw d.c("Unexpected flag: " + i10);
    }

    private static int[] m(InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int iH = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iH += d.h(inputStream);
            iArr[i11] = iH;
        }
        return iArr;
    }

    private static int n(BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(l(2, i10, i11)) ? 2 : 0;
        return bitSet.get(l(4, i10, i11)) ? i12 | 4 : i12;
    }

    static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, d.d(inputStream, bArr.length))) {
            return d.d(inputStream, j.f4530b.length);
        }
        throw d.c("Invalid magic");
    }

    private static void p(InputStream inputStream, c cVar) {
        int iAvailable = inputStream.available() - cVar.f4503f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += d.h(inputStream);
            cVar.f4506i.put(Integer.valueOf(iH), 1);
            for (int iH2 = d.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw d.c("Read too much data during profile line parse");
        }
    }

    static c[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        if (Arrays.equals(bArr, j.f4534f)) {
            if (Arrays.equals(j.f4529a, bArr2)) {
                throw d.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, cVarArr);
        }
        if (Arrays.equals(bArr, j.f4535g)) {
            return t(inputStream, bArr2, cVarArr);
        }
        throw d.c("Unsupported meta version");
    }

    static c[] r(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        if (!Arrays.equals(bArr, j.f4534f)) {
            throw d.c("Unsupported meta version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrS = s(byteArrayInputStream, iJ, cVarArr);
            byteArrayInputStream.close();
            return cVarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] s(InputStream inputStream, int i10, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = d.h(inputStream);
            iArr[i11] = d.h(inputStream);
            strArr[i11] = d.f(inputStream, iH);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            if (!cVar.f4499b.equals(strArr[i12])) {
                throw d.c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            cVar.f4502e = i13;
            cVar.f4505h = m(inputStream, i13);
        }
        return cVarArr;
    }

    static c[] t(InputStream inputStream, byte[] bArr, c[] cVarArr) throws IOException {
        int iH = d.h(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrU = u(byteArrayInputStream, bArr, iH, cVarArr);
            byteArrayInputStream.close();
            return cVarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] u(InputStream inputStream, byte[] bArr, int i10, c[] cVarArr) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        if (i10 != cVarArr.length) {
            throw d.c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            d.h(inputStream);
            String strF = d.f(inputStream, d.h(inputStream));
            long jI = d.i(inputStream);
            int iH = d.h(inputStream);
            c cVarI = i(cVarArr, strF);
            if (cVarI == null) {
                throw d.c("Missing profile key: " + strF);
            }
            cVarI.f4501d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, j.f4533e)) {
                cVarI.f4502e = iH;
                cVarI.f4505h = iArrM;
            }
        }
        return cVarArr;
    }

    private static void v(InputStream inputStream, c cVar) {
        BitSet bitSetValueOf = BitSet.valueOf(d.d(inputStream, d.a(cVar.f4504g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = cVar.f4504g;
            if (i10 >= i11) {
                return;
            }
            int iN = n(bitSetValueOf, i10, i11);
            if (iN != 0) {
                Integer num = cVar.f4506i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                cVar.f4506i.put(Integer.valueOf(i10), Integer.valueOf(iN | num.intValue()));
            }
            i10++;
        }
    }

    static c[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, j.f4530b)) {
            throw d.c("Unsupported version");
        }
        int iJ = d.j(inputStream);
        byte[] bArrE = d.e(inputStream, (int) d.i(inputStream), (int) d.i(inputStream));
        if (inputStream.read() > 0) {
            throw d.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            c[] cVarArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return cVarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static c[] x(InputStream inputStream, String str, int i10) {
        if (inputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = d.h(inputStream);
            int iH2 = d.h(inputStream);
            cVarArr[i11] = new c(str, d.f(inputStream, iH), d.i(inputStream), 0L, iH2, (int) d.i(inputStream), (int) d.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            c cVar = cVarArr[i12];
            p(inputStream, cVar);
            cVar.f4505h = m(inputStream, cVar.f4502e);
            v(inputStream, cVar);
        }
        return cVarArr;
    }

    private static int y(int i10) {
        return ((i10 + 8) - 1) & (-8);
    }

    private static void z(byte[] bArr, int i10, int i11, c cVar) {
        int iL = l(i10, i11, cVar.f4504g);
        int i12 = iL / 8;
        bArr[i12] = (byte) ((1 << (iL % 8)) | bArr[i12]);
    }
}
