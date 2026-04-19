package dc;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class h extends androidx.fragment.app.o implements f, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9999b = View.generateViewId();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f10000a;

    private void J() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    private void K() {
        if (O() == d.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View M() {
        FrameLayout frameLayoutR = R(this);
        frameLayoutR.setId(f9999b);
        frameLayoutR.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayoutR;
    }

    private void N() {
        if (this.f10000a == null) {
            this.f10000a = S();
        }
        if (this.f10000a == null) {
            this.f10000a = L();
            getSupportFragmentManager().o().b(f9999b, this.f10000a, "flutter_fragment").f();
        }
    }

    private boolean Q() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private void T() {
        try {
            Bundle bundleP = P();
            if (bundleP != null) {
                int i10 = bundleP.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i10 != -1) {
                    setTheme(i10);
                }
            } else {
                cc.b.f("FlutterFragmentActivity", "Using the launch theme as normal theme.");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            cc.b.b("FlutterFragmentActivity", "Could not read meta-data for FlutterFragmentActivity. Using the launch theme as normal theme.");
        }
    }

    protected v B() {
        return O() == d.opaque ? v.surface : v.texture;
    }

    protected g L() {
        d dVarO = O();
        v vVarB = B();
        w wVar = dVarO == d.opaque ? w.opaque : w.transparent;
        boolean z10 = vVarB == v.surface;
        if (k() != null) {
            cc.b.f("FlutterFragmentActivity", "Creating FlutterFragment with cached engine:\nCached engine ID: " + k() + "\nWill destroy engine when Activity is destroyed: " + w() + "\nBackground transparency mode: " + dVarO + "\nWill attach FlutterEngine to Activity: " + v());
            return g.P(k()).e(vVarB).i(wVar).d(Boolean.valueOf(p())).f(v()).c(w()).h(z10).g(true).a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creating FlutterFragment with new engine:\nCached engine group ID: ");
        sb2.append(t());
        sb2.append("\nBackground transparency mode: ");
        sb2.append(dVarO);
        sb2.append("\nDart entrypoint: ");
        sb2.append(m());
        sb2.append("\nDart entrypoint library uri: ");
        sb2.append(y() != null ? y() : "\"\"");
        sb2.append("\nInitial route: ");
        sb2.append(u());
        sb2.append("\nApp bundle path: ");
        sb2.append(z());
        sb2.append("\nWill attach FlutterEngine to Activity: ");
        sb2.append(v());
        cc.b.f("FlutterFragmentActivity", sb2.toString());
        return t() != null ? g.R(t()).c(m()).e(u()).d(p()).f(vVarB).j(wVar).g(v()).i(z10).h(true).a() : g.Q().d(m()).f(y()).e(i()).i(u()).a(z()).g(ec.d.a(getIntent())).h(Boolean.valueOf(p())).j(vVarB).n(wVar).k(v()).m(z10).l(true).b();
    }

    protected d O() {
        return getIntent().hasExtra("background_mode") ? d.valueOf(getIntent().getStringExtra("background_mode")) : d.opaque;
    }

    protected Bundle P() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    protected FrameLayout R(Context context) {
        return new FrameLayout(context);
    }

    g S() {
        return (g) getSupportFragmentManager().j0("flutter_fragment");
    }

    @Override // dc.f
    public io.flutter.embedding.engine.a d(Context context) {
        return null;
    }

    @Override // dc.e
    public void g(io.flutter.embedding.engine.a aVar) {
        g gVar = this.f10000a;
        if (gVar == null || !gVar.I()) {
            pc.a.a(aVar);
        }
    }

    @Override // dc.e
    public void h(io.flutter.embedding.engine.a aVar) {
    }

    public List<String> i() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    protected String k() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public String m() {
        try {
            Bundle bundleP = P();
            String string = bundleP != null ? bundleP.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f10000a.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, androidx.core.app.e, android.app.Activity
    protected void onCreate(Bundle bundle) {
        T();
        this.f10000a = S();
        super.onCreate(bundle);
        K();
        setContentView(M());
        J();
        N();
    }

    @Override // androidx.activity.a, android.app.Activity
    protected void onNewIntent(Intent intent) {
        this.f10000a.K(intent);
        super.onNewIntent(intent);
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f10000a.L();
    }

    @Override // androidx.fragment.app.o, androidx.activity.a, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        this.f10000a.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // androidx.activity.a, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        this.f10000a.onTrimMemory(i10);
    }

    @Override // androidx.activity.a, android.app.Activity
    public void onUserLeaveHint() {
        this.f10000a.M();
    }

    protected boolean p() {
        try {
            Bundle bundleP = P();
            if (bundleP != null) {
                return bundleP.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    protected String t() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    protected String u() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle bundleP = P();
            if (bundleP != null) {
                return bundleP.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    protected boolean v() {
        return true;
    }

    public boolean w() {
        return getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }

    public String y() {
        try {
            Bundle bundleP = P();
            if (bundleP != null) {
                return bundleP.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    protected String z() {
        String dataString;
        if (Q() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }
}
