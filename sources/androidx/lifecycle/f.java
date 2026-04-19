package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import java.util.Iterator;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4310a = new f();

    public static final class a implements d.a {
        @Override // x4.d.a
        public void a(x4.f fVar) {
            ae.r.f(fVar, "owner");
            if (!(fVar instanceof o4.q)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
            }
            z viewModelStore = ((o4.q) fVar).getViewModelStore();
            x4.d savedStateRegistry = fVar.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                w wVarB = viewModelStore.b(it.next());
                ae.r.c(wVarB);
                f.a(wVarB, savedStateRegistry, fVar.getLifecycle());
            }
            if (!viewModelStore.c().isEmpty()) {
                savedStateRegistry.i(a.class);
            }
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f4311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x4.d f4312b;

        b(g gVar, x4.d dVar) {
            this.f4311a = gVar;
            this.f4312b = dVar;
        }

        @Override // androidx.lifecycle.i
        public void s(o4.e eVar, g.a aVar) {
            ae.r.f(eVar, "source");
            ae.r.f(aVar, "event");
            if (aVar == g.a.ON_START) {
                this.f4311a.c(this);
                this.f4312b.i(a.class);
            }
        }
    }

    private f() {
    }

    public static final void a(w wVar, x4.d dVar, g gVar) {
        ae.r.f(wVar, "viewModel");
        ae.r.f(dVar, "registry");
        ae.r.f(gVar, "lifecycle");
        s sVar = (s) wVar.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (sVar == null || sVar.c()) {
            return;
        }
        sVar.a(dVar, gVar);
        f4310a.c(dVar, gVar);
    }

    public static final s b(x4.d dVar, g gVar, String str, Bundle bundle) {
        ae.r.f(dVar, "registry");
        ae.r.f(gVar, "lifecycle");
        ae.r.c(str);
        s sVar = new s(str, q.f4374f.a(dVar.b(str), bundle));
        sVar.a(dVar, gVar);
        f4310a.c(dVar, gVar);
        return sVar;
    }

    private final void c(x4.d dVar, g gVar) {
        g.b bVarB = gVar.b();
        if (bVarB == g.b.INITIALIZED || bVarB.b(g.b.STARTED)) {
            dVar.i(a.class);
        } else {
            gVar.a(new b(gVar, dVar));
        }
    }
}
