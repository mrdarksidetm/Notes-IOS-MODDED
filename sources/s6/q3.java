package s6;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.io.File;
import java.util.List;
import s6.h;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class q3 extends i0 {

    public class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f20283a;

        public a(Context context) {
            this.f20283a = context;
        }

        @Override // u6.c.a
        public n0 run() {
            boolean zO = q3.this.O() | q3.this.M() | q3.this.I() | q3.this.J() | q3.this.N() | q3.this.L() | q3.this.K() | q3.this.Q();
            boolean zA = q3.this.A(this.f20283a);
            boolean zP = q3.this.P();
            List<h.a> listA = new h().a();
            if (!listA.isEmpty()) {
                q3 q3Var = q3.this;
                String strA = f1.a("542C0A6BA20642548815495B234F0E33F106");
                h.a aVar = listA.get(0);
                aVar.getClass();
                q3Var.t(strA, aVar.f20121i);
                q3.this.g(f1.b(f1.c("5125046D8D26594887116D463E6B153EFA")), listA.get(0).l());
                if (e.a("51310364", f1.b(f1.c("55251C61AA")))) {
                    zP = true;
                } else {
                    zO = true;
                }
            }
            return new n0(!zO, !zA, !zP);
        }
    }

    public q3(h3 h3Var, w2 w2Var, u6.k kVar) {
        super(h3Var, w2Var, kVar);
    }

    public final boolean A(Context context) {
        TelephonyManager telephonyManagerD = D(context);
        if (telephonyManagerD == null) {
            return false;
        }
        return x(telephonyManagerD) || E(telephonyManagerD) || B(telephonyManagerD) || G(telephonyManagerD);
    }

    public final boolean B(TelephonyManager telephonyManager) {
        if (!H(telephonyManager.getSimSerialNumber(), f1.a("0F7D5F39FD721F12D6450C0560354963AF55181F"))) {
            return false;
        }
        t(f1.b(f1.c("542C0A6BA210464CB7114F5D3061")), telephonyManager.getSimSerialNumber());
        return true;
    }

    public final boolean C(i iVar, String str) {
        if (str.isEmpty()) {
            return false;
        }
        String strA = f1.a("542C0A6BA2135D4E94114F40285A143BFC0A635C531E3E717FB75E777D9AED7B5836");
        iVar.getClass();
        t(strA, iVar.f20138a);
        return true;
    }

    public final TelephonyManager D(Context context) {
        if (Build.VERSION.SDK_INT >= 29 || context.checkSelfPermission(f1.a("562A0B7AA62A4B0F94114F59387E0F3BF00C047D59311657609154544DA9DF5B76102A")) != 0) {
            return null;
        }
        return (TelephonyManager) context.getSystemService(f1.b(f1.c("472C0066AC")));
    }

    public final boolean E(TelephonyManager telephonyManager) {
        if (!H(telephonyManager.getSubscriberId(), f1.a("04755F3AFF731F11D4440D04613D4C"))) {
            return false;
        }
        t(f1.b(f1.c("542C0A6BA2105A4397065456347F3536")), telephonyManager.getSubscriberId());
        return true;
    }

    public void F(Context context) {
        super.v(b(new a(context)));
    }

    public final boolean G(TelephonyManager telephonyManager) {
        if (!H(telephonyManager.getVoiceMailNumber(), f1.a("06715A3DFB721814D44004"))) {
            return false;
        }
        t(f1.b(f1.c("542C0A6BA21540488711705538613227F2004F5D")), telephonyManager.getVoiceMailNumber());
        return true;
    }

    public final boolean H(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.contains(str2);
    }

    public final boolean I() {
        for (String str : l3.f20203n) {
            if (Build.BRAND.contains(str)) {
                t(f1.a("542C0A6BA20642548815495B234F0E33F106"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean J() {
        for (String str : l3.f20204o) {
            if (Build.DEVICE.contains(str)) {
                t(f1.a("542C0A6BA20642548815495B23491924F6014F"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean K() {
        for (String str : l3.f20207r) {
            if (Build.FINGERPRINT.contains(str)) {
                t(f1.a("542C0A6BA20642548815495B234B153CF807585F6E193C7C"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean L() {
        for (String str : l3.f20206q) {
            if (Build.HARDWARE.contains(str)) {
                t(f1.a("542C0A6BA20642548815495B23451D20FB154B5D79"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean M() {
        for (String str : l3.f20202m) {
            if (Build.MANUFACTURER.contains(str)) {
                t(f1.a("542C0A6BA20642548815495B23401D3CEA044B4C6805206D42"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean N() {
        for (String str : l3.f20205p) {
            if (Build.MODEL.contains(str)) {
                t(f1.a("542C0A6BA20642548815495B23401336FA0E"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean O() {
        for (String str : l3.f20201l) {
            if (Build.PRODUCT.contains(str)) {
                t(f1.a("542C0A6BA20642548815495B235D0E3DFB17495B"), str);
                return true;
            }
        }
        return false;
    }

    public final boolean P() {
        boolean zC = false;
        for (i iVar : l3.f20208s) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f1.a("50211B78BB2C5F01"));
            iVar.getClass();
            sb2.append(iVar.f20138a);
            String strC = j3.c(sb2.toString());
            if (strC != null) {
                zC |= iVar.f20139b == null ? C(iVar, strC) : y(iVar, strC);
            }
        }
        return zC;
    }

    public final boolean Q() {
        for (String str : l3.f20209t) {
            File file = new File(str);
            try {
                if (file.exists() && file.isDirectory()) {
                    t(f1.a("542C0A6BA20642548815495B235D0E3DFB17495B"), f1.a("75281A6D9A374E428F07"));
                    return true;
                }
            } catch (SecurityException unused) {
            }
        }
        return false;
    }

    @Override // s6.j1
    public void a(Context context) {
        F(context);
    }

    @Override // s6.i0, s6.j1
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public final boolean x(TelephonyManager telephonyManager) {
        if (!H(telephonyManager.getLine1Number(), f1.a("06715A3DFC711E14D1"))) {
            return false;
        }
        t(f1.b(f1.c("542C0A6BA20F464F814573413C6F1920")), telephonyManager.getLine1Number());
        return true;
    }

    public final boolean y(i iVar, String str) {
        iVar.getClass();
        boolean z10 = false;
        for (String str2 : iVar.f20139b) {
            if (str.equals(str2)) {
                t(f1.a("542C0A6BA20642548815495B235D0E3DEF07585B6526336445BC68"), iVar.f20138a + f1.b(f1.c("177E4F")) + str);
                z10 = true;
            }
        }
        return z10;
    }
}
