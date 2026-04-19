package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class m extends n implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f4151a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4160j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Dialog f4162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4164n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f4165o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f4152b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DialogInterface.OnCancelListener f4153c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DialogInterface.OnDismissListener f4154d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4155e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4156f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f4157g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4158h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f4159i = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private o4.i<o4.e> f4161k = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4166p = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.f4154d.onDismiss(m.this.f4162l);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (m.this.f4162l != null) {
                m mVar = m.this;
                mVar.onCancel(mVar.f4162l);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (m.this.f4162l != null) {
                m mVar = m.this;
                mVar.onDismiss(mVar.f4162l);
            }
        }
    }

    class d implements o4.i<o4.e> {
        d() {
        }

        @Override // o4.i
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o4.e eVar) {
            if (eVar == null || !m.this.f4158h) {
                return;
            }
            View viewRequireView = m.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (m.this.f4162l != null) {
                if (w.J0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + m.this.f4162l);
                }
                m.this.f4162l.setContentView(viewRequireView);
            }
        }
    }

    class e extends k4.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k4.i f4171a;

        e(k4.i iVar) {
            this.f4171a = iVar;
        }

        @Override // k4.i
        public View c(int i10) {
            return this.f4171a.d() ? this.f4171a.c(i10) : m.this.M(i10);
        }

        @Override // k4.i
        public boolean d() {
            return this.f4171a.d() || m.this.N();
        }
    }

    private void J(boolean z10, boolean z11, boolean z12) {
        if (this.f4164n) {
            return;
        }
        this.f4164n = true;
        this.f4165o = false;
        Dialog dialog = this.f4162l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4162l.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f4151a.getLooper()) {
                    onDismiss(this.f4162l);
                } else {
                    this.f4151a.post(this.f4152b);
                }
            }
        }
        this.f4163m = true;
        if (this.f4159i >= 0) {
            if (z12) {
                getParentFragmentManager().f1(this.f4159i, 1);
            } else {
                getParentFragmentManager().d1(this.f4159i, 1, z10);
            }
            this.f4159i = -1;
            return;
        }
        d0 d0VarO = getParentFragmentManager().o();
        d0VarO.m(true);
        d0VarO.l(this);
        if (z12) {
            d0VarO.h();
        } else if (z10) {
            d0VarO.g();
        } else {
            d0VarO.f();
        }
    }

    private void O(Bundle bundle) {
        if (this.f4158h && !this.f4166p) {
            try {
                this.f4160j = true;
                Dialog dialogL = L(bundle);
                this.f4162l = dialogL;
                if (this.f4158h) {
                    Q(dialogL, this.f4155e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f4162l.setOwnerActivity((Activity) context);
                    }
                    this.f4162l.setCancelable(this.f4157g);
                    this.f4162l.setOnCancelListener(this.f4153c);
                    this.f4162l.setOnDismissListener(this.f4154d);
                    this.f4166p = true;
                } else {
                    this.f4162l = null;
                }
            } finally {
                this.f4160j = false;
            }
        }
    }

    public int K() {
        return this.f4156f;
    }

    public Dialog L(Bundle bundle) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new e.m(requireContext(), K());
    }

    View M(int i10) {
        Dialog dialog = this.f4162l;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean N() {
        return this.f4166p;
    }

    public void P(boolean z10) {
        this.f4158h = z10;
    }

    public void Q(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void R(w wVar, String str) {
        this.f4164n = false;
        this.f4165o = true;
        d0 d0VarO = wVar.o();
        d0VarO.m(true);
        d0VarO.d(this, str);
        d0VarO.f();
    }

    @Override // androidx.fragment.app.n
    k4.i createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.n
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.n
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.f4161k);
        if (this.f4165o) {
            return;
        }
        this.f4164n = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.n
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4151a = new Handler();
        this.f4158h = this.mContainerId == 0;
        if (bundle != null) {
            this.f4155e = bundle.getInt("android:style", 0);
            this.f4156f = bundle.getInt("android:theme", 0);
            this.f4157g = bundle.getBoolean("android:cancelable", true);
            this.f4158h = bundle.getBoolean("android:showsDialog", this.f4158h);
            this.f4159i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.n
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f4162l;
        if (dialog != null) {
            this.f4163m = true;
            dialog.setOnDismissListener(null);
            this.f4162l.dismiss();
            if (!this.f4164n) {
                onDismiss(this.f4162l);
            }
            this.f4162l = null;
            this.f4166p = false;
        }
    }

    @Override // androidx.fragment.app.n
    public void onDetach() {
        super.onDetach();
        if (!this.f4165o && !this.f4164n) {
            this.f4164n = true;
        }
        getViewLifecycleOwnerLiveData().m(this.f4161k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f4163m) {
            return;
        }
        if (w.J0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        J(true, true, false);
    }

    @Override // androidx.fragment.app.n
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        StringBuilder sb2;
        String str;
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f4158h && !this.f4160j) {
            O(bundle);
            if (w.J0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4162l;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (w.J0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f4158h) {
                sb2 = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb2 = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb2.append(str);
            sb2.append(str2);
            Log.d("FragmentManager", sb2.toString());
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.n
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f4162l;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f4155e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f4156f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f4157g;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f4158h;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f4159i;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.n
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f4162l;
        if (dialog != null) {
            this.f4163m = false;
            dialog.show();
            View decorView = this.f4162l.getWindow().getDecorView();
            o4.r.b(decorView, this);
            o4.s.b(decorView, this);
            x4.g.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.n
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f4162l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.n
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f4162l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4162l.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.n
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f4162l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f4162l.onRestoreInstanceState(bundle2);
    }
}
