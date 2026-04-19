package v8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends androidx.fragment.app.n implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f22267d = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22268a = Collections.synchronizedMap(new z.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22269b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f22270c;

    public static n0 I(androidx.fragment.app.o oVar) {
        n0 n0Var;
        WeakHashMap weakHashMap = f22267d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(oVar);
        if (weakReference != null && (n0Var = (n0) weakReference.get()) != null) {
            return n0Var;
        }
        try {
            n0 n0Var2 = (n0) oVar.getSupportFragmentManager().j0("SupportLifecycleFragmentImpl");
            if (n0Var2 == null || n0Var2.isRemoving()) {
                n0Var2 = new n0();
                oVar.getSupportFragmentManager().o().d(n0Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(oVar, new WeakReference(n0Var2));
            return n0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.n
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f22268a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // v8.f
    public final void j(String str, LifecycleCallback lifecycleCallback) {
        if (this.f22268a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f22268a.put(str, lifecycleCallback);
        if (this.f22269b > 0) {
            new zzi(Looper.getMainLooper()).post(new m0(this, lifecycleCallback, str));
        }
    }

    @Override // androidx.fragment.app.n
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f22268a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // androidx.fragment.app.n
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22269b = 1;
        this.f22270c = bundle;
        for (Map.Entry entry : this.f22268a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.n
    public final void onDestroy() {
        super.onDestroy();
        this.f22269b = 5;
        Iterator it = this.f22268a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.n
    public final void onResume() {
        super.onResume();
        this.f22269b = 3;
        Iterator it = this.f22268a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.n
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f22268a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.n
    public final void onStart() {
        super.onStart();
        this.f22269b = 2;
        Iterator it = this.f22268a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.n
    public final void onStop() {
        super.onStop();
        this.f22269b = 4;
        Iterator it = this.f22268a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    @Override // v8.f
    public final <T extends LifecycleCallback> T r(String str, Class<T> cls) {
        return cls.cast(this.f22268a.get(str));
    }

    @Override // v8.f
    public final /* synthetic */ Activity s() {
        return getActivity();
    }
}
