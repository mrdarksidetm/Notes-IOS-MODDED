package v8;

import android.app.Activity;
import android.app.Fragment;
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
public final class l0 extends Fragment implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap f22260d = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f22261a = Collections.synchronizedMap(new z.a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22262b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f22263c;

    public static l0 c(Activity activity) {
        l0 l0Var;
        WeakHashMap weakHashMap = f22260d;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (l0Var = (l0) weakReference.get()) != null) {
            return l0Var;
        }
        try {
            l0 l0Var2 = (l0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (l0Var2 == null || l0Var2.isRemoving()) {
                l0Var2 = new l0();
                activity.getFragmentManager().beginTransaction().add(l0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(l0Var2));
            return l0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f22261a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // v8.f
    public final void j(String str, LifecycleCallback lifecycleCallback) {
        if (this.f22261a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f22261a.put(str, lifecycleCallback);
        if (this.f22262b > 0) {
            new zzi(Looper.getMainLooper()).post(new k0(this, lifecycleCallback, str));
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f22261a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f22262b = 1;
        this.f22263c = bundle;
        for (Map.Entry entry : this.f22261a.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f22262b = 5;
        Iterator it = this.f22261a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f22262b = 3;
        Iterator it = this.f22261a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f22261a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f22262b = 2;
        Iterator it = this.f22261a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f22262b = 4;
        Iterator it = this.f22261a.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    @Override // v8.f
    public final <T extends LifecycleCallback> T r(String str, Class<T> cls) {
        return cls.cast(this.f22261a.get(str));
    }

    @Override // v8.f
    public final Activity s() {
        return getActivity();
    }
}
