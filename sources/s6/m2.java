package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public final class m2 extends a1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g2 f20221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f20222l;

    public static final class a extends ae.s implements zd.l<Byte, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f20223a = new a();

        public a() {
            super(1);
        }

        public final CharSequence a(byte b10) {
            String str = String.format(f1.a("12745D70"), Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            ae.r.e(str, f1.b(f1.c("512B1D65A83707558C1D4E1871271D20F81103")));
            return str;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b10) {
            return a(b10.byteValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(h3 h3Var, u6.k kVar, g2 g2Var, o oVar) {
        super(h3Var, kVar);
        ae.r.f(h3Var, f1.a("5B2B086FAC31"));
        ae.r.f(kVar, f1.a("45210E6BBD2A404F"));
        this.f20221k = g2Var;
        this.f20222l = oVar;
    }

    public static final n0 z(PackageManager packageManager, m2 m2Var, Set set, Set set2) {
        ae.r.f(m2Var, f1.a("432C067BED73"));
        ae.r.f(set, f1.b(f1.c("13370A7C8625624088035C4634441231F6064F416803")));
        ae.r.f(set2, f1.b(f1.c("13371A7BB92A4C488B014E75217D0F")));
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(4224);
        ae.r.e(installedPackages, f1.b(f1.c("47250C63A8244A6C851A5C53347F5235FA1663416F043364D259BD7B6F93C16E5925086DBB6D6864B02B7071054C2316DE366B06")));
        o oVar = m2Var.f20222l;
        if (oVar != null && oVar.a()) {
            p0 p0Var = p0.f20248a;
            p0Var.a();
            p0Var.f();
        }
        for (PackageInfo packageInfo : installedPackages) {
            String str = packageInfo.packageName;
            p0 p0Var2 = p0.f20248a;
            ae.r.e(str, f1.b(f1.c("47250C63A8244A6F851958")));
            if (!p0Var2.h(str) && !p0Var2.g(str, packageInfo.lastUpdateTime)) {
                r2 r2Var = new r2();
                ae.r.e(packageManager, f1.b(f1.c("47250C63A8244A6C851A5C53347F")));
                ae.r.e(packageInfo, f1.b(f1.c("47250C63A8244A688A1252")));
                String strW = m2Var.w(packageManager, packageInfo, r2Var);
                if (strW != null) {
                    if (!r2Var.f20289a.isEmpty()) {
                        set.add(r2Var);
                    }
                    set2.add(new t6.b(packageInfo, strW));
                } else {
                    p0Var2.d(str, packageInfo.lastUpdateTime);
                }
            }
        }
        if (!set.isEmpty()) {
            m2Var.j(set);
        }
        return new n0(set2.isEmpty(), true, true);
    }

    public final boolean A(PackageInfo packageInfo) {
        return D(packageInfo) || G(packageInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(android.content.pm.PackageInfo r11, s6.r2 r12) {
        /*
            r10 = this;
            java.lang.String[] r0 = r11.requestedPermissions
            int[] r11 = r11.requestedPermissionsFlags
            s6.g2 r1 = r10.f20221k
            if (r1 == 0) goto Ld
            java.util.List r1 = r1.d()
            goto Le
        Ld:
            r1 = 0
        Le:
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1b
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L19
            goto L1b
        L19:
            r4 = r2
            goto L1c
        L1b:
            r4 = r3
        L1c:
            if (r4 != 0) goto L8e
            if (r0 == 0) goto L8e
            if (r11 == 0) goto L8e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.length
            r6 = r2
            r7 = r6
        L2a:
            if (r6 >= r5) goto L42
            r8 = r0[r6]
            int r9 = r7 + 1
            r7 = r11[r7]
            r7 = r7 & 2
            if (r7 == 0) goto L38
            r7 = r3
            goto L39
        L38:
            r7 = r2
        L39:
            if (r7 == 0) goto L3e
            r4.add(r8)
        L3e:
            int r6 = r6 + 1
            r7 = r9
            goto L2a
        L42:
            java.util.Set r11 = nd.s.H0(r4)
            java.util.Iterator r0 = r1.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            java.util.List r1 = (java.util.List) r1
            boolean r4 = r1.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L4a
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L64
            goto L7c
        L64:
            java.util.Iterator r4 = r1.iterator()
        L68:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7c
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r11.contains(r5)
            if (r5 != 0) goto L68
            r4 = r2
            goto L7d
        L7c:
            r4 = r3
        L7d:
            if (r4 == 0) goto L4a
            s6.j0 r11 = new s6.j0
            java.lang.String r0 = "44311C78A020464E91076D5123601521EC0B45415B02336644BC7F"
            java.lang.String r0 = s6.f1.a(r0)
            r11.<init>(r0, r1)
            r12.a(r11)
            return r3
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.m2.B(android.content.pm.PackageInfo, s6.r2):boolean");
    }

    public final void C(Context context) {
        if (this.f20221k == null) {
            return;
        }
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        final LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        final PackageManager packageManager = context.getPackageManager();
        n0 n0VarB = b(new c.a() { // from class: s6.l2
            @Override // u6.c.a
            public final n0 run() {
                return m2.z(packageManager, this, linkedHashSet, linkedHashSet2);
            }
        });
        ae.r.e(n0VarB, f1.a("47211D6EA6314263881B5E5F71767672BF420A0F3C507228D259BD3221DAAC7B45310A24E9375D54815D3714712D5C72BF420A52"));
        v(n0VarB, new ArrayList<>(linkedHashSet2));
    }

    public final boolean D(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        return (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
    }

    public final boolean E(PackageInfo packageInfo, r2 r2Var) {
        g2 g2Var = this.f20221k;
        List<String> listC = g2Var != null ? g2Var.c() : null;
        if (!(listC == null || listC.isEmpty())) {
            String strX = x(new File(packageInfo.applicationInfo.sourceDir));
            if (nd.c0.S(listC, strX)) {
                r2Var.a(new h1(f1.a("5A25037FA8314A69850755763D6C1F39F30B595B"), strX));
                return true;
            }
        }
        return false;
    }

    public final boolean F(PackageManager packageManager, PackageInfo packageInfo, r2 r2Var) {
        String strA;
        if (A(packageInfo)) {
            return false;
        }
        String str = packageInfo.packageName;
        try {
            if (Build.VERSION.SDK_INT >= 30 ? (strA = packageManager.getInstallSourceInfo(str).getInitiatingPackageName()) == null : (strA = packageManager.getInstallerPackageName(str)) == null) {
                strA = f1.a("422A0466A63441");
            }
        } catch (Exception unused) {
            strA = f1.a("52361D67BB");
        }
        if (!I(strA)) {
            return false;
        }
        r2Var.a(new h1(f1.a("44311C78A020464E9107745A22791D3EF3035E46731E016745AB787F"), strA));
        return true;
    }

    public final boolean G(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String str = applicationInfo != null ? applicationInfo.sourceDir : null;
        if (!(str != null ? je.v.G(str, f1.a("1837167BBD26420E85044D1B"), false, 2, null) : false)) {
            if (!(str != null ? je.v.G(str, f1.a("1837167BBD26420E940654427C6C0C22B0"), false, 2, null) : false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean H(PackageInfo packageInfo, r2 r2Var) {
        int iIndexOf;
        g2 g2Var = this.f20221k;
        List<String> listB = g2Var != null ? g2Var.b() : null;
        if ((listB == null || listB.isEmpty()) || (iIndexOf = listB.indexOf(packageInfo.packageName)) < 0) {
            return false;
        }
        r2Var.a(new h1(f1.a("5A25037FA8314A718517565536683233F20768437D13396459AA6F"), String.valueOf(iIndexOf)));
        return true;
    }

    public final boolean I(String str) {
        List<String> listA;
        if (ae.r.b(str, f1.a("52361D67BB"))) {
            return false;
        }
        g2 g2Var = this.f20221k;
        return !((g2Var == null || (listA = g2Var.a()) == null) ? false : nd.c0.S(listA, str));
    }

    @Override // s6.j1
    public void a(Context context) {
        ae.r.f(context, f1.a("542B017CAC3B5B"));
        C(context);
    }

    public final String w(PackageManager packageManager, PackageInfo packageInfo, r2 r2Var) {
        String str;
        if (H(packageInfo, r2Var) || E(packageInfo, r2Var)) {
            str = "55280E6BA22F465290";
        } else if (B(packageInfo, r2Var) && F(packageManager, packageInfo, r2Var)) {
            str = "44311C78A020464E91076D5123601521EC0B4541";
        } else {
            if (!F(packageManager, packageInfo, r2Var)) {
                return null;
            }
            str = "5E2A1C7CA82F43728B014F5734";
        }
        return f1.a(str);
    }

    public final String x(File file) {
        MessageDigest messageDigest;
        FileInputStream fileInputStream;
        byte[] bArr;
        try {
            messageDigest = MessageDigest.getInstance(f1.a("640C2E25FB7619"));
            fileInputStream = new FileInputStream(file);
            try {
                bArr = new byte[8192];
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
        while (true) {
            int i10 = fileInputStream.read(bArr);
            if (i10 == -1) {
                md.i0 i0Var = md.i0.f15558a;
                xd.b.a(fileInputStream, null);
                byte[] bArrDigest = messageDigest.digest();
                ae.r.e(bArrDigest, f1.b(f1.c("532D086DBA3701458D135847252555")));
                return y(bArrDigest);
            }
            messageDigest.update(bArr, 0, i10);
            return null;
        }
    }

    public final String y(byte[] bArr) {
        return nd.p.l0(bArr, f1.a(""), null, null, 0, null, a.f20223a, 30, null);
    }
}
