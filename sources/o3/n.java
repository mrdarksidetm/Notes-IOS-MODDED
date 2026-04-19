package o3;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f16338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<b0> f16339b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<b0, a> f16340c = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.g f16341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.i f16342b;

        a(androidx.lifecycle.g gVar, androidx.lifecycle.i iVar) {
            this.f16341a = gVar;
            this.f16342b = iVar;
            gVar.a(iVar);
        }

        void a() {
            this.f16341a.c(this.f16342b);
            this.f16342b = null;
        }
    }

    public n(Runnable runnable) {
        this.f16338a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(b0 b0Var, o4.e eVar, g.a aVar) {
        if (aVar == g.a.ON_DESTROY) {
            l(b0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(g.b bVar, b0 b0Var, o4.e eVar, g.a aVar) {
        if (aVar == g.a.i(bVar)) {
            c(b0Var);
            return;
        }
        if (aVar == g.a.ON_DESTROY) {
            l(b0Var);
        } else if (aVar == g.a.b(bVar)) {
            this.f16339b.remove(b0Var);
            this.f16338a.run();
        }
    }

    public void c(b0 b0Var) {
        this.f16339b.add(b0Var);
        this.f16338a.run();
    }

    public void d(final b0 b0Var, o4.e eVar) {
        c(b0Var);
        androidx.lifecycle.g lifecycle = eVar.getLifecycle();
        a aVarRemove = this.f16340c.remove(b0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f16340c.put(b0Var, new a(lifecycle, new androidx.lifecycle.i() { // from class: o3.l
            @Override // androidx.lifecycle.i
            public final void s(o4.e eVar2, g.a aVar) {
                this.f16333a.f(b0Var, eVar2, aVar);
            }
        }));
    }

    public void e(final b0 b0Var, o4.e eVar, final g.b bVar) {
        androidx.lifecycle.g lifecycle = eVar.getLifecycle();
        a aVarRemove = this.f16340c.remove(b0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f16340c.put(b0Var, new a(lifecycle, new androidx.lifecycle.i() { // from class: o3.m
            @Override // androidx.lifecycle.i
            public final void s(o4.e eVar2, g.a aVar) {
                this.f16335a.g(bVar, b0Var, eVar2, aVar);
            }
        }));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<b0> it = this.f16339b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<b0> it = this.f16339b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<b0> it = this.f16339b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<b0> it = this.f16339b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(b0 b0Var) {
        this.f16339b.remove(b0Var);
        a aVarRemove = this.f16340c.remove(b0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f16338a.run();
    }
}
