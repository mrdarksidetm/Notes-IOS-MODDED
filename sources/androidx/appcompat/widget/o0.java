package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1831c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList<WeakReference<o0>> f1832d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f1833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1834b;

    private o0(Context context) {
        super(context);
        if (!y0.c()) {
            this.f1833a = new q0(this, context.getResources());
            this.f1834b = null;
            return;
        }
        y0 y0Var = new y0(this, context.getResources());
        this.f1833a = y0Var;
        Resources.Theme themeNewTheme = y0Var.newTheme();
        this.f1834b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof o0) || (context.getResources() instanceof q0) || (context.getResources() instanceof y0) || !y0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1831c) {
            ArrayList<WeakReference<o0>> arrayList = f1832d;
            if (arrayList == null) {
                f1832d = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<o0> weakReference = f1832d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1832d.remove(size);
                    }
                }
                for (int size2 = f1832d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<o0> weakReference2 = f1832d.get(size2);
                    o0 o0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (o0Var != null && o0Var.getBaseContext() == context) {
                        return o0Var;
                    }
                }
            }
            o0 o0Var2 = new o0(context);
            f1832d.add(new WeakReference<>(o0Var2));
            return o0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1833a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1833a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1834b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1834b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
