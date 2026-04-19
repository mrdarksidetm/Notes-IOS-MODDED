package e7;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements a0 {

    static final class a extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10634a = new a();

        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String str = Build.VERSION.RELEASE;
            ae.r.e(str, "RELEASE");
            return str;
        }
    }

    static final class b extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10635a = new b();

        b() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String str = Build.FINGERPRINT;
            ae.r.e(str, "FINGERPRINT");
            return str;
        }
    }

    static final class c extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f10636a = new c();

        c() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String property = System.getProperty("os.version");
            return property == null ? "" : property;
        }
    }

    static final class d extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f10637a = new d();

        d() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String str = Build.MANUFACTURER;
            ae.r.e(str, "MANUFACTURER");
            return str;
        }
    }

    static final class e extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f10638a = new e();

        e() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            String str = Build.MODEL;
            ae.r.e(str, "MODEL");
            return str;
        }
    }

    static final class f extends ae.s implements zd.a<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f10639a = new f();

        f() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            return String.valueOf(Build.VERSION.SDK_INT);
        }
    }

    @Override // e7.a0
    public String a() {
        return (String) g7.a.a(a.f10634a, "");
    }

    @Override // e7.a0
    public String b() {
        return (String) g7.a.a(e.f10638a, "");
    }

    @Override // e7.a0
    public String c() {
        return (String) g7.a.a(f.f10639a, "");
    }

    @Override // e7.a0
    public String d() {
        return (String) g7.a.a(b.f10635a, "");
    }

    @Override // e7.a0
    public String e() {
        return (String) g7.a.a(c.f10636a, "");
    }

    @Override // e7.a0
    public String f() {
        return (String) g7.a.a(d.f10637a, "");
    }
}
