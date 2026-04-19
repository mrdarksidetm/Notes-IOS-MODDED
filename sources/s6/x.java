package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import dalvik.system.DexClassLoader;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class x extends m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f20365l = f1.a("542C0A6BA2105B40871F6946306E19");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20366m = f1.b(f1.c("53211B6DAA377C49850658501E6F1621DE0C4E657D0221445FB87F7F6CBFE2425229007AB0"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f20367n = f1.b(f1.c("542C0A6BA20D4E558D0258793479143DFB11"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f20368o = f1.b(f1.c("542C0A6BA2055D4089114A5B23660F"));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f20369p = f1.b(f1.c("5E373778A6304A45B2114F4738621213E90343437D123E6D"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f20370q = f1.b(f1.c("1837167BBD26420E82065C59347A1320F44D725F7303376C72AB727E6F93A2655636"));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f20371r = f1.b(f1.c("5428007BAC105B53811550"));

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f20372s = f1.b(f1.c("422A0269BA287C55961D5353"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f20364k = x.class.getSimpleName();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f20373t = {-41, 9, -18, 78, -123, 19, 114, -84, -61, 106, 51, -76, 124, -95, -106, -58, 119, -28, -114, -98, -58, -91, -118, 116, -92, -54, -66, 72, -115, 27, 71, -94};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final byte[] f20374u = {-125, 123, -101, 11};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f20375v = {-79, 72, -126, 29, -32};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f20376w = {-77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 29, -54, -71, -54, 41, -31, 119, 34, -48};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f20377x = {-76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final byte[] f20378y = {-76, 102, -125, 96, -28, 125, 22, -34, -84, 3, 87, -102, 21, -49, -30, -93, 5, -118, -17, -14, -24, -54, -7, 90, -2, -77, -39, 39, -7, 126, 14, -52, -66, 125};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final byte[] f20379z = {-76, 102, -125, 96, -10, 114, 7, -34, -86, 1, 29, -57, 9, -61, -27, -78, 5, -123, -6, -5, -24, -24, -39, 80, -106};
    public static final byte[] A = {-66, 103, -104, 33, -18, 118, 22};
    public static final byte[] B = {-77, 108, -64, 60, -22, 113, 4, -126, -94, 4, 87, -58, 19, -56, -14, -24, 15, -108, -31, -19, -93, -63, -92, 44, -44, -91, -51, 45, -23, 89, 53, -53, -77, 110, -117};
    public static final byte[] C = {-70, 104, -121, 32};
    public static final byte[] D = {-65, 104, -128, 42, -23, 118, 58, -61, -84, 1, 86, -48, 49, -60, -30, -82, 24, -128};
    public static final byte[] E = {-113, 121, -127, 61, -32, 119, 48, -34, -86, 14, 84, -47, 82, -53, -9, -76};
    public static final byte[] F = {-74};
    public static final byte[] G = {-75};
    public static final byte[] H = {-76};
    public static final byte[] I = {-77};
    public static final byte[] J = {-78};
    public static final byte[] K = {-79};
    public static final byte[] L = {-80};
    public static final byte[] M = {-65};
    public static final byte[] N = {-66};
    public static final byte[] O = {-67};
    public static final byte[] P = {-69};
    public static final byte[] Q = {-89, 107, -123, 42, -29, 33};
    public static final byte[] R = {-83};
    public static final byte[] S = {-82};
    public static final byte[] T = {-81};
    public static final byte[] U = {-92, 125, -113, 60, -15};
    public static final byte[] V = {-92, 125, -127, 62};

    public x(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var, w2Var, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 P(Context context) {
        boolean zS = (f20375v != F(context)) | S();
        byte[] bArrO = O(context);
        byte[] bArr = f20374u;
        return new n0(!(zS | (bArrO == bArr)), !((J(context) == bArr) | (Q() == bArr) | (R() == bArr)), true);
    }

    public final void A(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                B(f1.a("5428007BAC105B53811550"), e10);
            }
        }
    }

    public final void B(String str, Exception exc) {
        e(str, exc.getMessage() == null ? exc.getClass().getSimpleName() : exc.getMessage());
    }

    public final byte[] C(byte[] bArr, int i10) {
        if (i10 != 2) {
            return bArr;
        }
        N(f1.a("542C0A6BA2105B40871F6946306E19"), f1.b(f1.c("64310D7BBD314E5581545447716C1F26F6144F")));
        return f20374u;
    }

    public final byte[] D(byte[] bArr, StackTraceElement stackTraceElement) {
        if (!stackTraceElement.getClassName().equals(y(f20379z)) || !stackTraceElement.getMethodName().equals(y(A))) {
            return bArr;
        }
        N(f1.a("542C0A6BA2105B40871F6946306E19"), f1.b(f1.c("5F2B0063AC270F54971D5353715E0930EC16584E6815")));
        return f20374u;
    }

    public final boolean E(boolean z10) {
        return new Random().nextInt(f20375v.length) > 0 && !z10;
    }

    public final byte[] F(Context context) {
        PackageManager packageManager = context.getPackageManager();
        byte[] bArr = f20375v;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(y(f20376w));
        arrayList.add(y(f20377x));
        boolean z10 = true;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            try {
                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? packageManager.getApplicationInfo((String) arrayList.get(i10), PackageManager.ApplicationInfoFlags.of(0L)) : packageManager.getApplicationInfo((String) arrayList.get(i10), 0);
                if (applicationInfo != null) {
                    String strA = f1.a("542C0A6BA2055D4089114A5B23660F");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f1.a(i10 == 0 ? "6F34007BAC27" : "64310D7BBD314E5581"));
                    sb2.append(f1.a("1722007DA7270F4E8A54495C342D0F2BEC164F42"));
                    N(strA, sb2.toString());
                    z10 = false;
                }
                while (applicationInfo != null && arrayList.contains(applicationInfo.packageName)) {
                    if (E(z10) || z10) {
                        bArr = f20374u;
                        z10 = !z10;
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            i10++;
        }
        return bArr;
    }

    public final byte[] G(Set<String> set) {
        byte[] bArr = f20375v;
        List listAsList = Arrays.asList(y(F), y(Q), y(H), y(G), y(J), y(I), y(K), y(L), y(M), y(N), y(O), y(P), y(R), y(S), y(T), y(U), y(V));
        for (String str : set) {
            if (str.startsWith(f1.a("542B0226A82B4A40801D495132230833F3114F4C4303376B45AB726E71"))) {
                try {
                    Class<?> cls = Class.forName(str);
                    for (Method method : cls.getDeclaredMethods()) {
                        if (!listAsList.contains(method.getName()) && Modifier.isNative(method.getModifiers())) {
                            N(f1.b(f1.c("542C0A6BA20D4E558D0258793479143DFB11")), f1.b(f1.c("79251B61BF260F47911A5E4038621272F90D5F41784A72")) + cls.getCanonicalName() + f1.b(f1.c("1A7A")) + method.getName());
                            bArr = f20374u;
                        }
                    }
                } catch (ClassNotFoundException | NoClassDefFoundError e10) {
                    e10.getMessage();
                    e(f1.b(f1.c("542C0A6BA20D4E558D0258793479143DFB11")), e10.getMessage());
                }
            }
        }
        return bArr;
    }

    public final byte[] H(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte[] bArr3 = f20373t;
            bArr2[i10] = (byte) (b10 ^ bArr3[i10 % bArr3.length]);
        }
        return bArr2;
    }

    public final byte[] I(byte[] bArr, StackTraceElement stackTraceElement) {
        if (!stackTraceElement.getClassName().equals(y(B)) || !stackTraceElement.getMethodName().equals(y(D))) {
            return bArr;
        }
        N(f1.a("542C0A6BA2105B40871F6946306E19"), f1.b(f1.c("5F2B0063AC270F54971D535371550C3DEC074E")));
        return f20374u;
    }

    public final byte[] J(Context context) {
        byte[] bArr = f20375v;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return bArr;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            return G(z(i10 >= 33 ? packageManager.getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : packageManager.getApplicationInfo(context.getPackageName(), 128)));
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final byte[] K(Set<String> set) {
        byte[] bArr = f20375v;
        String strY = y(f20377x);
        String strY2 = y(E);
        for (String str : set) {
            if (strY != null && str.contains(strY)) {
                N(f1.a("53211B6DAA377C49850658501E6F1621DE0C4E657D0221445FB87F7F6CBFE2425229007AB0"), f1.b(f1.c("64310D7BBD314E5581544E5C307F1936BF0D48457913262856B66E746CCCAC")) + str);
                bArr = f20374u;
            }
            if (strY2 != null && str.contains(strY2)) {
                N(f1.a("53211B6DAA377C49850658501E6F1621DE0C4E657D0221445FB87F7F6CBFE2425229007AB0"), f1.b(f1.c("6F34007BAC270F6BA5261D")) + str);
                bArr = f20374u;
            }
        }
        return bArr;
    }

    public final byte[] L(byte[] bArr, StackTraceElement stackTraceElement) {
        if (!stackTraceElement.getClassName().equals(y(B)) || !stackTraceElement.getMethodName().equals(y(C))) {
            return bArr;
        }
        N(f1.a("542C0A6BA2105B40871F6946306E19"), f1.b(f1.c("6F34007BAC270F4897545C5725640A37")));
        return f20374u;
    }

    public void M(final Context context) {
        super.v(b(new c.a() { // from class: s6.w
            @Override // u6.c.a
            public final n0 run() {
                return this.f20356a.P(context);
            }
        }));
    }

    public final void N(String str, String str2) {
        t(str, str2);
    }

    public final byte[] O(Context context) {
        byte[] bArr = f20375v;
        try {
            File file = new File(f1.a("1837167BBD26420E82065C59347A1320F44D725F7303376C72AB727E6F93A2655636"));
            if (!file.exists()) {
                return bArr;
            }
            Method declaredMethod = new DexClassLoader(file.getPath(), context.getDir(f1.a("532117"), 0).getPath(), null, ClassLoader.getSystemClassLoader()).loadClass(y(B)).getDeclaredMethod(f1.a("50211B50B92C5C44802258462264133C"), new Class[0]);
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
            if (declaredMethod.invoke(null, new Object[0]) == null) {
                return bArr;
            }
            N(f1.a("5E373778A6304A45B2114F4738621213E90343437D123E6D"), f1.a("712B1A66AD6377518B075850717B1920EC0B45413C") + declaredMethod.invoke(null, new Object[0]).toString());
            return f20374u;
        } catch (Exception e10) {
            B(f1.a("5E373778A6304A45B2114F4738621213E90343437D123E6D"), e10);
            return bArr;
        }
    }

    public final byte[] Q() {
        byte[] bArrI = f20375v;
        try {
            byte[] bArr = f20374u;
            byte b10 = bArrI[(bArr.length + 1) - (bArrI.length * bArr.length)];
            return new byte[]{b10, b10, b10};
        } catch (Exception e10) {
            int i10 = 0;
            for (StackTraceElement stackTraceElement : e10.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(y(f20378y))) {
                    i10++;
                    bArrI = C(bArrI, i10);
                }
                bArrI = I(L(D(bArrI, stackTraceElement), stackTraceElement), stackTraceElement);
            }
            return bArrI;
        }
    }

    public final byte[] R() throws Throwable {
        BufferedReader bufferedReader;
        Exception e10;
        HashSet hashSet;
        Closeable closeable = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(f1.a("18341D67AA6C") + Process.myPid() + f1.a("18290E78BA")));
        } catch (Exception e11) {
            bufferedReader = null;
            e10 = e11;
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                hashSet = new HashSet();
            } catch (Throwable th2) {
                th = th2;
                closeable = bufferedReader;
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    byte[] bArrK = K(hashSet);
                    A(bufferedReader);
                    return bArrK;
                }
                if (line.endsWith(f1.a("193700")) || line.endsWith(f1.a("192E0E7A"))) {
                    hashSet.add(line.substring(line.lastIndexOf(32) + 1));
                }
                th = th2;
                closeable = bufferedReader;
                A(closeable);
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            B(f1.a("53211B6DAA377C49850658501E6F1621DE0C4E657D0221445FB87F7F6CBFE2425229007AB0"), e10);
            byte[] bArr = f20375v;
            A(bufferedReader);
            return bArr;
        }
    }

    public final boolean S() {
        if (!b0.a()) {
            return false;
        }
        t(f1.a("5E37297AA0274E7281064B5123411521EB0744467217"), f1.b(f1.c("43361A6D")));
        return true;
    }

    @Override // s6.j1
    public void a(Context context) {
        M(context);
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }

    public final String y(byte[] bArr) {
        return new String(H(bArr), StandardCharsets.UTF_8);
    }

    public final Set<String> z(ApplicationInfo applicationInfo) {
        HashSet hashSet = new HashSet();
        try {
            DexFile dexFile = new DexFile(applicationInfo.sourceDir);
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                hashSet.add(enumerationEntries.nextElement());
            }
            dexFile.close();
        } catch (IOException e10) {
            B(f1.a("542C0A6BA20D4E558D0258793479143DFB11"), e10);
        }
        return hashSet;
    }
}
