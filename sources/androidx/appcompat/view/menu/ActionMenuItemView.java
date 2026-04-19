package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.z;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends z implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    g f1139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f1140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f1141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    e.b f1142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private e0 f1143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    b f1144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f1145n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f1146o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f1147p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f1148q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f1149r;

    private class a extends e0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.e0
        public q.e b() {
            b bVar = ActionMenuItemView.this.f1144m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.e0
        protected boolean c() {
            q.e eVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f1142k;
            return bVar != null && bVar.a(actionMenuItemView.f1139h) && (eVarB = b()) != null && eVarB.a();
        }
    }

    public static abstract class b {
        public abstract q.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f1145n = s();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.j.f13577v, i10, 0);
        this.f1147p = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.j.f13582w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f1149r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1148q = -1;
        setSaveEnabled(false);
    }

    private boolean s() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void t() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1140i);
        if (this.f1141j != null && (!this.f1139h.B() || (!this.f1145n && !this.f1146o))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f1140i : null);
        CharSequence contentDescription = this.f1139h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.f1139h.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f1139h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            t0.a(this, z12 ? null : this.f1139h.getTitle());
        } else {
            t0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return r();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return r() && this.f1139h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i10) {
        this.f1139h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f1143l == null) {
            this.f1143l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f1139h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f1142k;
        if (bVar != null) {
            bVar.a(this.f1139h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1145n = s();
        t();
    }

    @Override // androidx.appcompat.widget.z, android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean zR = r();
        if (zR && (i12 = this.f1148q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f1147p) : this.f1147p;
        if (mode != 1073741824 && this.f1147p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zR || this.f1141j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1141j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        if (this.f1139h.hasSubMenu() && (e0Var = this.f1143l) != null && e0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean r() {
        return !TextUtils.isEmpty(getText());
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f1146o != z10) {
            this.f1146o = z10;
            g gVar = this.f1139h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1141j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f1149r;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        t();
    }

    public void setItemInvoker(e.b bVar) {
        this.f1142k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f1148q = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f1144m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1140i = charSequence;
        t();
    }
}
