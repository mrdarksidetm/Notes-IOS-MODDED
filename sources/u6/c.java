package u6;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import s6.a0;
import s6.f0;
import s6.f1;
import s6.g1;
import s6.h1;
import s6.h3;
import s6.j0;
import s6.j1;
import s6.n;
import s6.n0;
import s6.o0;
import s6.p3;
import s6.q;
import s6.r2;
import s6.u3;
import s6.v;
import s6.v2;
import u6.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements j1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f21700g = f1.a("7E2A0C61AD264155A81B5A");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h3 f21704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0 f21705e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o0> f21701a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o0> f21702b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<o0> f21703c = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p3 f21706f = new u3();

    public interface a {
        n0 run();
    }

    public c(h3 h3Var) {
        this.f21704d = h3Var;
        this.f21705e = h3Var.a();
    }

    public n0 b(a aVar) {
        long jNanoTime = System.nanoTime() / 1000000;
        n0 n0VarRun = aVar.run();
        n0VarRun.b((System.nanoTime() / 1000000) - jNanoTime);
        return n0VarRun;
    }

    public void c(String str, Integer num) {
        d(str, num, false);
    }

    public void d(String str, Integer num, boolean z10) {
        ArrayList arrayList = new ArrayList(this.f21702b.size() + this.f21701a.size());
        arrayList.addAll(this.f21701a);
        arrayList.addAll(this.f21702b);
        List<o0> list = this.f21703c;
        if (list == null) {
            this.f21703c = arrayList;
            p(str, num, z10);
        } else if (list.size() == arrayList.size() && this.f21703c.containsAll(arrayList)) {
            this.f21701a.clear();
            this.f21702b.clear();
        } else {
            this.f21703c = arrayList;
            p(str, num, z10);
        }
    }

    public void e(String str, String str2) {
    }

    public void f(String str, X509Certificate x509Certificate) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("742C0A6BA20D4E4C814E1D"));
            f1.b(f1.c("1B640666AF2C1501"));
            x509Certificate.toString();
        }
        this.f21701a.add(new q(str, x509Certificate));
    }

    public void g(String str, JSONObject jSONObject) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("742C0A6BA20D4E4C814E1D"));
            f1.b(f1.c("1B640666AF2C1501"));
            jSONObject.toString();
        }
        this.f21701a.add(new g1(str, jSONObject));
    }

    public final void h(String str, v.a aVar, Long l10) {
        this.f21705e.b(str, aVar, l10);
    }

    public void i(String str, n0 n0Var) {
        h(str, !n0Var.d() ? v.a.f20335a : v.a.f20336b, n0Var.a());
    }

    public void j(Set<r2> set) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("742C0A6BA20D4E4C814E1D5930610B33ED077A4E7F1B336F55AA373A6198EA600D64"));
            Objects.toString(set);
        }
        this.f21701a.add(new v2(set));
    }

    public void k(f.b bVar, int i10) {
        if (bVar != null) {
            bVar.a(i10);
        }
    }

    public void l(int[] iArr) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("742C0A6BA20D4E4C814E1D5C307E3A37FE165F5D7924377B44B0757D4C97F86E1B640666AF2C1501"));
        }
        this.f21701a.add(new n(iArr));
    }

    public boolean m(Integer num) {
        return num != null && num.intValue() > 2;
    }

    public final void n(String str) {
        if (this.f21701a.isEmpty() && this.f21702b.isEmpty()) {
            return;
        }
        this.f21704d.c(str, this.f21701a, this.f21702b);
        this.f21701a.clear();
        this.f21702b.clear();
    }

    public void o(String str, Integer num) {
        p(str, num, false);
    }

    public void p(String str, Integer num, boolean z10) {
        if (!s6.e.a("55251C61AA", f1.a("55251C61AA"))) {
            if (num == null || z10) {
                num = 3;
            }
            this.f21706f.a(num.intValue());
            if (num.intValue() != 3) {
                s(str);
                return;
            }
        }
        n(str);
    }

    public void q(String str, String str2) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("71210E7CBC314A0190114E4038631B72FC0A4F4C773E336555E33B"));
            f1.b(f1.c("1B640666AF2C1501"));
        }
        this.f21702b.add(new h1(str, str2));
    }

    public void r(String str, List<X509Certificate> list) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("71210E7CBC314A0190114E4038631B72FC0A4F4C773E336555E33B"));
            f1.b(f1.c("1B640666AF2C1501"));
            Objects.toString(list);
        }
        this.f21702b.add(new f0(str, list));
    }

    public void s(String str) {
        if (this.f21701a.isEmpty() && this.f21702b.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f21701a.size());
        arrayList.addAll(this.f21701a);
        ArrayList arrayList2 = new ArrayList(this.f21702b.size());
        arrayList2.addAll(this.f21702b);
        this.f21704d.d(str, arrayList, arrayList2);
        this.f21701a.clear();
        this.f21702b.clear();
    }

    public void t(String str, String str2) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("742C0A6BA20D4E4C814E1D"));
            f1.b(f1.c("1B640666AF2C1501"));
        }
        this.f21701a.add(new h1(str, str2));
    }

    public void u(String str, List<String> list) {
        if (s6.e.a("53210D7DAE", f1.a("4521036DA8304A"))) {
            f1.b(f1.c("7E2A0C61AD264155A81B5A"));
            f1.b(f1.c("71210E7CBC314A0190114E4038631B72FC0A4F4C773E336555E33B"));
            f1.b(f1.c("1B640666AF2C1501"));
            Objects.toString(list);
        }
        this.f21702b.add(new j0(str, list));
    }
}
