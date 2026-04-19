package h;

import ae.j;
import ae.n0;
import ae.r;
import ae.s;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import ie.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f11560h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, String> f11561a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, Integer> f11562b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, c> f11563c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f11564d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map<String, a<?>> f11565e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, Object> f11566f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f11567g = new Bundle();

    private static final class a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final h.b<O> f11568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i.a<?, O> f11569b;

        public a(h.b<O> bVar, i.a<?, O> aVar) {
            r.f(bVar, "callback");
            r.f(aVar, "contract");
            this.f11568a = bVar;
            this.f11569b = aVar;
        }

        public final h.b<O> a() {
            return this.f11568a;
        }

        public final i.a<?, O> b() {
            return this.f11569b;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(j jVar) {
            this();
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.g f11570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<androidx.lifecycle.i> f11571b;

        public c(androidx.lifecycle.g gVar) {
            r.f(gVar, "lifecycle");
            this.f11570a = gVar;
            this.f11571b = new ArrayList();
        }

        public final void a(androidx.lifecycle.i iVar) {
            r.f(iVar, "observer");
            this.f11570a.a(iVar);
            this.f11571b.add(iVar);
        }

        public final void b() {
            Iterator<T> it = this.f11571b.iterator();
            while (it.hasNext()) {
                this.f11570a.c((androidx.lifecycle.i) it.next());
            }
            this.f11571b.clear();
        }
    }

    static final class d extends s implements zd.a<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f11572a = new d();

        d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final Integer invoke() {
            return Integer.valueOf(ee.c.f10965a.d(2147418112) + 65536);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public static final class e<I> extends h.d<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i.a<I, O> f11575c;

        e(String str, i.a<I, O> aVar) {
            this.f11574b = str;
            this.f11575c = aVar;
        }

        @Override // h.d
        public void b(I i10, d3.c cVar) throws Exception {
            Object obj = f.this.f11562b.get(this.f11574b);
            Object obj2 = this.f11575c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                f.this.f11564d.add(this.f11574b);
                try {
                    f.this.i(iIntValue, this.f11575c, i10, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f11564d.remove(this.f11574b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // h.d
        public void c() {
            f.this.p(this.f11574b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: h.f$f, reason: collision with other inner class name */
    public static final class C0277f<I> extends h.d<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f11577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i.a<I, O> f11578c;

        C0277f(String str, i.a<I, O> aVar) {
            this.f11577b = str;
            this.f11578c = aVar;
        }

        @Override // h.d
        public void b(I i10, d3.c cVar) throws Exception {
            Object obj = f.this.f11562b.get(this.f11577b);
            Object obj2 = this.f11578c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                f.this.f11564d.add(this.f11577b);
                try {
                    f.this.i(iIntValue, this.f11578c, i10, cVar);
                    return;
                } catch (Exception e10) {
                    f.this.f11564d.remove(this.f11577b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // h.d
        public void c() {
            f.this.p(this.f11577b);
        }
    }

    private final void d(int i10, String str) {
        this.f11561a.put(Integer.valueOf(i10), str);
        this.f11562b.put(str, Integer.valueOf(i10));
    }

    private final <O> void g(String str, int i10, Intent intent, a<O> aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f11564d.contains(str)) {
            this.f11566f.remove(str);
            this.f11567g.putParcelable(str, new h.a(i10, intent));
        } else {
            aVar.a().onActivityResult(aVar.b().parseResult(i10, intent));
            this.f11564d.remove(str);
        }
    }

    private final int h() {
        for (Number number : m.g(d.f11572a)) {
            if (!this.f11561a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(f fVar, String str, h.b bVar, i.a aVar, o4.e eVar, g.a aVar2) {
        r.f(fVar, "this$0");
        r.f(str, "$key");
        r.f(bVar, "$callback");
        r.f(aVar, "$contract");
        r.f(eVar, "<anonymous parameter 0>");
        r.f(aVar2, "event");
        if (g.a.ON_START != aVar2) {
            if (g.a.ON_STOP == aVar2) {
                fVar.f11565e.remove(str);
                return;
            } else {
                if (g.a.ON_DESTROY == aVar2) {
                    fVar.p(str);
                    return;
                }
                return;
            }
        }
        fVar.f11565e.put(str, new a<>(bVar, aVar));
        if (fVar.f11566f.containsKey(str)) {
            Object obj = fVar.f11566f.get(str);
            fVar.f11566f.remove(str);
            bVar.onActivityResult(obj);
        }
        h.a aVar3 = (h.a) androidx.core.os.a.a(fVar.f11567g, str, h.a.class);
        if (aVar3 != null) {
            fVar.f11567g.remove(str);
            bVar.onActivityResult(aVar.parseResult(aVar3.b(), aVar3.a()));
        }
    }

    private final void o(String str) {
        if (this.f11562b.get(str) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = this.f11561a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, this.f11565e.get(str));
        return true;
    }

    public final <O> boolean f(int i10, O o10) {
        String str = this.f11561a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.f11565e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f11567g.remove(str);
            this.f11566f.put(str, o10);
            return true;
        }
        h.b<?> bVarA = aVar.a();
        r.d(bVarA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f11564d.remove(str)) {
            return true;
        }
        bVarA.onActivityResult(o10);
        return true;
    }

    public abstract <I, O> void i(int i10, i.a<I, O> aVar, I i11, d3.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f11564d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f11567g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f11562b.containsKey(str)) {
                Integer numRemove = this.f11562b.remove(str);
                if (!this.f11567g.containsKey(str)) {
                    n0.d(this.f11561a).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i10);
            r.e(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i10);
            r.e(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle bundle) {
        r.f(bundle, "outState");
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f11562b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f11562b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f11564d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f11567g));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> h.d<I> l(String str, i.a<I, O> aVar, h.b<O> bVar) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(aVar, "contract");
        r.f(bVar, "callback");
        o(str);
        this.f11565e.put(str, new a<>(bVar, aVar));
        if (this.f11566f.containsKey(str)) {
            Object obj = this.f11566f.get(str);
            this.f11566f.remove(str);
            bVar.onActivityResult(obj);
        }
        h.a aVar2 = (h.a) androidx.core.os.a.a(this.f11567g, str, h.a.class);
        if (aVar2 != null) {
            this.f11567g.remove(str);
            bVar.onActivityResult(aVar.parseResult(aVar2.b(), aVar2.a()));
        }
        return new C0277f(str, aVar);
    }

    public final <I, O> h.d<I> m(final String str, o4.e eVar, final i.a<I, O> aVar, final h.b<O> bVar) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(eVar, "lifecycleOwner");
        r.f(aVar, "contract");
        r.f(bVar, "callback");
        androidx.lifecycle.g lifecycle = eVar.getLifecycle();
        if (!lifecycle.b().b(g.b.STARTED)) {
            o(str);
            c cVar = this.f11563c.get(str);
            if (cVar == null) {
                cVar = new c(lifecycle);
            }
            cVar.a(new androidx.lifecycle.i() { // from class: h.e
                @Override // androidx.lifecycle.i
                public final void s(o4.e eVar2, g.a aVar2) {
                    f.n(this.f11556a, str, bVar, aVar, eVar2, aVar2);
                }
            });
            this.f11563c.put(str, cVar);
            return new e(str, aVar);
        }
        throw new IllegalStateException(("LifecycleOwner " + eVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
    }

    public final void p(String str) {
        Integer numRemove;
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!this.f11564d.contains(str) && (numRemove = this.f11562b.remove(str)) != null) {
            this.f11561a.remove(numRemove);
        }
        this.f11565e.remove(str);
        if (this.f11566f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f11566f.get(str));
            this.f11566f.remove(str);
        }
        if (this.f11567g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((h.a) androidx.core.os.a.a(this.f11567g, str, h.a.class)));
            this.f11567g.remove(str);
        }
        c cVar = this.f11563c.get(str);
        if (cVar != null) {
            cVar.b();
            this.f11563c.remove(str);
        }
    }
}
