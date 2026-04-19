package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f1928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f1929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f1931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f1932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f1933g;

    x0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1930d = layoutParams;
        this.f1931e = new Rect();
        this.f1932f = new int[2];
        this.f1933g = new int[2];
        this.f1927a = context;
        View viewInflate = LayoutInflater.from(context).inflate(j.g.f13451s, (ViewGroup) null);
        this.f1928b = viewInflate;
        this.f1929c = (TextView) viewInflate.findViewById(j.f.f13425s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = j.i.f13467a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1927a.getResources().getDimensionPixelOffset(j.d.f13378m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1927a.getResources().getDimensionPixelOffset(j.d.f13377l);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1927a.getResources().getDimensionPixelOffset(z10 ? j.d.f13380o : j.d.f13379n);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f1931e);
        Rect rect = this.f1931e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1927a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1931e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.f1933g);
        view.getLocationOnScreen(this.f1932f);
        int[] iArr = this.f1932f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1933g;
        int i14 = i13 - iArr2[0];
        iArr[0] = i14;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i14 + i10) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1928b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1928b.getMeasuredHeight();
        int i15 = this.f1932f[1];
        int i16 = ((i12 + i15) - dimensionPixelOffset3) - measuredHeight;
        int i17 = i15 + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i17 <= this.f1931e.height() : i16 < 0) {
            layoutParams.y = i16;
        } else {
            layoutParams.y = i17;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f1927a.getSystemService("window")).removeView(this.f1928b);
        }
    }

    boolean d() {
        return this.f1928b.getParent() != null;
    }

    void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1929c.setText(charSequence);
        a(view, i10, i11, z10, this.f1930d);
        ((WindowManager) this.f1927a.getSystemService("window")).addView(this.f1928b, this.f1930d);
    }
}
