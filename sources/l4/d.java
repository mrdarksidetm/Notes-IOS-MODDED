package l4;

import ae.r;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import nd.c0;
import nd.r0;
import nd.y0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f14746a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f14747b = c.f14759e;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
        void a(n nVar);
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f14758d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f14759e = new c(y0.b(), null, r0.e());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<a> f14760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f14761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, Set<Class<? extends n>>> f14762c;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(ae.j jVar) {
                this();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(Set<? extends a> set, b bVar, Map<String, ? extends Set<Class<? extends n>>> map) {
            r.f(set, "flags");
            r.f(map, "allowedViolations");
            this.f14760a = set;
            this.f14761b = bVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Set<Class<? extends n>>> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f14762c = linkedHashMap;
        }

        public final Set<a> a() {
            return this.f14760a;
        }

        public final b b() {
            return this.f14761b;
        }

        public final Map<String, Set<Class<? extends n>>> c() {
            return this.f14762c;
        }
    }

    private d() {
    }

    private final c c(androidx.fragment.app.n nVar) {
        while (nVar != null) {
            if (nVar.isAdded()) {
                w parentFragmentManager = nVar.getParentFragmentManager();
                r.e(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.C0() != null) {
                    c cVarC0 = parentFragmentManager.C0();
                    r.c(cVarC0);
                    return cVarC0;
                }
            }
            nVar = nVar.getParentFragment();
        }
        return f14747b;
    }

    private final void d(final c cVar, final n nVar) {
        androidx.fragment.app.n nVarA = nVar.a();
        final String name = nVarA.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, nVar);
        }
        if (cVar.b() != null) {
            r(nVarA, new Runnable() { // from class: l4.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.e(cVar, nVar);
                }
            });
        }
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            r(nVarA, new Runnable() { // from class: l4.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.f(name, nVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(c cVar, n nVar) {
        r.f(cVar, "$policy");
        r.f(nVar, "$violation");
        cVar.b().a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(String str, n nVar) {
        r.f(nVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, nVar);
        throw nVar;
    }

    private final void g(n nVar) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + nVar.a().getClass().getName(), nVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(androidx.fragment.app.n nVar, String str) {
        r.f(nVar, "fragment");
        r.f(str, "previousFragmentId");
        l4.a aVar = new l4.a(nVar, str);
        d dVar = f14746a;
        dVar.g(aVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_FRAGMENT_REUSE) && dVar.s(cVarC, nVar.getClass(), aVar.getClass())) {
            dVar.d(cVarC, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(androidx.fragment.app.n nVar, ViewGroup viewGroup) {
        r.f(nVar, "fragment");
        e eVar = new e(nVar, viewGroup);
        d dVar = f14746a;
        dVar.g(eVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && dVar.s(cVarC, nVar.getClass(), eVar.getClass())) {
            dVar.d(cVarC, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(androidx.fragment.app.n nVar) {
        r.f(nVar, "fragment");
        f fVar = new f(nVar);
        d dVar = f14746a;
        dVar.g(fVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && dVar.s(cVarC, nVar.getClass(), fVar.getClass())) {
            dVar.d(cVarC, fVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(androidx.fragment.app.n nVar) {
        r.f(nVar, "fragment");
        g gVar = new g(nVar);
        d dVar = f14746a;
        dVar.g(gVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.s(cVarC, nVar.getClass(), gVar.getClass())) {
            dVar.d(cVarC, gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(androidx.fragment.app.n nVar) {
        r.f(nVar, "fragment");
        h hVar = new h(nVar);
        d dVar = f14746a;
        dVar.g(hVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.s(cVarC, nVar.getClass(), hVar.getClass())) {
            dVar.d(cVarC, hVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(androidx.fragment.app.n nVar) {
        r.f(nVar, "fragment");
        j jVar = new j(nVar);
        d dVar = f14746a;
        dVar.g(jVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && dVar.s(cVarC, nVar.getClass(), jVar.getClass())) {
            dVar.d(cVarC, jVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(androidx.fragment.app.n nVar, androidx.fragment.app.n nVar2, int i10) {
        r.f(nVar, "violatingFragment");
        r.f(nVar2, "targetFragment");
        k kVar = new k(nVar, nVar2, i10);
        d dVar = f14746a;
        dVar.g(kVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && dVar.s(cVarC, nVar.getClass(), kVar.getClass())) {
            dVar.d(cVarC, kVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(androidx.fragment.app.n nVar, boolean z10) {
        r.f(nVar, "fragment");
        l lVar = new l(nVar, z10);
        d dVar = f14746a;
        dVar.g(lVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && dVar.s(cVarC, nVar.getClass(), lVar.getClass())) {
            dVar.d(cVarC, lVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(androidx.fragment.app.n nVar, ViewGroup viewGroup) {
        r.f(nVar, "fragment");
        r.f(viewGroup, "container");
        o oVar = new o(nVar, viewGroup);
        d dVar = f14746a;
        dVar.g(oVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && dVar.s(cVarC, nVar.getClass(), oVar.getClass())) {
            dVar.d(cVarC, oVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(androidx.fragment.app.n nVar, androidx.fragment.app.n nVar2, int i10) {
        r.f(nVar, "fragment");
        r.f(nVar2, "expectedParentFragment");
        p pVar = new p(nVar, nVar2, i10);
        d dVar = f14746a;
        dVar.g(pVar);
        c cVarC = dVar.c(nVar);
        if (cVarC.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && dVar.s(cVarC, nVar.getClass(), pVar.getClass())) {
            dVar.d(cVarC, pVar);
        }
    }

    private final void r(androidx.fragment.app.n nVar, Runnable runnable) {
        if (nVar.isAdded()) {
            Handler handlerH = nVar.getParentFragmentManager().w0().h();
            if (!r.b(handlerH.getLooper(), Looper.myLooper())) {
                handlerH.post(runnable);
                return;
            }
        }
        runnable.run();
    }

    private final boolean s(c cVar, Class<? extends androidx.fragment.app.n> cls, Class<? extends n> cls2) {
        Set<Class<? extends n>> set = cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (r.b(cls2.getSuperclass(), n.class) || !c0.S(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
