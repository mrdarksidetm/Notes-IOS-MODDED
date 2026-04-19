package x4;

import ae.j;
import ae.r;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import x4.d;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22959b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f22960a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: x4.b$b, reason: collision with other inner class name */
    public static final class C0477b implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<String> f22961a;

        public C0477b(d dVar) {
            r.f(dVar, "registry");
            this.f22961a = new LinkedHashSet();
            dVar.h("androidx.savedstate.Restarter", this);
        }

        @Override // x4.d.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f22961a));
            return bundle;
        }

        public final void b(String str) {
            r.f(str, "className");
            this.f22961a.add(str);
        }
    }

    public b(f fVar) {
        r.f(fVar, "owner");
        this.f22960a = fVar;
    }

    private final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(d.a.class);
            r.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    r.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((d.a) objNewInstance).a(this.f22960a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.i
    public void s(o4.e eVar, g.a aVar) {
        r.f(eVar, "source");
        r.f(aVar, "event");
        if (aVar != g.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        eVar.getLifecycle().c(this);
        Bundle bundleB = this.f22960a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
