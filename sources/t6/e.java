package t6;

import android.util.Base64;
import s6.f1;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f21273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f21275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f21276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f21277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[][] f21278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String[] f21279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f21280i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f21282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f21283c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String[] f21284d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String[] f21285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String[] f21286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String[][] f21287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String[] f21288h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f21289i = true;

        public a(String str, String[] strArr) {
            this.f21281a = str;
            this.f21282b = strArr;
        }

        public a c(String[] strArr) {
            this.f21286f = strArr;
            return this;
        }

        public a d(String[] strArr) {
            this.f21285e = strArr;
            return this;
        }

        public e e() {
            return new e(this);
        }

        public a m(boolean z10) {
            this.f21289i = z10;
            return this;
        }

        public a n(String[] strArr) {
            this.f21284d = strArr;
            return this;
        }

        public a o(String[][] strArr) {
            this.f21287g = strArr;
            return this;
        }

        public a p(String str) {
            this.f21283c = str;
            return this;
        }

        public a q(String[] strArr) {
            this.f21288h = strArr;
            return this;
        }
    }

    public e(a aVar) {
        if (aVar.f21281a == null) {
            throw new IllegalArgumentException(f1.a("723C1F6DAA374A45B4155E5F306A191CFE0F4F0F7503726645B57734"));
        }
        a(aVar.f21282b);
        this.f21272a = aVar.f21281a;
        this.f21273b = aVar.f21282b;
        this.f21274c = aVar.f21283c;
        this.f21275d = aVar.f21284d;
        this.f21276e = aVar.f21285e;
        this.f21277f = aVar.f21286f;
        this.f21278g = aVar.f21287g;
        this.f21279h = aVar.f21288h;
        this.f21280i = aVar.f21289i;
    }

    public static void a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException(f1.a("723C1F6DAA374A45C42754533F641235BF214F5D6819346153B86F7F28BEED7C5F211C28A8314A018A1B491435681A3BF1074E0F751E725C51B5687F6BB5E361512D08"));
        }
        for (String str : strArr) {
            try {
                if (Base64.decode(str, 2).length != 32) {
                    throw new IllegalArgumentException(f1.a("723C1F6DAA374A45C42754533F641235BF214F5D6819346153B86F7F28BEED7C5F211C28AA2C4155851D531438630A33F30B4E0F791E267A49F73B5F6682FE761778") + str + f1.b(f1.c("0964067BE92D4055C42775757C3F4964BF104F5F6E15216D5EAD7A6E6199E22F58224F7CA1260F528D13535D3F6A5C31FA105E467A19316944BC3B7366D6CE6E4421593CE7")));
                }
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(f1.a("723C1F6DAA374A45C42754533F641235BF214F5D6819346153B86F7F28BEED7C5F211C28AA2C4155851D531438630A33F30B4E0F791E267A49F73B5F6682FE761778") + str + f1.b(f1.c("0964067BE92D4055C41D5314136C0F37A9560A4973023F26")), e10);
            }
        }
    }

    public String[] b() {
        return this.f21277f;
    }

    public String[] c() {
        return this.f21276e;
    }

    public String d() {
        return this.f21272a;
    }

    public String[] e() {
        return this.f21273b;
    }

    public String[] f() {
        return this.f21275d;
    }

    public String[][] g() {
        return this.f21278g;
    }

    public String h() {
        return this.f21274c;
    }

    public String[] i() {
        return this.f21279h;
    }

    public boolean j() {
        return this.f21280i;
    }
}
