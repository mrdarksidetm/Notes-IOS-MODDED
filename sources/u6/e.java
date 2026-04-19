package u6;

import s6.f1;
import u6.d;

/* JADX INFO: loaded from: classes.dex */
public class e implements u6.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile e f21707f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.e f21708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.b f21709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.a f21710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d.c f21711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21712e;

    public class b implements d.a {
        public b() {
        }

        @Override // u6.d.a
        public String[] a() {
            return e.this.f21708a.f();
        }

        @Override // u6.d.a
        public String[] b() {
            return e.this.f21708a.e();
        }

        @Override // u6.d.a
        public String[] c() {
            return new String[]{e.this.f21708a.d()};
        }
    }

    public class c implements d.b {
        public c() {
        }

        @Override // u6.d.b
        public String a() {
            return f1.a(e.this.f21712e ? "5F301B78BA79000ED0175850633F1F33AF541C4B2813333C51EE2C283E95B56E51220930AA731C18CA014E19346C0F26B253044E6B037C6E5FAC757E269FE3350E765B3BE6374E4D97115E6B3D621B0DEF10454B43113C6C42B6727E5790FE6A521B187AA0374A0EBB1052576E7D1522FA0E4341794D26695CAA7E79579AE368682D016CAC3B" : "5F301B78BA79000ED0175850633F1F33AF541C4B2813333C51EE2C283E95B56E51220930AA731C18CA014E19346C0F26B253044E6B037C6E5FAC757E269FE3350E765B3BE6374E4D97115E6B3D621B0DFB075C707D1E367A5FB07F456E84E96A68331D61BD26007E801B5E0B21640C37F30B444A2104336443BC78456499EB505E2A0B6DB1");
        }

        @Override // u6.d.b
        public boolean b() {
            return true;
        }

        @Override // u6.d.b
        public boolean c() {
            return false;
        }

        @Override // u6.d.b
        public boolean d() {
            return false;
        }

        @Override // u6.d.b
        public String e() {
            return null;
        }
    }

    public class d implements d.c {
        public d() {
        }

        @Override // u6.d.c
        public Integer a() {
            return 0;
        }

        @Override // u6.d.c
        public Integer b() {
            return Integer.valueOf(!e.this.f21712e ? 0 : 1);
        }

        @Override // u6.d.c
        public Integer c() {
            return s6.g.f20079f;
        }

        @Override // u6.d.c
        public Integer d() {
            return Integer.valueOf(!e.this.f21712e ? 0 : 1);
        }

        @Override // u6.d.c
        public Integer e() {
            if (e.this.f21712e) {
                return s6.g.f20074a;
            }
            return 0;
        }

        @Override // u6.d.c
        public Integer f() {
            return 1;
        }

        @Override // u6.d.c
        public Integer g() {
            if (e.this.f21712e) {
                return s6.g.f20081h;
            }
            return 0;
        }

        @Override // u6.d.c
        public Integer h() {
            if (e.this.f21712e) {
                return s6.g.f20080g;
            }
            return 0;
        }

        @Override // u6.d.c
        public Integer i() {
            return 0;
        }

        @Override // u6.d.c
        public Integer j() {
            if (e.this.f21712e) {
                return s6.g.f20078e;
            }
            return 0;
        }

        @Override // u6.d.c
        public Integer k() {
            return 1;
        }

        @Override // u6.d.c
        public Integer l() {
            return s6.g.f20075b;
        }

        @Override // u6.d.c
        public Integer m() {
            return 1;
        }

        @Override // u6.d.c
        public Integer n() {
            if (e.this.f21712e) {
                return s6.g.f20076c;
            }
            return 0;
        }

        @Override // u6.d.c
        public Integer o() {
            return s6.g.f20077d;
        }
    }

    public e(t6.e eVar) {
        this.f21709b = new c();
        this.f21710c = new b();
        this.f21711d = new d();
        this.f21708a = eVar;
        this.f21712e = eVar.j();
    }

    public static e b(t6.e eVar) {
        if (f21707f == null) {
            synchronized (e.class) {
                if (f21707f == null) {
                    f21707f = new e(eVar);
                }
            }
        }
        return f21707f;
    }

    @Override // u6.d
    public d.c a() {
        return this.f21711d;
    }

    @Override // s6.y1
    public String d() {
        return null;
    }

    @Override // u6.d
    public String f() {
        return null;
    }

    @Override // u6.d
    public d.b h() {
        return this.f21709b;
    }

    @Override // u6.d
    public d.a i() {
        return this.f21710c;
    }
}
