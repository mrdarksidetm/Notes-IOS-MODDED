package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d0;
import androidx.lifecycle.g;
import d3.z;
import h.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l4.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    private static boolean U = false;
    static boolean V = true;
    androidx.fragment.app.n A;
    private h.d<Intent> F;
    private h.d<h.h> G;
    private h.d<String[]> H;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private ArrayList<androidx.fragment.app.a> O;
    private ArrayList<Boolean> P;
    private ArrayList<androidx.fragment.app.n> Q;
    private z R;
    private d.c S;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4241b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<androidx.fragment.app.n> f4244e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e.r f4246g;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private t<?> f4263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private k4.i f4264y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private androidx.fragment.app.n f4265z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<n> f4240a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f4242c = new c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f4243d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final u f4245f = new u(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    androidx.fragment.app.a f4247h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f4248i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e.q f4249j = new b(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f4250k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, androidx.fragment.app.c> f4251l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, Bundle> f4252m = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, Object> f4253n = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList<m> f4254o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final v f4255p = new v(this);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CopyOnWriteArrayList<k4.o> f4256q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final n3.a<Configuration> f4257r = new n3.a() { // from class: k4.j
        @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            this.f14394a.S0((Configuration) obj);
        }
    };

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final n3.a<Integer> f4258s = new n3.a() { // from class: k4.k
        @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            this.f14395a.T0((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n3.a<d3.g> f4259t = new n3.a() { // from class: k4.l
        @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            this.f14396a.U0((d3.g) obj);
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final n3.a<d3.z> f4260u = new n3.a() { // from class: k4.m
        @Override // n3.a, androidx.window.extensions.core.util.function.Consumer
        public final void accept(Object obj) {
            this.f14397a.V0((z) obj);
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final o3.b0 f4261v = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    int f4262w = -1;
    private s B = null;
    private s C = new d();
    private m0 D = null;
    private m0 E = new e();
    ArrayDeque<l> I = new ArrayDeque<>();
    private Runnable T = new f();

    class a implements h.b<Map<String, Boolean>> {
        a() {
        }

        @Override // h.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(Map<String, Boolean> map) {
            StringBuilder sb2;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            l lVarPollFirst = w.this.I.pollFirst();
            if (lVarPollFirst == null) {
                sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
            } else {
                String str = lVarPollFirst.f4276a;
                int i11 = lVarPollFirst.f4277b;
                androidx.fragment.app.n nVarI = w.this.f4242c.i(str);
                if (nVarI != null) {
                    nVarI.onRequestPermissionsResult(i11, strArr, iArr);
                    return;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Permission request result delivered for unknown Fragment ");
                    sb2.append(str);
                }
            }
            Log.w("FragmentManager", sb2.toString());
        }
    }

    class b extends e.q {
        b(boolean z10) {
            super(z10);
        }

        @Override // e.q
        public void c() {
            if (w.J0(3)) {
                Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            if (w.V) {
                w.this.p();
                w.this.f4247h = null;
            }
        }

        @Override // e.q
        public void d() {
            if (w.J0(3)) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            w.this.F0();
        }

        @Override // e.q
        public void e(e.b bVar) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            w wVar = w.this;
            if (wVar.f4247h != null) {
                Iterator<l0> it = wVar.v(new ArrayList<>(Collections.singletonList(w.this.f4247h)), 0, 1).iterator();
                while (it.hasNext()) {
                    it.next().y(bVar);
                }
                Iterator<m> it2 = w.this.f4254o.iterator();
                while (it2.hasNext()) {
                    it2.next().b(bVar);
                }
            }
        }

        @Override // e.q
        public void f(e.b bVar) {
            if (w.J0(3)) {
                Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = " + w.V + " fragment manager " + w.this);
            }
            if (w.V) {
                w.this.Y();
                w.this.j1();
            }
        }
    }

    class c implements o3.b0 {
        c() {
        }

        @Override // o3.b0
        public boolean a(MenuItem menuItem) {
            return w.this.K(menuItem);
        }

        @Override // o3.b0
        public void b(Menu menu) {
            w.this.L(menu);
        }

        @Override // o3.b0
        public void c(Menu menu, MenuInflater menuInflater) {
            w.this.D(menu, menuInflater);
        }

        @Override // o3.b0
        public void d(Menu menu) {
            w.this.P(menu);
        }
    }

    class d extends s {
        d() {
        }

        @Override // androidx.fragment.app.s
        public androidx.fragment.app.n a(ClassLoader classLoader, String str) {
            return w.this.w0().b(w.this.w0().f(), str, null);
        }
    }

    class e implements m0 {
        e() {
        }

        @Override // androidx.fragment.app.m0
        public l0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.e(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.b0(true);
        }
    }

    class g implements k4.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.n f4272a;

        g(androidx.fragment.app.n nVar) {
            this.f4272a = nVar;
        }

        @Override // k4.o
        public void a(w wVar, androidx.fragment.app.n nVar) {
            this.f4272a.onAttachFragment(nVar);
        }
    }

    class h implements h.b<h.a> {
        h() {
        }

        @Override // h.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(h.a aVar) {
            l lVarPollLast = w.this.I.pollLast();
            if (lVarPollLast == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVarPollLast.f4276a;
            int i10 = lVarPollLast.f4277b;
            androidx.fragment.app.n nVarI = w.this.f4242c.i(str);
            if (nVarI != null) {
                nVarI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements h.b<h.a> {
        i() {
        }

        @Override // h.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onActivityResult(h.a aVar) {
            l lVarPollFirst = w.this.I.pollFirst();
            if (lVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVarPollFirst.f4276a;
            int i10 = lVarPollFirst.f4277b;
            androidx.fragment.app.n nVarI = w.this.f4242c.i(str);
            if (nVarI != null) {
                nVarI.onActivityResult(i10, aVar.b(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends i.a<h.h, h.a> {
        j() {
        }

        @Override // i.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(Context context, h.h hVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intentA = hVar.a();
            if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new h.a(hVar.e()).b(null).c(hVar.d(), hVar.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (w.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h.a parseResult(int i10, Intent intent) {
            return new h.a(i10, intent);
        }
    }

    public static abstract class k {
    }

    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f4276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4277b;

        class a implements Parcelable.Creator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i10) {
                return new l[i10];
            }
        }

        l(Parcel parcel) {
            this.f4276a = parcel.readString();
            this.f4277b = parcel.readInt();
        }

        l(String str, int i10) {
            this.f4276a = str;
            this.f4277b = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f4276a);
            parcel.writeInt(this.f4277b);
        }
    }

    public interface m {
        default void a(androidx.fragment.app.n nVar, boolean z10) {
        }

        default void b(e.b bVar) {
        }

        default void c(androidx.fragment.app.n nVar, boolean z10) {
        }

        default void d() {
        }

        void onBackStackChanged();
    }

    interface n {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class o implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f4278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f4279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f4280c;

        o(String str, int i10, int i11) {
            this.f4278a = str;
            this.f4279b = i10;
            this.f4280c = i11;
        }

        @Override // androidx.fragment.app.w.n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.n nVar = w.this.A;
            if (nVar == null || this.f4279b >= 0 || this.f4278a != null || !nVar.getChildFragmentManager().e1()) {
                return w.this.h1(arrayList, arrayList2, this.f4278a, this.f4279b, this.f4280c);
            }
            return false;
        }
    }

    class p implements n {
        p() {
        }

        @Override // androidx.fragment.app.w.n
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            boolean zI1 = w.this.i1(arrayList, arrayList2);
            w wVar = w.this;
            wVar.f4248i = true;
            if (!wVar.f4254o.isEmpty() && arrayList.size() > 0) {
                boolean zBooleanValue = arrayList2.get(arrayList.size() - 1).booleanValue();
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<androidx.fragment.app.a> it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.addAll(w.this.o0(it.next()));
                }
                for (m mVar : w.this.f4254o) {
                    Iterator it2 = linkedHashSet.iterator();
                    while (it2.hasNext()) {
                        mVar.c((androidx.fragment.app.n) it2.next(), zBooleanValue);
                    }
                }
            }
            return zI1;
        }
    }

    static androidx.fragment.app.n D0(View view) {
        Object tag = view.getTag(j4.b.f13909a);
        if (tag instanceof androidx.fragment.app.n) {
            return (androidx.fragment.app.n) tag;
        }
        return null;
    }

    public static boolean J0(int i10) {
        return U || Log.isLoggable("FragmentManager", i10);
    }

    private boolean K0(androidx.fragment.app.n nVar) {
        return (nVar.mHasMenu && nVar.mMenuVisible) || nVar.mChildFragmentManager.q();
    }

    private boolean L0() {
        androidx.fragment.app.n nVar = this.f4265z;
        if (nVar == null) {
            return true;
        }
        return nVar.isAdded() && this.f4265z.getParentFragmentManager().L0();
    }

    private void M(androidx.fragment.app.n nVar) {
        if (nVar == null || !nVar.equals(g0(nVar.mWho))) {
            return;
        }
        nVar.performPrimaryNavigationFragmentChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(Configuration configuration) {
        if (L0()) {
            A(configuration, false);
        }
    }

    private void T(int i10) {
        try {
            this.f4241b = true;
            this.f4242c.d(i10);
            Z0(i10, false);
            Iterator<l0> it = u().iterator();
            while (it.hasNext()) {
                it.next().q();
            }
            this.f4241b = false;
            b0(true);
        } catch (Throwable th) {
            this.f4241b = false;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Integer num) {
        if (L0() && num.intValue() == 80) {
            G(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0(d3.g gVar) {
        if (L0()) {
            H(gVar.a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(d3.z zVar) {
        if (L0()) {
            O(zVar.a(), false);
        }
    }

    private void W() {
        if (this.N) {
            this.N = false;
            x1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        Iterator<l0> it = u().iterator();
        while (it.hasNext()) {
            it.next().q();
        }
    }

    private void a0(boolean z10) {
        if (this.f4241b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f4263x == null) {
            if (!this.M) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f4263x.h().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10) {
            r();
        }
        if (this.O == null) {
            this.O = new ArrayList<>();
            this.P = new ArrayList<>();
        }
    }

    private static void d0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            androidx.fragment.app.a aVar = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue()) {
                aVar.n(-1);
                aVar.s();
            } else {
                aVar.n(1);
                aVar.r();
            }
            i10++;
        }
    }

    private void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i10, int i11) {
        boolean z10 = arrayList.get(i10).f4009r;
        ArrayList<androidx.fragment.app.n> arrayList3 = this.Q;
        if (arrayList3 == null) {
            this.Q = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.Q.addAll(this.f4242c.o());
        androidx.fragment.app.n nVarA0 = A0();
        boolean z11 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            nVarA0 = !arrayList2.get(i12).booleanValue() ? aVar.t(this.Q, nVarA0) : aVar.w(this.Q, nVarA0);
            z11 = z11 || aVar.f4000i;
        }
        this.Q.clear();
        if (!z10 && this.f4262w >= 1) {
            for (int i13 = i10; i13 < i11; i13++) {
                Iterator<d0.a> it = arrayList.get(i13).f3994c.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.n nVar = it.next().f4012b;
                    if (nVar != null && nVar.mFragmentManager != null) {
                        this.f4242c.r(w(nVar));
                    }
                }
            }
        }
        d0(arrayList, arrayList2, i10, i11);
        boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
        if (z11 && !this.f4254o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<androidx.fragment.app.a> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(o0(it2.next()));
            }
            if (this.f4247h == null) {
                for (m mVar : this.f4254o) {
                    Iterator it3 = linkedHashSet.iterator();
                    while (it3.hasNext()) {
                        mVar.c((androidx.fragment.app.n) it3.next(), zBooleanValue);
                    }
                }
                for (m mVar2 : this.f4254o) {
                    Iterator it4 = linkedHashSet.iterator();
                    while (it4.hasNext()) {
                        mVar2.a((androidx.fragment.app.n) it4.next(), zBooleanValue);
                    }
                }
            }
        }
        for (int i14 = i10; i14 < i11; i14++) {
            androidx.fragment.app.a aVar2 = arrayList.get(i14);
            if (zBooleanValue) {
                for (int size = aVar2.f3994c.size() - 1; size >= 0; size--) {
                    androidx.fragment.app.n nVar2 = aVar2.f3994c.get(size).f4012b;
                    if (nVar2 != null) {
                        w(nVar2).m();
                    }
                }
            } else {
                Iterator<d0.a> it5 = aVar2.f3994c.iterator();
                while (it5.hasNext()) {
                    androidx.fragment.app.n nVar3 = it5.next().f4012b;
                    if (nVar3 != null) {
                        w(nVar3).m();
                    }
                }
            }
        }
        Z0(this.f4262w, true);
        for (l0 l0Var : v(arrayList, i10, i11)) {
            l0Var.B(zBooleanValue);
            l0Var.x();
            l0Var.n();
        }
        while (i10 < i11) {
            androidx.fragment.app.a aVar3 = arrayList.get(i10);
            if (arrayList2.get(i10).booleanValue() && aVar3.f3945v >= 0) {
                aVar3.f3945v = -1;
            }
            aVar3.v();
            i10++;
        }
        if (z11) {
            n1();
        }
    }

    private boolean g1(String str, int i10, int i11) {
        b0(false);
        a0(true);
        androidx.fragment.app.n nVar = this.A;
        if (nVar != null && i10 < 0 && str == null && nVar.getChildFragmentManager().e1()) {
            return true;
        }
        boolean zH1 = h1(this.O, this.P, str, i10, i11);
        if (zH1) {
            this.f4241b = true;
            try {
                l1(this.O, this.P);
            } finally {
                s();
            }
        }
        z1();
        W();
        this.f4242c.b();
        return zH1;
    }

    private int h0(String str, int i10, boolean z10) {
        if (this.f4243d.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f4243d.size() - 1;
        }
        int size = this.f4243d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.a aVar = this.f4243d.get(size);
            if ((str != null && str.equals(aVar.u())) || (i10 >= 0 && i10 == aVar.f3945v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f4243d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.a aVar2 = this.f4243d.get(size - 1);
            if ((str == null || !str.equals(aVar2.u())) && (i10 < 0 || i10 != aVar2.f3945v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    static w l0(View view) {
        androidx.fragment.app.n nVarM0 = m0(view);
        if (nVarM0 != null) {
            if (nVarM0.isAdded()) {
                return nVarM0.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + nVarM0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        androidx.fragment.app.o oVar = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof androidx.fragment.app.o) {
                oVar = (androidx.fragment.app.o) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (oVar != null) {
            return oVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private void l1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f4009r) {
                if (i11 != i10) {
                    e0(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f4009r) {
                        i11++;
                    }
                }
                e0(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            e0(arrayList, arrayList2, i11, size);
        }
    }

    static androidx.fragment.app.n m0(View view) {
        while (view != null) {
            androidx.fragment.app.n nVarD0 = D0(view);
            if (nVarD0 != null) {
                return nVarD0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void n0() {
        Iterator<l0> it = u().iterator();
        while (it.hasNext()) {
            it.next().r();
        }
    }

    private void n1() {
        for (int i10 = 0; i10 < this.f4254o.size(); i10++) {
            this.f4254o.get(i10).onBackStackChanged();
        }
    }

    private boolean p0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f4240a) {
            if (this.f4240a.isEmpty()) {
                return false;
            }
            try {
                int size = this.f4240a.size();
                boolean zA = false;
                for (int i10 = 0; i10 < size; i10++) {
                    zA |= this.f4240a.get(i10).a(arrayList, arrayList2);
                }
                return zA;
            } finally {
                this.f4240a.clear();
                this.f4263x.h().removeCallbacks(this.T);
            }
        }
    }

    static int p1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 8194) {
            return 4097;
        }
        if (i10 == 8197) {
            return 4100;
        }
        if (i10 != 4099) {
            return i10 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private void r() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private z r0(androidx.fragment.app.n nVar) {
        return this.R.f(nVar);
    }

    private void s() {
        this.f4241b = false;
        this.P.clear();
        this.O.clear();
    }

    private void t() {
        t<?> tVar = this.f4263x;
        boolean zIsChangingConfigurations = true;
        if (tVar instanceof o4.q) {
            zIsChangingConfigurations = this.f4242c.p().j();
        } else if (tVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) this.f4263x.f()).isChangingConfigurations();
        }
        if (zIsChangingConfigurations) {
            Iterator<androidx.fragment.app.c> it = this.f4251l.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().f3983a.iterator();
                while (it2.hasNext()) {
                    this.f4242c.p().c(it2.next(), false);
                }
            }
        }
    }

    private ViewGroup t0(androidx.fragment.app.n nVar) {
        ViewGroup viewGroup = nVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (nVar.mContainerId > 0 && this.f4264y.d()) {
            View viewC = this.f4264y.c(nVar.mContainerId);
            if (viewC instanceof ViewGroup) {
                return (ViewGroup) viewC;
            }
        }
        return null;
    }

    private Set<l0> u() {
        HashSet hashSet = new HashSet();
        Iterator<b0> it = this.f4242c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().mContainer;
            if (viewGroup != null) {
                hashSet.add(l0.v(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    private void v1(androidx.fragment.app.n nVar) {
        ViewGroup viewGroupT0 = t0(nVar);
        if (viewGroupT0 == null || nVar.getEnterAnim() + nVar.getExitAnim() + nVar.getPopEnterAnim() + nVar.getPopExitAnim() <= 0) {
            return;
        }
        int i10 = j4.b.f13911c;
        if (viewGroupT0.getTag(i10) == null) {
            viewGroupT0.setTag(i10, nVar);
        }
        ((androidx.fragment.app.n) viewGroupT0.getTag(i10)).setPopDirection(nVar.getPopDirection());
    }

    private void x1() {
        Iterator<b0> it = this.f4242c.k().iterator();
        while (it.hasNext()) {
            c1(it.next());
        }
    }

    private void y1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new i0("FragmentManager"));
        t<?> tVar = this.f4263x;
        try {
            if (tVar != null) {
                tVar.i("  ", null, printWriter, new String[0]);
            } else {
                X("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception e10) {
            Log.e("FragmentManager", "Failed dumping state", e10);
            throw runtimeException;
        }
    }

    private void z1() {
        synchronized (this.f4240a) {
            if (!this.f4240a.isEmpty()) {
                this.f4249j.j(true);
                if (J0(3)) {
                    Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                }
                return;
            }
            boolean z10 = q0() > 0 && O0(this.f4265z);
            if (J0(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
            }
            this.f4249j.j(z10);
        }
    }

    void A(Configuration configuration, boolean z10) {
        if (z10 && (this.f4263x instanceof e3.g)) {
            y1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null) {
                nVar.performConfigurationChanged(configuration);
                if (z10) {
                    nVar.mChildFragmentManager.A(configuration, true);
                }
            }
        }
    }

    public androidx.fragment.app.n A0() {
        return this.A;
    }

    boolean B(MenuItem menuItem) {
        if (this.f4262w < 1) {
            return false;
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null && nVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    m0 B0() {
        m0 m0Var = this.D;
        if (m0Var != null) {
            return m0Var;
        }
        androidx.fragment.app.n nVar = this.f4265z;
        return nVar != null ? nVar.mFragmentManager.B0() : this.E;
    }

    void C() {
        this.K = false;
        this.L = false;
        this.R.l(false);
        T(1);
    }

    public d.c C0() {
        return this.S;
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.f4262w < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.n> arrayList = null;
        boolean z10 = false;
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null && N0(nVar) && nVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(nVar);
                z10 = true;
            }
        }
        if (this.f4244e != null) {
            for (int i10 = 0; i10 < this.f4244e.size(); i10++) {
                androidx.fragment.app.n nVar2 = this.f4244e.get(i10);
                if (arrayList == null || !arrayList.contains(nVar2)) {
                    nVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4244e = arrayList;
        return z10;
    }

    void E() {
        this.M = true;
        b0(true);
        Y();
        t();
        T(-1);
        Object obj = this.f4263x;
        if (obj instanceof e3.h) {
            ((e3.h) obj).removeOnTrimMemoryListener(this.f4258s);
        }
        Object obj2 = this.f4263x;
        if (obj2 instanceof e3.g) {
            ((e3.g) obj2).removeOnConfigurationChangedListener(this.f4257r);
        }
        Object obj3 = this.f4263x;
        if (obj3 instanceof d3.x) {
            ((d3.x) obj3).removeOnMultiWindowModeChangedListener(this.f4259t);
        }
        Object obj4 = this.f4263x;
        if (obj4 instanceof d3.y) {
            ((d3.y) obj4).removeOnPictureInPictureModeChangedListener(this.f4260u);
        }
        Object obj5 = this.f4263x;
        if ((obj5 instanceof o3.k) && this.f4265z == null) {
            ((o3.k) obj5).removeMenuProvider(this.f4261v);
        }
        this.f4263x = null;
        this.f4264y = null;
        this.f4265z = null;
        if (this.f4246g != null) {
            this.f4249j.h();
            this.f4246g = null;
        }
        h.d<Intent> dVar = this.F;
        if (dVar != null) {
            dVar.c();
            this.G.c();
            this.H.c();
        }
    }

    androidx.lifecycle.z E0(androidx.fragment.app.n nVar) {
        return this.R.i(nVar);
    }

    void F() {
        T(1);
    }

    void F0() {
        b0(true);
        if (!V || this.f4247h == null) {
            if (this.f4249j.g()) {
                if (J0(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                e1();
                return;
            } else {
                if (J0(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                this.f4246g.l();
                return;
            }
        }
        if (!this.f4254o.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(o0(this.f4247h));
            for (m mVar : this.f4254o) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    mVar.a((androidx.fragment.app.n) it.next(), true);
                }
            }
        }
        Iterator<d0.a> it2 = this.f4247h.f3994c.iterator();
        while (it2.hasNext()) {
            androidx.fragment.app.n nVar = it2.next().f4012b;
            if (nVar != null) {
                nVar.mTransitioning = false;
            }
        }
        Iterator<l0> it3 = v(new ArrayList<>(Collections.singletonList(this.f4247h)), 0, 1).iterator();
        while (it3.hasNext()) {
            it3.next().f();
        }
        this.f4247h = null;
        z1();
        if (J0(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + this.f4249j.g() + " for  FragmentManager " + this);
        }
    }

    void G(boolean z10) {
        if (z10 && (this.f4263x instanceof e3.h)) {
            y1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null) {
                nVar.performLowMemory();
                if (z10) {
                    nVar.mChildFragmentManager.G(true);
                }
            }
        }
    }

    void G0(androidx.fragment.app.n nVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + nVar);
        }
        if (nVar.mHidden) {
            return;
        }
        nVar.mHidden = true;
        nVar.mHiddenChanged = true ^ nVar.mHiddenChanged;
        v1(nVar);
    }

    void H(boolean z10, boolean z11) {
        if (z11 && (this.f4263x instanceof d3.x)) {
            y1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null) {
                nVar.performMultiWindowModeChanged(z10);
                if (z11) {
                    nVar.mChildFragmentManager.H(z10, true);
                }
            }
        }
    }

    void H0(androidx.fragment.app.n nVar) {
        if (nVar.mAdded && K0(nVar)) {
            this.J = true;
        }
    }

    void I(androidx.fragment.app.n nVar) {
        Iterator<k4.o> it = this.f4256q.iterator();
        while (it.hasNext()) {
            it.next().a(this, nVar);
        }
    }

    public boolean I0() {
        return this.M;
    }

    void J() {
        for (androidx.fragment.app.n nVar : this.f4242c.l()) {
            if (nVar != null) {
                nVar.onHiddenChanged(nVar.isHidden());
                nVar.mChildFragmentManager.J();
            }
        }
    }

    boolean K(MenuItem menuItem) {
        if (this.f4262w < 1) {
            return false;
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null && nVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void L(Menu menu) {
        if (this.f4262w < 1) {
            return;
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null) {
                nVar.performOptionsMenuClosed(menu);
            }
        }
    }

    boolean M0(androidx.fragment.app.n nVar) {
        if (nVar == null) {
            return false;
        }
        return nVar.isHidden();
    }

    void N() {
        T(5);
    }

    boolean N0(androidx.fragment.app.n nVar) {
        if (nVar == null) {
            return true;
        }
        return nVar.isMenuVisible();
    }

    void O(boolean z10, boolean z11) {
        if (z11 && (this.f4263x instanceof d3.y)) {
            y1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null) {
                nVar.performPictureInPictureModeChanged(z10);
                if (z11) {
                    nVar.mChildFragmentManager.O(z10, true);
                }
            }
        }
    }

    boolean O0(androidx.fragment.app.n nVar) {
        if (nVar == null) {
            return true;
        }
        w wVar = nVar.mFragmentManager;
        return nVar.equals(wVar.A0()) && O0(wVar.f4265z);
    }

    boolean P(Menu menu) {
        boolean z10 = false;
        if (this.f4262w < 1) {
            return false;
        }
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null && N0(nVar) && nVar.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    boolean P0(int i10) {
        return this.f4262w >= i10;
    }

    void Q() {
        z1();
        M(this.A);
    }

    public boolean Q0() {
        return this.K || this.L;
    }

    void R() {
        this.K = false;
        this.L = false;
        this.R.l(false);
        T(7);
    }

    void S() {
        this.K = false;
        this.L = false;
        this.R.l(false);
        T(5);
    }

    void U() {
        this.L = true;
        this.R.l(true);
        T(4);
    }

    void V() {
        T(2);
    }

    void W0(androidx.fragment.app.n nVar, String[] strArr, int i10) {
        if (this.H == null) {
            this.f4263x.l(nVar, strArr, i10);
            return;
        }
        this.I.addLast(new l(nVar.mWho, i10));
        this.H.a(strArr);
    }

    public void X(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        this.f4242c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<androidx.fragment.app.n> arrayList = this.f4244e;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                androidx.fragment.app.n nVar = this.f4244e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(nVar.toString());
            }
        }
        int size2 = this.f4243d.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size2; i11++) {
                androidx.fragment.app.a aVar = this.f4243d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.p(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4250k.get());
        synchronized (this.f4240a) {
            int size3 = this.f4240a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    n nVar2 = this.f4240a.get(i12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(nVar2);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f4263x);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f4264y);
        if (this.f4265z != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4265z);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f4262w);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.M);
        if (this.J) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.J);
        }
    }

    void X0(androidx.fragment.app.n nVar, Intent intent, int i10, Bundle bundle) {
        if (this.F == null) {
            this.f4263x.n(nVar, intent, i10, bundle);
            return;
        }
        this.I.addLast(new l(nVar.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.F.a(intent);
    }

    void Y0(androidx.fragment.app.n nVar, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2;
        if (this.G == null) {
            this.f4263x.o(nVar, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (J0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + nVar);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        h.h hVarA = new h.a(intentSender).b(intent2).c(i12, i11).a();
        this.I.addLast(new l(nVar.mWho, i10));
        if (J0(2)) {
            Log.v("FragmentManager", "Fragment " + nVar + "is launching an IntentSender for result ");
        }
        this.G.a(hVarA);
    }

    void Z(n nVar, boolean z10) {
        if (!z10) {
            if (this.f4263x == null) {
                if (!this.M) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            r();
        }
        synchronized (this.f4240a) {
            if (this.f4263x == null) {
                if (!z10) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f4240a.add(nVar);
                r1();
            }
        }
    }

    void Z0(int i10, boolean z10) {
        t<?> tVar;
        if (this.f4263x == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f4262w) {
            this.f4262w = i10;
            this.f4242c.t();
            x1();
            if (this.J && (tVar = this.f4263x) != null && this.f4262w == 7) {
                tVar.p();
                this.J = false;
            }
        }
    }

    void a1() {
        if (this.f4263x == null) {
            return;
        }
        this.K = false;
        this.L = false;
        this.R.l(false);
        for (androidx.fragment.app.n nVar : this.f4242c.o()) {
            if (nVar != null) {
                nVar.noteStateNotSaved();
            }
        }
    }

    boolean b0(boolean z10) {
        a0(z10);
        boolean z11 = false;
        while (p0(this.O, this.P)) {
            this.f4241b = true;
            try {
                l1(this.O, this.P);
                s();
                z11 = true;
            } catch (Throwable th) {
                s();
                throw th;
            }
        }
        z1();
        W();
        this.f4242c.b();
        return z11;
    }

    void b1(q qVar) {
        View view;
        for (b0 b0Var : this.f4242c.k()) {
            androidx.fragment.app.n nVarK = b0Var.k();
            if (nVarK.mContainerId == qVar.getId() && (view = nVarK.mView) != null && view.getParent() == null) {
                nVarK.mContainer = qVar;
                b0Var.b();
            }
        }
    }

    void c0(n nVar, boolean z10) {
        if (z10 && (this.f4263x == null || this.M)) {
            return;
        }
        a0(z10);
        if (nVar.a(this.O, this.P)) {
            this.f4241b = true;
            try {
                l1(this.O, this.P);
            } finally {
                s();
            }
        }
        z1();
        W();
        this.f4242c.b();
    }

    void c1(b0 b0Var) {
        androidx.fragment.app.n nVarK = b0Var.k();
        if (nVarK.mDeferStart) {
            if (this.f4241b) {
                this.N = true;
            } else {
                nVarK.mDeferStart = false;
                b0Var.m();
            }
        }
    }

    void d1(int i10, int i11, boolean z10) {
        if (i10 >= 0) {
            Z(new o(null, i10, i11), z10);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public boolean e1() {
        return g1(null, -1, 0);
    }

    public boolean f0() {
        boolean zB0 = b0(true);
        n0();
        return zB0;
    }

    public boolean f1(int i10, int i11) {
        if (i10 >= 0) {
            return g1(null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    androidx.fragment.app.n g0(String str) {
        return this.f4242c.f(str);
    }

    void h(androidx.fragment.app.a aVar) {
        this.f4243d.add(aVar);
    }

    boolean h1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i10, int i11) {
        int iH0 = h0(str, i10, (i11 & 1) != 0);
        if (iH0 < 0) {
            return false;
        }
        for (int size = this.f4243d.size() - 1; size >= iH0; size--) {
            arrayList.add(this.f4243d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    b0 i(androidx.fragment.app.n nVar) {
        String str = nVar.mPreviousWho;
        if (str != null) {
            l4.d.h(nVar, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + nVar);
        }
        b0 b0VarW = w(nVar);
        nVar.mFragmentManager = this;
        this.f4242c.r(b0VarW);
        if (!nVar.mDetached) {
            this.f4242c.a(nVar);
            nVar.mRemoving = false;
            if (nVar.mView == null) {
                nVar.mHiddenChanged = false;
            }
            if (K0(nVar)) {
                this.J = true;
            }
        }
        return b0VarW;
    }

    public androidx.fragment.app.n i0(int i10) {
        return this.f4242c.g(i10);
    }

    boolean i1(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f4243d;
        androidx.fragment.app.a aVar = arrayList3.get(arrayList3.size() - 1);
        this.f4247h = aVar;
        Iterator<d0.a> it = aVar.f3994c.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.n nVar = it.next().f4012b;
            if (nVar != null) {
                nVar.mTransitioning = true;
            }
        }
        return h1(arrayList, arrayList2, null, -1, 0);
    }

    public void j(k4.o oVar) {
        this.f4256q.add(oVar);
    }

    public androidx.fragment.app.n j0(String str) {
        return this.f4242c.h(str);
    }

    void j1() {
        Z(new p(), false);
    }

    void k(androidx.fragment.app.n nVar) {
        this.R.a(nVar);
    }

    androidx.fragment.app.n k0(String str) {
        return this.f4242c.i(str);
    }

    void k1(androidx.fragment.app.n nVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + nVar + " nesting=" + nVar.mBackStackNesting);
        }
        boolean z10 = !nVar.isInBackStack();
        if (!nVar.mDetached || z10) {
            this.f4242c.u(nVar);
            if (K0(nVar)) {
                this.J = true;
            }
            nVar.mRemoving = true;
            v1(nVar);
        }
    }

    int l() {
        return this.f4250k.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m(androidx.fragment.app.t<?> r4, k4.i r5, androidx.fragment.app.n r6) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.m(androidx.fragment.app.t, k4.i, androidx.fragment.app.n):void");
    }

    void m1(androidx.fragment.app.n nVar) {
        this.R.k(nVar);
    }

    void n(androidx.fragment.app.n nVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + nVar);
        }
        if (nVar.mDetached) {
            nVar.mDetached = false;
            if (nVar.mAdded) {
                return;
            }
            this.f4242c.a(nVar);
            if (J0(2)) {
                Log.v("FragmentManager", "add from attach: " + nVar);
            }
            if (K0(nVar)) {
                this.J = true;
            }
        }
    }

    public d0 o() {
        return new androidx.fragment.app.a(this);
    }

    Set<androidx.fragment.app.n> o0(androidx.fragment.app.a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.f3994c.size(); i10++) {
            androidx.fragment.app.n nVar = aVar.f3994c.get(i10).f4012b;
            if (nVar != null && aVar.f4000i) {
                hashSet.add(nVar);
            }
        }
        return hashSet;
    }

    void o1(Parcelable parcelable) {
        b0 b0Var;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f4263x.f().getClassLoader());
                this.f4252m.put(str.substring(7), bundle2);
            }
        }
        HashMap<String, Bundle> map = new HashMap<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f4263x.f().getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        this.f4242c.x(map);
        y yVar = (y) bundle3.getParcelable("state");
        if (yVar == null) {
            return;
        }
        this.f4242c.v();
        Iterator<String> it = yVar.f4283a.iterator();
        while (it.hasNext()) {
            Bundle bundleB = this.f4242c.B(it.next(), null);
            if (bundleB != null) {
                androidx.fragment.app.n nVarE = this.R.e(((a0) bundleB.getParcelable("state")).f3948b);
                if (nVarE != null) {
                    if (J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + nVarE);
                    }
                    b0Var = new b0(this.f4255p, this.f4242c, nVarE, bundleB);
                } else {
                    b0Var = new b0(this.f4255p, this.f4242c, this.f4263x.f().getClassLoader(), u0(), bundleB);
                }
                androidx.fragment.app.n nVarK = b0Var.k();
                nVarK.mSavedFragmentState = bundleB;
                nVarK.mFragmentManager = this;
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + nVarK.mWho + "): " + nVarK);
                }
                b0Var.o(this.f4263x.f().getClassLoader());
                this.f4242c.r(b0Var);
                b0Var.s(this.f4262w);
            }
        }
        for (androidx.fragment.app.n nVar : this.R.h()) {
            if (!this.f4242c.c(nVar.mWho)) {
                if (J0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + nVar + " that was not found in the set of active Fragments " + yVar.f4283a);
                }
                this.R.k(nVar);
                nVar.mFragmentManager = this;
                b0 b0Var2 = new b0(this.f4255p, this.f4242c, nVar);
                b0Var2.s(1);
                b0Var2.m();
                nVar.mRemoving = true;
                b0Var2.m();
            }
        }
        this.f4242c.w(yVar.f4284b);
        if (yVar.f4285c != null) {
            this.f4243d = new ArrayList<>(yVar.f4285c.length);
            int i10 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = yVar.f4285c;
                if (i10 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarB = bVarArr[i10].b(this);
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i10 + " (index " + aVarB.f3945v + "): " + aVarB);
                    PrintWriter printWriter = new PrintWriter(new i0("FragmentManager"));
                    aVarB.q("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4243d.add(aVarB);
                i10++;
            }
        } else {
            this.f4243d = new ArrayList<>();
        }
        this.f4250k.set(yVar.f4286d);
        String str3 = yVar.f4287e;
        if (str3 != null) {
            androidx.fragment.app.n nVarG0 = g0(str3);
            this.A = nVarG0;
            M(nVarG0);
        }
        ArrayList<String> arrayList = yVar.f4288f;
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                this.f4251l.put(arrayList.get(i11), yVar.f4289g.get(i11));
            }
        }
        this.I = new ArrayDeque<>(yVar.f4290h);
    }

    void p() {
        androidx.fragment.app.a aVar = this.f4247h;
        if (aVar != null) {
            aVar.f3944u = false;
            aVar.f();
            f0();
            Iterator<m> it = this.f4254o.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
        }
    }

    boolean q() {
        boolean zK0 = false;
        for (androidx.fragment.app.n nVar : this.f4242c.l()) {
            if (nVar != null) {
                zK0 = K0(nVar);
            }
            if (zK0) {
                return true;
            }
        }
        return false;
    }

    public int q0() {
        return this.f4243d.size() + (this.f4247h != null ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
    public Bundle R0() {
        Bundle bundle = new Bundle();
        n0();
        Y();
        b0(true);
        this.K = true;
        this.R.l(true);
        ArrayList<String> arrayListY = this.f4242c.y();
        HashMap<String, Bundle> mapM = this.f4242c.m();
        if (!mapM.isEmpty()) {
            ArrayList<String> arrayListZ = this.f4242c.z();
            androidx.fragment.app.b[] bVarArr = null;
            int size = this.f4243d.size();
            if (size > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i10 = 0; i10 < size; i10++) {
                    bVarArr[i10] = new androidx.fragment.app.b(this.f4243d.get(i10));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i10 + ": " + this.f4243d.get(i10));
                    }
                }
            }
            y yVar = new y();
            yVar.f4283a = arrayListY;
            yVar.f4284b = arrayListZ;
            yVar.f4285c = bVarArr;
            yVar.f4286d = this.f4250k.get();
            androidx.fragment.app.n nVar = this.A;
            if (nVar != null) {
                yVar.f4287e = nVar.mWho;
            }
            yVar.f4288f.addAll(this.f4251l.keySet());
            yVar.f4289g.addAll(this.f4251l.values());
            yVar.f4290h = new ArrayList<>(this.I);
            bundle.putParcelable("state", yVar);
            for (String str : this.f4252m.keySet()) {
                bundle.putBundle("result_" + str, this.f4252m.get(str));
            }
            for (String str2 : mapM.keySet()) {
                bundle.putBundle("fragment_" + str2, mapM.get(str2));
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    void r1() {
        synchronized (this.f4240a) {
            boolean z10 = true;
            if (this.f4240a.size() != 1) {
                z10 = false;
            }
            if (z10) {
                this.f4263x.h().removeCallbacks(this.T);
                this.f4263x.h().post(this.T);
                z1();
            }
        }
    }

    k4.i s0() {
        return this.f4264y;
    }

    void s1(androidx.fragment.app.n nVar, boolean z10) {
        ViewGroup viewGroupT0 = t0(nVar);
        if (viewGroupT0 == null || !(viewGroupT0 instanceof q)) {
            return;
        }
        ((q) viewGroupT0).setDrawDisappearingViewsLast(!z10);
    }

    void t1(androidx.fragment.app.n nVar, g.b bVar) {
        if (nVar.equals(g0(nVar.mWho)) && (nVar.mHost == null || nVar.mFragmentManager == this)) {
            nVar.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.fragment.app.n nVar = this.f4265z;
        if (nVar != null) {
            sb2.append(nVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f4265z;
        } else {
            t<?> tVar = this.f4263x;
            if (tVar == null) {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
            sb2.append(tVar.getClass().getSimpleName());
            sb2.append("{");
            obj = this.f4263x;
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append("}");
        sb2.append("}}");
        return sb2.toString();
    }

    public s u0() {
        s sVar = this.B;
        if (sVar != null) {
            return sVar;
        }
        androidx.fragment.app.n nVar = this.f4265z;
        return nVar != null ? nVar.mFragmentManager.u0() : this.C;
    }

    void u1(androidx.fragment.app.n nVar) {
        if (nVar == null || (nVar.equals(g0(nVar.mWho)) && (nVar.mHost == null || nVar.mFragmentManager == this))) {
            androidx.fragment.app.n nVar2 = this.A;
            this.A = nVar;
            M(nVar2);
            M(this.A);
            return;
        }
        throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
    }

    Set<l0> v(ArrayList<androidx.fragment.app.a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<d0.a> it = arrayList.get(i10).f3994c.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.n nVar = it.next().f4012b;
                if (nVar != null && (viewGroup = nVar.mContainer) != null) {
                    hashSet.add(l0.u(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    public List<androidx.fragment.app.n> v0() {
        return this.f4242c.o();
    }

    b0 w(androidx.fragment.app.n nVar) {
        b0 b0VarN = this.f4242c.n(nVar.mWho);
        if (b0VarN != null) {
            return b0VarN;
        }
        b0 b0Var = new b0(this.f4255p, this.f4242c, nVar);
        b0Var.o(this.f4263x.f().getClassLoader());
        b0Var.s(this.f4262w);
        return b0Var;
    }

    public t<?> w0() {
        return this.f4263x;
    }

    void w1(androidx.fragment.app.n nVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + nVar);
        }
        if (nVar.mHidden) {
            nVar.mHidden = false;
            nVar.mHiddenChanged = !nVar.mHiddenChanged;
        }
    }

    void x(androidx.fragment.app.n nVar) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + nVar);
        }
        if (nVar.mDetached) {
            return;
        }
        nVar.mDetached = true;
        if (nVar.mAdded) {
            if (J0(2)) {
                Log.v("FragmentManager", "remove from detach: " + nVar);
            }
            this.f4242c.u(nVar);
            if (K0(nVar)) {
                this.J = true;
            }
            v1(nVar);
        }
    }

    LayoutInflater.Factory2 x0() {
        return this.f4245f;
    }

    void y() {
        this.K = false;
        this.L = false;
        this.R.l(false);
        T(4);
    }

    v y0() {
        return this.f4255p;
    }

    void z() {
        this.K = false;
        this.L = false;
        this.R.l(false);
        T(0);
    }

    androidx.fragment.app.n z0() {
        return this.f4265z;
    }
}
