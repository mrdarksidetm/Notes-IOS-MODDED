package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class z extends androidx.lifecycle.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final y.b f4291h = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f4295d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, n> f4292a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, z> f4293b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.z> f4294c = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4296e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4297f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4298g = false;

    class a implements y.b {
        a() {
        }

        @Override // androidx.lifecycle.y.b
        public <T extends androidx.lifecycle.w> T create(Class<T> cls) {
            return new z(true);
        }
    }

    z(boolean z10) {
        this.f4295d = z10;
    }

    private void d(String str, boolean z10) {
        z zVar = this.f4293b.get(str);
        if (zVar != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(zVar.f4293b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zVar.c((String) it.next(), true);
                }
            }
            zVar.onCleared();
            this.f4293b.remove(str);
        }
        androidx.lifecycle.z zVar2 = this.f4294c.get(str);
        if (zVar2 != null) {
            zVar2.a();
            this.f4294c.remove(str);
        }
    }

    static z g(androidx.lifecycle.z zVar) {
        return (z) new androidx.lifecycle.y(zVar, f4291h).a(z.class);
    }

    void a(n nVar) {
        if (this.f4298g) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4292a.containsKey(nVar.mWho)) {
                return;
            }
            this.f4292a.put(nVar.mWho, nVar);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + nVar);
            }
        }
    }

    void b(n nVar, boolean z10) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + nVar);
        }
        d(nVar.mWho, z10);
    }

    void c(String str, boolean z10) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        d(str, z10);
    }

    n e(String str) {
        return this.f4292a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f4292a.equals(zVar.f4292a) && this.f4293b.equals(zVar.f4293b) && this.f4294c.equals(zVar.f4294c);
    }

    z f(n nVar) {
        z zVar = this.f4293b.get(nVar.mWho);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f4295d);
        this.f4293b.put(nVar.mWho, zVar2);
        return zVar2;
    }

    Collection<n> h() {
        return new ArrayList(this.f4292a.values());
    }

    public int hashCode() {
        return (((this.f4292a.hashCode() * 31) + this.f4293b.hashCode()) * 31) + this.f4294c.hashCode();
    }

    androidx.lifecycle.z i(n nVar) {
        androidx.lifecycle.z zVar = this.f4294c.get(nVar.mWho);
        if (zVar != null) {
            return zVar;
        }
        androidx.lifecycle.z zVar2 = new androidx.lifecycle.z();
        this.f4294c.put(nVar.mWho, zVar2);
        return zVar2;
    }

    boolean j() {
        return this.f4296e;
    }

    void k(n nVar) {
        if (this.f4298g) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4292a.remove(nVar.mWho) != null) && w.J0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + nVar);
        }
    }

    void l(boolean z10) {
        this.f4298g = z10;
    }

    boolean m(n nVar) {
        if (this.f4292a.containsKey(nVar.mWho)) {
            return this.f4295d ? this.f4296e : !this.f4297f;
        }
        return true;
    }

    @Override // androidx.lifecycle.w
    protected void onCleared() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4296e = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<n> it = this.f4292a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4293b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4294c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
