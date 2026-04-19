package r6;

import ae.r;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p6.d;
import t6.f;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f.b, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f19200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<p6.d> f19201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<t6.b> f19202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static a f19203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final t6.f f19204e;

    public interface a {
        void a(List<t6.b> list);

        void b(p6.d dVar);
    }

    static {
        d dVar = new d();
        f19200a = dVar;
        f19201b = new LinkedHashSet();
        f19202c = new ArrayList();
        f19204e = new t6.f(dVar, dVar);
    }

    private d() {
    }

    private final void q(List<t6.b> list) {
        a aVar = f19203d;
        if (aVar != null) {
            aVar.a(list);
        } else {
            f19202c.addAll(list);
        }
    }

    private final void r(p6.d dVar) {
        a aVar = f19203d;
        if (aVar != null) {
            aVar.b(dVar);
        } else {
            f19201b.add(dVar);
        }
    }

    @Override // t6.f.b
    public void a(List<t6.b> list) {
    }

    @Override // t6.f.a
    public void b() {
    }

    @Override // t6.f.a
    public void c() {
    }

    @Override // t6.f.a
    public void d() {
    }

    @Override // t6.f.a
    public void e() {
    }

    @Override // t6.f.b
    public void f() {
    }

    @Override // t6.f.b
    public void g() {
    }

    @Override // t6.f.b
    public void h() {
    }

    @Override // t6.f.b
    public void i() {
    }

    @Override // t6.f.b
    public void j() {
    }

    @Override // t6.f.b
    public void k() {
    }

    @Override // t6.f.b
    public void l() {
    }

    @Override // t6.f.a
    public void m() {
    }

    @Override // t6.f.b
    public void n() {
    }

    public final List<t6.b> o() {
        return f19202c;
    }

    public final Set<p6.d> p() {
        return f19201b;
    }

    public final void s(Context context) {
    }

    public final void t(a aVar) {
        f19203d = aVar;
    }

    public final void u(Context context) {
    }
}
