package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import j.i;

/* JADX INFO: loaded from: classes.dex */
public class a extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f1132f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f1134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f1135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f1136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f1137e;

    /* JADX INFO: renamed from: androidx.appcompat.view.a$a, reason: collision with other inner class name */
    static class C0027a {
        static Context a(a aVar, Configuration configuration) {
            return aVar.createConfigurationContext(configuration);
        }
    }

    public a() {
        super(null);
    }

    public a(Context context, int i10) {
        super(context);
        this.f1133a = i10;
    }

    public a(Context context, Resources.Theme theme) {
        super(context);
        this.f1134b = theme;
    }

    private Resources b() {
        if (this.f1137e == null) {
            Configuration configuration = this.f1136d;
            this.f1137e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : C0027a.a(this, this.f1136d).getResources();
        }
        return this.f1137e;
    }

    private void d() {
        boolean z10 = this.f1134b == null;
        if (z10) {
            this.f1134b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1134b.setTo(theme);
            }
        }
        f(this.f1134b, this.f1133a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f1132f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f1132f = configuration2;
        }
        return configuration.equals(f1132f);
    }

    public void a(Configuration configuration) {
        if (this.f1137e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1136d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1136d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f1133a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1135c == null) {
            this.f1135c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1135c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1134b;
        if (theme != null) {
            return theme;
        }
        if (this.f1133a == 0) {
            this.f1133a = i.f13471e;
        }
        d();
        return this.f1134b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f1133a != i10) {
            this.f1133a = i10;
            d();
        }
    }
}
