package s6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.provider.Settings;
import android.util.Base64;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public final class o3 extends r1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final k3 f20239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u6.d f20240m;

    public o3(h3 h3Var, w2 w2Var, u6.k kVar, k3 k3Var, u6.d dVar) {
        super(h3Var, w2Var, kVar);
        this.f20239l = k3Var;
        this.f20240m = dVar;
    }

    public static byte[] F(byte[] bArr) throws r0 {
        try {
            return MessageDigest.getInstance(f1.a("640C2E25FB7619")).digest(bArr);
        } catch (NoSuchAlgorithmException e10) {
            throw new r0(-8884, f1.a("72361D67BB6358498D185814396C0F3AF60C4D0F781126691E"), e10);
        }
    }

    public static X509Certificate H(Signature signature) {
        return (X509Certificate) CertificateFactory.getInstance(f1.a("6F715F31")).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n0 W(Context context) {
        x(T(context));
        boolean zE = E(N(context));
        w(zE);
        return new n0(!(zE | C(context, context.getPackageName())), !(S(context) | Q(context) | O()), G(context).booleanValue());
    }

    public final String A(Signature signature) throws r0 {
        byte[] bArrF = F(signature.toByteArray());
        String strEncodeToString = Base64.encodeToString(bArrF, 2);
        t6.a.a(bArrF);
        return strEncodeToString;
    }

    public final void B(Signature[] signatureArr, List<String> list) {
        try {
            u(f1.a("5E2A1969A52A4B728D13535525780E37DB0B4D4A6F041E6143AD"), list);
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(H(signature));
            }
            r(f1.b(f1.c("5E2A1969A52A4B628106495D37641F33EB0763417A1F1E6143AD")), arrayList);
        } catch (Exception e10) {
            q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), e10.getMessage());
        }
    }

    public final boolean C(Context context, String str) {
        for (String str2 : this.f20239l.b()) {
            if (str2.equals(str)) {
                return false;
            }
        }
        t(f1.a("5E2A0C67BB314A4290245C573A6C1B37D103474A"), context.getPackageName());
        return true;
    }

    public final boolean D(List<String> list) {
        boolean z10;
        Iterator<String> it = list.iterator();
        do {
            z10 = true;
            if (!it.hasNext()) {
                return true;
            }
            String next = it.next();
            String[] strArrA = this.f20239l.a();
            int length = strArrA.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (next.equals(strArrA[i10])) {
                    break;
                }
                i10++;
            }
        } while (z10);
        return false;
    }

    public final boolean E(Signature[] signatureArr) {
        String strA;
        String strB;
        if (signatureArr.length == 0) {
            strA = f1.a("56341F41A7374A46961D494D12651931F427585D7302");
            strB = f1.b(f1.c("622A0E6AA5260F558B544F51257F1537E9070A5C75173C6944AC697F26"));
        } else {
            if (signatureArr.length == 1) {
                if (L(signatureArr[0])) {
                    return false;
                }
                try {
                    t(f1.a("5F251C41A7354E4D8D106E5D36631D26EA104F6B7517377B44"), A(signatureArr[0]));
                    f(f1.b(f1.c("54211D7CA02546428500587D3F6B13")), H(signatureArr[0]));
                } catch (Exception e10) {
                    t(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), e10.getMessage());
                }
                return true;
            }
            strA = f1.a("5F251C45BC2F5B4894185867386A1233EB17584A6F");
            strB = f1.b(f1.c("43361A6D"));
        }
        t(strA, strB);
        return true;
    }

    public final Boolean G(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 28 ? Boolean.valueOf(U(context)) : Boolean.valueOf(V(context));
        } catch (PackageManager.NameNotFoundException e10) {
            q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), e10.getMessage());
            return Boolean.FALSE;
        }
    }

    public final List<String> I(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(A(signature));
        }
        return arrayList;
    }

    public final boolean J(List<String> list) {
        Iterator<String> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            String next = it.next();
            for (String str : this.f20239l.a()) {
                if (next.equals(str)) {
                    return true;
                }
            }
        }
    }

    public final int K(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), f1.a("5E2A1C7CA82F437E8A1B536B3C6C0E39FA16754E6C0021"), 0);
    }

    public final boolean L(Signature signature) {
        try {
            return M(signature);
        } catch (r0 e10) {
            t(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), e10.getMessage());
            return false;
        }
    }

    public final boolean M(Signature signature) throws r0 {
        String strA = A(signature);
        for (String str : this.f20239l.a()) {
            if (str.equals(strA)) {
                return true;
            }
        }
        return false;
    }

    public final Signature[] N(Context context) {
        try {
            return P(context);
        } catch (PackageManager.NameNotFoundException unused) {
            return new Signature[0];
        }
    }

    public final boolean O() {
        String strF = this.f20240m.f();
        if (strF == null) {
            return false;
        }
        t(f1.a("44200441A7374A46961D494D12621122ED0D47466F1536"), strF);
        return true;
    }

    public final Signature[] P(Context context) {
        return z(context, 64).signatures;
    }

    public final boolean Q(Context context) {
        Pair<String, X509Certificate> pairA = t3.a(context, this.f20239l.a());
        if (pairA == null) {
            return false;
        }
        if (pairA.first == null) {
            return true;
        }
        t(f1.a("5F251C41A7354E4D8D106E5D36631D26EA104F6B7517377B44977A6E6180E9"), (String) pairA.first);
        return true;
    }

    public final boolean R(Context context) {
        return K(context) == 1;
    }

    public final boolean S(Context context) {
        String strB = t3.b(context, this.f20239l.b());
        if (strB == null) {
            return false;
        }
        t(f1.a("5E2A0C67BB314A4290245C573A6C1B37D103474A5211266146BC"), strB);
        return true;
    }

    public final boolean T(Context context) {
        return Build.VERSION.SDK_INT < 26 && R(context);
    }

    public final boolean U(Context context) {
        SigningInfo signingInfo = z(context, 134217728).signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners == null || apkContentsSigners.length == 0) {
                q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), f1.b(f1.c("622A0E6AA5260F558B544F51257F1537E9070A42691C266140B57E3A7B9FEB6152361C26")));
                return false;
            }
            try {
                List<String> listI = I(apkContentsSigners);
                if (D(listI)) {
                    return true;
                }
                B(apkContentsSigners, listI);
                return false;
            } catch (r0 e10) {
                q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), e10.getMessage());
                return false;
            }
        }
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        if (signingCertificateHistory == null || signingCertificateHistory.length == 0) {
            q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), f1.b(f1.c("622A0E6AA5260F558B544F51257F1537E9070A4C7902266156B0787B7C93AC675E371B67BB3A01")));
            return false;
        }
        try {
            List<String> listI2 = I(signingCertificateHistory);
            if (J(listI2)) {
                return true;
            }
            B(signingCertificateHistory, listI2);
            return false;
        } catch (r0 e11) {
            q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), e11.getMessage());
            return false;
        }
    }

    public final boolean V(Context context) {
        Signature[] signatureArr = z(context, 64).signatures;
        if (signatureArr == null || signatureArr.length == 0) {
            q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), f1.b(f1.c("622A0E6AA5260F558B544F51257F1537E9070A5C75173C6944AC697F26")));
            return false;
        }
        try {
            List<String> listI = I(signatureArr);
            if (D(listI)) {
                return true;
            }
            B(signatureArr, listI);
            return false;
        } catch (r0 e10) {
            q(f1.a("56341F41A7374A46961D494D12651931F427585D7302"), e10.getMessage());
            return false;
        }
    }

    public void X(final Context context) {
        v(b(new c.a() { // from class: s6.n3
            @Override // u6.c.a
            public final n0 run() {
                return this.f20235a.W(context);
            }
        }));
    }

    @Override // s6.j1
    public void a(Context context) {
        X(context);
    }

    @Override // s6.r1, s6.j1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public final PackageInfo z(Context context, int i10) {
        return context.getPackageManager().getPackageInfo(context.getPackageName(), i10);
    }
}
